package com.chazwarp.unifieditems.items;

import net.minecraft.item.Item;

import com.chazwarp.unifieditems.lib.ItemInfo;

import cpw.mods.fml.common.registry.LanguageRegistry;

public class Items {

public static Item ingotCopper;

	//This registers the item id
	public static void initCopper() {
		
	ingotCopper = new ItemIngotCopper(ItemInfo.INGOT_COPPER_ID);
	}
	//This registers the name
	public static void addCopperName() {
		
		LanguageRegistry.addName(ingotCopper, ItemInfo.INGOT_COPPER_NAME);
	}
	
public static Item ingotTin;

	//This registers the item id
	public static void initTin() {
	
	ingotTin = new ItemIngotTin(ItemInfo.INGOT_TIN_ID);			
	}
	//This registers the name
	public static void 	addTinName() {
		
		LanguageRegistry.addName(ingotTin, ItemInfo.INGOT_TIN_NAME);
	}
	
public static Item ingotBronze;

	//This registers the item id
	public static void initBronze() {
	
	ingotBronze = new ItemIngotBronze(ItemInfo.INGOT_BRONZE_ID);			
	}
	//This registers the name
	public static void 	addBronzeName() {
		
		LanguageRegistry.addName(ingotBronze, ItemInfo.INGOT_BRONZE_NAME);
	}
	
public static Item ingotSilver;

	//This registers the item id
	public static void initSilver() {
	
	ingotSilver = new ItemIngotSilver(ItemInfo.INGOT_SILVER_ID);			
	}
	//This registers the name
	public static void 	addSilverName() {
		
		LanguageRegistry.addName(ingotSilver, ItemInfo.INGOT_SILVER_NAME);
	}
	
public static Item ingotLead;

	//This registers the item id
	public static void initLead() {
	
	ingotLead = new ItemIngotLead(ItemInfo.INGOT_LEAD_ID);			
	}
	//This registers the name
	public static void 	addLeadName() {
		
		LanguageRegistry.addName(ingotLead, ItemInfo.INGOT_LEAD_NAME);
	}
	
public static Item rawRubber;

	//This registers the item id
	public static void initRawRubber() {
		
	rawRubber = new ItemRawRubber(ItemInfo.RAW_RUBBER_ID);
	}
	//This registers the name
	public static void addRawRubberName() {
		
		LanguageRegistry.addName(rawRubber, ItemInfo.RAW_RUBBER_NAME);
	}
	
public static Item ingotRubber;

	//This registers the item id
	public static void initIngotRubber() {
		
	ingotRubber = new ItemRubber(ItemInfo.INGOT_RUBBER_ID);
	}
	//This registers the name
	public static void addRubberName() {
		
		LanguageRegistry.addName(ingotRubber, ItemInfo.INGOT_RUBBER_NAME);
	}
	
}



