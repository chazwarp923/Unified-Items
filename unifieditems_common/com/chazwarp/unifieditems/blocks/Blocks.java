package com.chazwarp.unifieditems.blocks;

import net.minecraft.block.Block;

import com.chazwarp.unifieditems.lib.BlockInfo;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Blocks {

public static Block oreCopper;
	
	public static void initOreCopper() {
		oreCopper = new BlockCopperOre(BlockInfo.COPPER_ORE_ID);
		GameRegistry.registerBlock(oreCopper, BlockInfo.COPPER_ORE_KEY);
	}
	
	public static void addOreCopperName() {
		LanguageRegistry.addName(oreCopper, BlockInfo.COPPER_ORE_UNLOCALIZED_NAME);
	}
	
public static Block blockCopper;
	
	public static void initCopper() {
		blockCopper = new BlockCopper(BlockInfo.COPPER_ID);
		GameRegistry.registerBlock(blockCopper, BlockInfo.COPPER_KEY);
	}
	
	public static void addCopperName() {
		LanguageRegistry.addName(blockCopper, BlockInfo.COPPER_UNLOCALIZED_NAME);
	}
	
public static Block oreTin;

	public static void initOreTin() {
		oreTin = new BlockTinOre(BlockInfo.TIN_ORE_ID);
		GameRegistry.registerBlock(oreTin, BlockInfo.TIN_ORE_KEY);
	}	
	
	public static void addOreTinName() {
		LanguageRegistry.addName(oreTin, BlockInfo.TIN_ORE_UNLOCALIZED_NAME);
	}

public static Block blockTin;
	
	public static void initTin() {
		blockTin = new BlockTin(BlockInfo.TIN_ID);
		GameRegistry.registerBlock(blockTin, BlockInfo.TIN_KEY);
	}
	
	public static void addTinName() {
		LanguageRegistry.addName(blockTin, BlockInfo.TIN_UNLOCALIZED_NAME);
	}	
	
public static Block blockBronze;
	
	public static void initBronze() {
		blockBronze = new BlockBronze(BlockInfo.BRONZE_ID);
		GameRegistry.registerBlock(blockBronze, BlockInfo.BRONZE_KEY);
	}
	
	public static void addBronzeName() {
		LanguageRegistry.addName(blockBronze, BlockInfo.BRONZE_UNLOCALIZED_NAME);
	}	
	
public static Block oreSilver;

	public static void initOreSilver() {
		oreSilver = new BlockSilverOre(BlockInfo.SILVER_ORE_ID);
		GameRegistry.registerBlock(oreSilver, BlockInfo.SILVER_ORE_KEY);
	}	
	
	public static void addOreSilverName() {
		LanguageRegistry.addName(oreSilver, BlockInfo.SILVER_ORE_UNLOCALIZED_NAME);
	}

public static Block blockSilver;
	
	public static void initSilver() {
		blockSilver = new BlockSilver(BlockInfo.SILVER_ID);
		GameRegistry.registerBlock(blockSilver, BlockInfo.SILVER_KEY);
	}
	
	public static void addSilverName() {
		LanguageRegistry.addName(blockSilver, BlockInfo.SILVER_UNLOCALIZED_NAME);
	}
	
public static Block oreLead;

	public static void initOreLead() {
		oreLead = new BlockLeadOre(BlockInfo.LEAD_ORE_ID);
		GameRegistry.registerBlock(oreLead, BlockInfo.LEAD_ORE_KEY);
	}	
	
	public static void addOreLeadName() {
		LanguageRegistry.addName(oreLead, BlockInfo.LEAD_ORE_UNLOCALIZED_NAME);
	}

public static Block blockLead;
	
	public static void initLead() {
		blockLead = new BlockLead(BlockInfo.LEAD_ID);
		GameRegistry.registerBlock(blockLead, BlockInfo.LEAD_KEY);
	}
	
	public static void addLeadName() {
		LanguageRegistry.addName(blockLead, BlockInfo.LEAD_UNLOCALIZED_NAME);
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
