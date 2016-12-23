package tech.chazwarp923.unifieditems.world;

import java.util.Map;
import java.util.Random;

import org.apache.logging.log4j.Level;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import tech.chazwarp923.unifieditems.UnifiedItems;
import tech.chazwarp923.unifieditems.block.UIBlockOre;
import tech.chazwarp923.unifieditems.block.UIBlocks;
import tech.chazwarp923.unifieditems.config.ConfigHandler;
import tech.chazwarp923.unifieditems.material.Material;
import tech.chazwarp923.unifieditems.material.MaterialRegistry;

public class WorldGenerationHandler implements IWorldGenerator {

	private WorldGenerator worldGen;
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		for(Map.Entry<Material, UIBlockOre> ore : UIBlocks.ores.entrySet()) {
			Material material = ore.getKey();
			if(material.dimId == 0) {
				if(ConfigHandler.veinSizeOverride.get(material) != -1) {
					worldGen = new WorldGenMinable(ore.getValue().getDefaultState(), ConfigHandler.veinSizeOverride.get(material));
				}
				else {
					worldGen = new WorldGenMinable(ore.getValue().getDefaultState(), material.veinSize + MaterialRegistry.getUseCount(material));
				}
				generateOre(random, chunkX, chunkZ, world, ConfigHandler.chunkDensity.get(material), worldGen, ConfigHandler.minY.get(material), ConfigHandler.maxY.get(material));
			}
		}
	}
	
	private void generateOre(Random rand, int chunkX, int chunkZ, World world, int iterations, WorldGenerator gen, int LowestY, int HighestY) {
		for (int i = 0; i < iterations; i++) {
			int x = chunkX * 16 + rand.nextInt(16);
			int y = rand.nextInt(HighestY - LowestY) + LowestY;
			int z = chunkZ * 16 + rand.nextInt(16);
			
			gen.generate(world, rand, new BlockPos(x, y, z));
		}
	}
}
