package com.chazwarp.unifieditems.world;

import java.util.Random;

import com.chazwarp.unifieditems.lib.OreGen;

import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenerationHandler implements IWorldGenerator {

	private WorldGenerator copperGen;
	private WorldGenerator tinGen;
	private WorldGenerator silverGen;
	private WorldGenerator leadGen;

	public WorldGenerationHandler() {
		GameRegistry.registerWorldGenerator(this, 0);
		//copperGen = new WorldGenMinable(UIBlocks.oreCopper, OreGen.COPPER_VEIN);
	}

	private void generateStandardOre(Random rand, int chunkX, int chunkZ, World world, int iterations, WorldGenerator gen, int LowestY, int HighestY) {
		for (int i = 0; i < iterations; i++) {
			int x = chunkX * 16 + rand.nextInt(16);
			int y = rand.nextInt(HighestY - LowestY) + LowestY;
			int z = chunkZ * 16 + rand.nextInt(16);

			BlockPos pos = new BlockPos(x, y, z);
			
			gen.generate(world, rand, pos);
		}
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		generateStandardOre(random, chunkX, chunkZ, world, OreGen.COPPER_CHUNK, copperGen, 40, 75);
		generateStandardOre(random, chunkX, chunkZ, world, OreGen.TIN_CHUNK, tinGen, 20, 55);
		generateStandardOre(random, chunkX, chunkZ, world, OreGen.SILVER_CHUNK, silverGen, 5, 30);
		generateStandardOre(random, chunkX, chunkZ, world, OreGen.LEAD_CHUNK, leadGen, 10, 35);
	}
}