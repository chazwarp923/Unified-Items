package com.chazwarp.unifieditems.blocks;

import net.minecraft.block.Block;
import net.minecraftforge.common.MinecraftForge;

import com.chazwarp.unifieditems.items.ItemBlockBronze;
import com.chazwarp.unifieditems.items.ItemBlockCopper;
import com.chazwarp.unifieditems.items.ItemBlockLead;
import com.chazwarp.unifieditems.items.ItemBlockSilver;
import com.chazwarp.unifieditems.items.ItemBlockTin;
import com.chazwarp.unifieditems.items.ItemCopperOre;
import com.chazwarp.unifieditems.items.ItemLeadOre;
import com.chazwarp.unifieditems.items.ItemLeavesRubber;
import com.chazwarp.unifieditems.items.ItemSaplingRubber;
import com.chazwarp.unifieditems.items.ItemSilverOre;
import com.chazwarp.unifieditems.items.ItemTinOre;
import com.chazwarp.unifieditems.items.ItemWoodRubber;
import com.chazwarp.unifieditems.lib.BlockInfo;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Blocks {

	public static Block oreCopper;
	
		public static void initOreCopper() {
			oreCopper = new BlockCopperOre(BlockInfo.COPPER_ORE_ID);
			GameRegistry.registerBlock(oreCopper, ItemCopperOre.class, BlockInfo.COPPER_ORE_KEY);
			MinecraftForge.setBlockHarvestLevel(oreCopper, "pickaxe", 1);
		}
	
		public static void addOreCopperName() {
			LanguageRegistry.addName(oreCopper, BlockInfo.COPPER_ORE_UNLOCALIZED_NAME);
		}
	
	public static Block blockCopper;
	
		public static void initBlockCopper() {
			blockCopper = new BlockCopper(BlockInfo.COPPER_ID);
			GameRegistry.registerBlock(blockCopper, ItemBlockCopper.class, BlockInfo.COPPER_KEY);
			MinecraftForge.setBlockHarvestLevel(blockCopper, "pickaxe", 2);
		}
	
		public static void addBlockCopperName() {
			LanguageRegistry.addName(blockCopper, BlockInfo.COPPER_UNLOCALIZED_NAME);
		}
	
	public static Block oreTin;

		public static void initOreTin() {
			oreTin = new BlockTinOre(BlockInfo.TIN_ORE_ID);
			GameRegistry.registerBlock(oreTin, ItemTinOre.class, BlockInfo.TIN_ORE_KEY);
			MinecraftForge.setBlockHarvestLevel(oreTin, "pickaxe", 1);
		}	
	
		public static void addOreTinName() {
			LanguageRegistry.addName(oreTin, BlockInfo.TIN_ORE_UNLOCALIZED_NAME);
		}

	public static Block blockTin;
	
		public static void initBlockTin() {
			blockTin = new BlockTin(BlockInfo.TIN_ID);
			GameRegistry.registerBlock(blockTin, ItemBlockTin.class, BlockInfo.TIN_KEY);
			MinecraftForge.setBlockHarvestLevel(blockTin, "pickaxe", 2);
		}
	
		public static void addBlockTinName() {
			LanguageRegistry.addName(blockTin, BlockInfo.TIN_UNLOCALIZED_NAME);
		}	
	
	public static Block blockBronze;
	
		public static void initBlockBronze() {
			blockBronze = new BlockBronze(BlockInfo.BRONZE_ID);
			GameRegistry.registerBlock(blockBronze, ItemBlockBronze.class, BlockInfo.BRONZE_KEY);
			MinecraftForge.setBlockHarvestLevel(blockBronze, "pickaxe", 2);
		}
	
		public static void addBlockBronzeName() {
			LanguageRegistry.addName(blockBronze, BlockInfo.BRONZE_UNLOCALIZED_NAME);
		}	
	
	public static Block oreSilver;

		public static void initOreSilver() {
			oreSilver = new BlockSilverOre(BlockInfo.SILVER_ORE_ID);
			GameRegistry.registerBlock(oreSilver, ItemSilverOre.class, BlockInfo.SILVER_ORE_KEY);
			MinecraftForge.setBlockHarvestLevel(oreSilver, "pickaxe", 2);
		}	
	
		public static void addOreSilverName() {
			LanguageRegistry.addName(oreSilver, BlockInfo.SILVER_ORE_UNLOCALIZED_NAME);
		}

	public static Block blockSilver;
	
		public static void initBlockSilver() {
			blockSilver = new BlockSilver(BlockInfo.SILVER_ID);
			GameRegistry.registerBlock(blockSilver, ItemBlockSilver.class, BlockInfo.SILVER_KEY);
			MinecraftForge.setBlockHarvestLevel(blockSilver, "pickaxe", 2);
		}
	
		public static void addBlockSilverName() {
			LanguageRegistry.addName(blockSilver, BlockInfo.SILVER_UNLOCALIZED_NAME);
		}
	
	public static Block oreLead;

		public static void initOreLead() {
			oreLead = new BlockLeadOre(BlockInfo.LEAD_ORE_ID);
			GameRegistry.registerBlock(oreLead, ItemLeadOre.class, BlockInfo.LEAD_ORE_KEY);
			MinecraftForge.setBlockHarvestLevel(oreLead, "pickaxe", 2);
		}	
	
		public static void addOreLeadName() {
			LanguageRegistry.addName(oreLead, BlockInfo.LEAD_ORE_UNLOCALIZED_NAME);
		}

	public static Block blockLead;
	
		public static void initBlockLead() {
			blockLead = new BlockLead(BlockInfo.LEAD_ID);
			GameRegistry.registerBlock(blockLead, ItemBlockLead.class, BlockInfo.LEAD_KEY);
			MinecraftForge.setBlockHarvestLevel(blockLead, "pickaxe", 2);
		}
	
		public static void addBlockLeadName() {
			LanguageRegistry.addName(blockLead, BlockInfo.LEAD_UNLOCALIZED_NAME);
		}	
	
	public static Block saplingRubber;

		public static void initSaplingRubber() {
			saplingRubber = new BlockRubberSapling(BlockInfo.RUBBER_SAPLING_ID);
			GameRegistry.registerBlock(saplingRubber, ItemSaplingRubber.class, BlockInfo.RUBBER_SAPLING_KEY);
		}
	
		public static void addSaplingRubberName() {
			LanguageRegistry.addName(saplingRubber, BlockInfo.RUBBER_SAPLING_UNLOCALIZED_NAME);	
		}	
		
	public static Block woodRubber;

		public static void initWoodRubber() {
			woodRubber = new BlockRubberWood(BlockInfo.RUBBER_WOOD_ID);
			GameRegistry.registerBlock(woodRubber, ItemWoodRubber.class, BlockInfo.RUBBER_WOOD_KEY);
		}
	
		public static void addWoodRubberName() {
		LanguageRegistry.addName(woodRubber, BlockInfo.RUBBER_WOOD_UNLOCALIZED_NAME);
		}
	
	public static Block leavesRubber;

		public static void initLeavesRubber() {
			leavesRubber = new BlockRubberLeaves(BlockInfo.RUBBER_LEAVES_ID);
			GameRegistry.registerBlock(leavesRubber, ItemLeavesRubber.class, BlockInfo.RUBBER_LEAVES_KEY);
		}
	
		public static void addLeavesRubberName() {
		LanguageRegistry.addName(leavesRubber, BlockInfo.RUBBER_LEAVES_UNLOCALIZED_NAME);
		}
	
	public static void initBlocks() {
		initOreCopper();
		initOreTin();
		initOreSilver();
		initOreLead();
		initBlockCopper();
		initBlockTin();
		initBlockBronze();
		initBlockSilver();
		initBlockLead();
		initSaplingRubber();
		initWoodRubber();
		initLeavesRubber();
	}
	
	public static void addNames() {
		addOreCopperName();
		addOreTinName();
		addOreSilverName();
		addOreLeadName();
		addBlockCopperName();
		addBlockTinName();
		addBlockBronzeName();
		addBlockSilverName();
		addBlockLeadName();
		addSaplingRubberName();
		addWoodRubberName();
		addLeavesRubberName();
	}
	
}
