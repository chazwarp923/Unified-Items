package com.chazwarp.unifieditems.items;

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
		
	public static void initItems() {
		GameRegistry.registerItem(dustIron, ItemInfo.DUST_IRON_KEY);
		GameRegistry.registerItem(dustGold, ItemInfo.DUST_GOLD_KEY);
		GameRegistry.registerItem(dustCopper, ItemInfo.DUST_COPPER_KEY);
		GameRegistry.registerItem(dustTin, ItemInfo.DUST_TIN_KEY);
		GameRegistry.registerItem(dustSilver, ItemInfo.DUST_SILVER_KEY);
		GameRegistry.registerItem(dustLead, ItemInfo.DUST_LEAD_KEY);
		GameRegistry.registerItem(dustBronze, ItemInfo.DUST_BRONZE_KEY);
		
		GameRegistry.registerItem(ingotCopper, ItemInfo.INGOT_COPPER_KEY);
		GameRegistry.registerItem(ingotTin, ItemInfo.INGOT_TIN_KEY);
		GameRegistry.registerItem(ingotSilver, ItemInfo.INGOT_SILVER_KEY);
		GameRegistry.registerItem(ingotLead, ItemInfo.INGOT_LEAD_KEY);
		GameRegistry.registerItem(ingotBronze, ItemInfo.INGOT_BRONZE_KEY);
		
		GameRegistry.registerItem(rawRubber, ItemInfo.RAW_RUBBER_KEY);
		GameRegistry.registerItem(ingotRubber, ItemInfo.INGOT_RUBBER_KEY);
		GameRegistry.registerItem(mortarAndPestle, ItemInfo.MORTAR_AND_PESTLE_KEY);
	}
}