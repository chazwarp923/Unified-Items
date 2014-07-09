package com.chazwarp.unifieditems.items;

import com.chazwarp.unifieditems.blocks.ModBlocks;
import com.chazwarp.unifieditems.lib.BlockInfo;
import com.chazwarp.unifieditems.lib.ItemInfo;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {

	public static ItemUI dustIron = new ItemDustIron();
	public static ItemUI dustGold = new ItemDustGold();
	public static ItemUI dustCopper = new ItemDustCopper();
	public static ItemUI ingotCopper = new ItemIngotCopper();
	public static ItemUI dustTin = new ItemDustTin();
	public static ItemUI ingotTin = new ItemIngotTin();
	public static ItemUI dustBronze = new ItemDustBronze();
	public static ItemUI ingotBronze = new ItemIngotBronze();
	public static ItemUI dustSilver = new ItemDustSilver();
	public static ItemUI ingotSilver = new ItemIngotSilver();
	public static ItemUI dustLead = new ItemDustLead();
	public static ItemUI ingotLead = new ItemIngotLead();
	public static ItemUI rawRubber = new ItemRawRubber();
	public static ItemUI ingotRubber = new ItemRubber();
	public static ItemUI mortarAndPestle = new ItemMortarAndPestle();
	
	public static ItemBlockUI oreCopper = new ItemBlockUI(ModBlocks.oreCopper);
	public static ItemBlockUI oreTin = new ItemBlockUI(ModBlocks.oreTin);
	public static ItemBlockUI oreSilver = new ItemBlockUI(ModBlocks.oreSilver);
	public static ItemBlockUI oreLead = new ItemBlockUI(ModBlocks.oreLead);
	public static ItemBlockUI blockCopper = new ItemBlockUI(ModBlocks.blockCopper);
	public static ItemBlockUI blockTin = new ItemBlockUI(ModBlocks.blockTin);
	public static ItemBlockUI blockBronze = new ItemBlockUI(ModBlocks.blockBronze);
	public static ItemBlockUI blockSilver = new ItemBlockUI(ModBlocks.blockSilver);
	public static ItemBlockUI blockLead = new ItemBlockUI(ModBlocks.blockLead);
	public static ItemBlockUI blockRubberTap = new ItemBlockUI(ModBlocks.rubberTap);
		
	public static void initItems() {
		GameRegistry.registerItem(dustIron, ItemInfo.DUST_IRON_KEY);
		GameRegistry.registerItem(dustGold, ItemInfo.DUST_GOLD_KEY);
		GameRegistry.registerItem(dustCopper, ItemInfo.DUST_COPPER_KEY);
		GameRegistry.registerItem(ingotCopper, ItemInfo.INGOT_COPPER_KEY);
		GameRegistry.registerItem(dustTin, ItemInfo.DUST_TIN_KEY);
		GameRegistry.registerItem(ingotTin, ItemInfo.INGOT_TIN_KEY);
		GameRegistry.registerItem(dustBronze, ItemInfo.DUST_BRONZE_NAME);
		GameRegistry.registerItem(ingotBronze, ItemInfo.INGOT_BRONZE_NAME);
		GameRegistry.registerItem(dustSilver, ItemInfo.DUST_SILVER_KEY);
		GameRegistry.registerItem(ingotSilver, ItemInfo.INGOT_SILVER_KEY);
		GameRegistry.registerItem(dustLead, ItemInfo.DUST_LEAD_KEY);
		GameRegistry.registerItem(ingotLead, ItemInfo.INGOT_LEAD_KEY);
		GameRegistry.registerItem(rawRubber, ItemInfo.RAW_RUBBER_NAME);
		GameRegistry.registerItem(ingotRubber, ItemInfo.INGOT_RUBBER_NAME);
		GameRegistry.registerItem(mortarAndPestle, ItemInfo.MORTAR_AND_PESTLE_NAME);
	}
	
	public static void initItemBlocks() {
		GameRegistry.registerItem(oreCopper, BlockInfo.COPPER_ORE_KEY);
		GameRegistry.registerItem(oreTin, BlockInfo.TIN_ORE_KEY);
		GameRegistry.registerItem(oreSilver, BlockInfo.SILVER_ORE_KEY);
		GameRegistry.registerItem(oreLead, BlockInfo.LEAD_ORE_KEY);
		GameRegistry.registerItem(blockCopper, BlockInfo.COPPER_BLOCK_KEY);
		GameRegistry.registerItem(blockTin, BlockInfo.TIN_BLOCK_KEY);
		GameRegistry.registerItem(blockBronze, BlockInfo.BRONZE_BLOCK_KEY);
		GameRegistry.registerItem(blockSilver, BlockInfo.SILVER_BLOCK_KEY);
		GameRegistry.registerItem(blockLead, BlockInfo.LEAD_BLOCK_KEY);
		GameRegistry.registerItem(blockRubberTap, BlockInfo.RUBBER_TAP_KEY);
	}
}