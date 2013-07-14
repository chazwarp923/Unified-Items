package com.chazwarp.unifieditems.items;

import net.minecraft.item.Item;

import com.chazwarp.unifieditems.lib.ItemInfo;

import cpw.mods.fml.common.registry.LanguageRegistry;

public class Items {

public static Item ingotCopper;

	//This registers the item id
	public static void initCopper() {
		
	ingotCopper = new ItemCopper(ItemInfo.INGOT_COPPER_ID);
	}
	//This registers the name
	public static void addCopperName() {
		
		LanguageRegistry.addName(ingotCopper, ItemInfo.INGOT_COPPER_NAME);
	}
	
public static Item ingotTin;

	//This registers the item id
	public static void initTin() {
	
	ingotTin = new ItemTin(ItemInfo.INGOT_TIN_ID);			
	}
	//This registers the name
	public static void 	addTinName() {
		
		LanguageRegistry.addName(ingotTin, ItemInfo.INGOT_TIN_NAME);
	}
	
public static Item ingotBronze;

	//This registers the item id
	public static void initBronze() {
	
	ingotBronze = new ItemBronze(ItemInfo.INGOT_BRONZE_ID);			
	}
	//This registers the name
	public static void 	addBronzeName() {
		
		LanguageRegistry.addName(ingotBronze, ItemInfo.INGOT_BRONZE_NAME);
	}
	
public static Item rubberRaw;

	//This registers the item id
	public static void initRubberRaw() {
		
	rubberRaw = new ItemRawRubber(ItemInfo.RUBBER_RAW_ID);
	}
	//This registers the name
	public static void addRubberRawName() {
		
		LanguageRegistry.addName(rubberRaw, ItemInfo.RUBBER_RAW_NAME);
	}
	
public static Item rubber;

	//This registers the item id
	public static void initRubber() {
		
	rubber = new ItemRubber(ItemInfo.RUBBER_ID);
	}
	//This registers the name
	public static void addRubberName() {
		
		LanguageRegistry.addName(rubber, ItemInfo.RUBBER_NAME);
	}
	
}



