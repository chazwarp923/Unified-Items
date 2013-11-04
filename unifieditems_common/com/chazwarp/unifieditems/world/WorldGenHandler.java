package com.chazwarp.unifieditems.world;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;

import com.chazwarp.unifieditems.blocks.Blocks;
import com.chazwarp.unifieditems.lib.OreGen;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class WorldGenHandler implements IWorldGenerator {

	private WorldGenerator copperGen;
	private WorldGenerator tinGen;
	private WorldGenerator silverGen;
	private WorldGenerator leadGen;
	
	public WorldGenHandler() {
		GameRegistry.registerWorldGenerator(this);
		copperGen = new WorldGenMinable(Blocks.oreCopper.blockID, OreGen.COPPER_RATE);
		tinGen = new WorldGenMinable(Blocks.oreTin.blockID, OreGen.TIN_RATE);
		silverGen = new WorldGenMinable(Blocks.oreSilver.blockID, OreGen.SILVER_RATE);
		leadGen = new WorldGenMinable(Blocks.oreLead.blockID, OreGen.LEAD_RATE);
	}	
		
	private void generateStandardOre(Random rand, int chunkX, int chunkZ, World world, int iterations, WorldGenerator gen, int LowestY, int HighestY){
		for(int i = 0; i < iterations; i++) {
			int x = chunkX * 16 + rand.nextInt(16);
			int y = rand.nextInt(HighestY - LowestY) + LowestY;
			int z = chunkZ * 16 + rand.nextInt(16);
			
			gen.generate(world, rand, x, y, z);
		}
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		generateStandardOre(random, chunkX, chunkZ, world, 12, copperGen, 35, 70);
		generateStandardOre(random, chunkX, chunkZ, world, 12, tinGen, 35, 70);
		generateStandardOre(random, chunkX, chunkZ, world, 8, silverGen, 1, 35);
		generateStandardOre(random, chunkX, chunkZ, world, 8, leadGen, 1, 35);
	}

}
