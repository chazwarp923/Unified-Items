package com.chazwarp.unifieditems.blocks;

import net.minecraft.block.Block;

import com.chazwarp.unifieditems.lib.BlockInfo;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Blocks {

public static Block oreCopper;
	
	public static void initCopper() {
		oreCopper = new BlockCopperOre(BlockInfo.COPPER_ORE_ID);
		GameRegistry.registerBlock(oreCopper, BlockInfo.COPPER_ORE_KEY);
	}
	
	public static void addCopperName() {
		LanguageRegistry.addName(oreCopper, BlockInfo.COPPER_ORE_UNLOCALIZED_NAME);
	}
	
public static Block oreTin;

	public static void initTin() {
		oreTin = new BlockTinOre(BlockInfo.TIN_ORE_ID);
		GameRegistry.registerBlock(oreTin, BlockInfo.TIN_ORE_KEY);
	}	
	
	public static void addTinName() {
		LanguageRegistry.addName(oreTin, BlockInfo.TIN_ORE_UNLOCALIZED_NAME);
	}

public static Block saplingRubber;

	public static void initSapling() {
		saplingRubber = new BlockRubberSapling(BlockInfo.RUBBER_SAPLING_ID);
		GameRegistry.registerBlock(saplingRubber, BlockInfo.RUBBER_SAPLING_KEY);
	}
	
	public static void addSaplingName() {
		LanguageRegistry.addName(saplingRubber, BlockInfo.RUBBER_SAPLING_UNLOCALIZED_NAME);	
	}	
		
public static Block woodRubber;

	public static void initLog() {
		woodRubber = new BlockRubberWood(BlockInfo.RUBBER_WOOD_ID);
		GameRegistry.registerBlock(woodRubber, BlockInfo.RUBBER_WOOD_KEY);
	}
	
	public static void addLogName() {
		LanguageRegistry.addName(woodRubber, BlockInfo.RUBBER_WOOD_UNLOCALIZED_NAME);
	}
	
public static Block leavesRubber;

	public static void initLeaves() {
		leavesRubber = new BlockRubberLeaves(BlockInfo.RUBBER_LEAVES_ID);
		GameRegistry.registerBlock(leavesRubber, BlockInfo.RUBBER_LEAVES_KEY);
	}
	
	public static void addLeavesName() {
		LanguageRegistry.addName(leavesRubber, BlockInfo.RUBBER_LEAVES_UNLOCALIZED_NAME);
	}
	
}
