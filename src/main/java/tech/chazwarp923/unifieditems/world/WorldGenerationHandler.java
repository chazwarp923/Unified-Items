package tech.chazwarp923.unifieditems.world;

import java.util.Map;
import java.util.Random;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import tech.chazwarp923.unifieditems.block.UIBlockOre;
import tech.chazwarp923.unifieditems.block.UIBlocks;
import tech.chazwarp923.unifieditems.material.MaterialRegistry;

public class WorldGenerationHandler implements IWorldGenerator {

	private WorldGenerator worldGen;
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		for(Map.Entry<String, UIBlockOre> block : UIBlocks.ores.entrySet()) {
			MaterialRegistry material = stringToMaterial(block.getKey());
			if(material.dimId == 0) {
				worldGen = new WorldGenMinable(block.getValue().getDefaultState(), material.perVein);
				generateOre(random, chunkX, chunkZ, world, material.chunkDensity, worldGen, material.minY, material.maxY);
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
	
	private MaterialRegistry stringToMaterial(String s) {
		switch(s) {
			case "Copper":
				return MaterialRegistry.COPPER;
			case "Tin":
				return MaterialRegistry.TIN;
			case "Silver":
				return MaterialRegistry.SILVER;
			case "Lead":
				return MaterialRegistry.LEAD;
			case "Nickel":
				return MaterialRegistry.NICKEL;
			case "Platinum":
				return MaterialRegistry.PLATINUM;
			case "Mithril":
				return MaterialRegistry.MITHRIL;
			case "Aluminum":
				return MaterialRegistry.ALUMINUM;
			case "Uranium":
				return MaterialRegistry.URANIUM;
			case "Cobalt":
				return MaterialRegistry.COBALT;
			case "Ardite":
				return MaterialRegistry.ARDITE;
			case "Iridium":
				return MaterialRegistry.IRIDIUM;
			default:
				return null;
		}
	}
}