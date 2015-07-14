package com.chazwarp.unifieditems.world;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;

import com.chazwarp.unifieditems.blocks.ModBlocks;
import com.chazwarp.unifieditems.lib.OreGen;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class WorldGenHandler implements IWorldGenerator {

	private WorldGenerator copperGen;
	private WorldGenerator tinGen;
	private WorldGenerator silverGen;
	private WorldGenerator leadGen;

	public WorldGenHandler() {
		GameRegistry.registerWorldGenerator(this, 0);
		copperGen = new WorldGenMinable(ModBlocks.oreCopper, OreGen.COPPER_VEIN);
		tinGen = new WorldGenMinable(ModBlocks.oreTin, OreGen.TIN_VEIN);
		silverGen = new WorldGenMinable(ModBlocks.oreSilver, OreGen.SILVER_VEIN);
		leadGen = new WorldGenMinable(ModBlocks.oreLead, OreGen.LEAD_VEIN);
	}

	private void generateStandardOre(Random rand, int chunkX, int chunkZ,
			World world, int iterations, WorldGenerator gen, int LowestY,
			int HighestY) {
		for (int i = 0; i < iterations; i++) {
			int x = chunkX * 16 + rand.nextInt(16);
			int y = rand.nextInt(HighestY - LowestY) + LowestY;
			int z = chunkZ * 16 + rand.nextInt(16);

			gen.generate(world, rand, x, y, z);
		}
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		generateStandardOre(random, chunkX, chunkZ, world, OreGen.COPPER_CHUNK,
				copperGen, 40, 75);
		generateStandardOre(random, chunkX, chunkZ, world, OreGen.TIN_CHUNK,
				tinGen, 20, 55);
		generateStandardOre(random, chunkX, chunkZ, world, OreGen.SILVER_CHUNK,
				silverGen, 5, 30);
		generateStandardOre(random, chunkX, chunkZ, world, OreGen.LEAD_CHUNK,
				leadGen, 10, 35);
	}
}