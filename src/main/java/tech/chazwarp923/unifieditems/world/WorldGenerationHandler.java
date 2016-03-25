package tech.chazwarp923.unifieditems.world;

import java.util.Random;

import tech.chazwarp923.unifieditems.lib.OreGen;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenerationHandler implements IWorldGenerator {

	private WorldGenerator copperGen;
	private WorldGenerator tinGen;
	private WorldGenerator silverGen;
	private WorldGenerator leadGen;

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		generateOre(random, chunkX, chunkZ, world, OreGen.COPPER_CHUNK, copperGen, 40, 75);
		generateOre(random, chunkX, chunkZ, world, OreGen.TIN_CHUNK, tinGen, 20, 55);
		generateOre(random, chunkX, chunkZ, world, OreGen.SILVER_CHUNK, silverGen, 5, 30);
		generateOre(random, chunkX, chunkZ, world, OreGen.LEAD_CHUNK, leadGen, 10, 35);
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