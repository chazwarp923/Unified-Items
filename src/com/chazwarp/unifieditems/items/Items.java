package com.chazwarp.unifieditems.items;

import net.minecraft.item.Item;

import com.chazwarp.unifieditems.lib.ItemInfo;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Items {

	public static Item dustIron;
	
		//This registers the item id
		public static void initIron() {
			
			dustIron = new ItemDustIron(ItemInfo.DUST_IRON_ID);
			GameRegistry.registerItem(dustIron, ItemInfo.DUST_IRON_KEY);
		}
		//This registers the name
		public static void addIronName() {
			
			LanguageRegistry.addName(dustIron, ItemInfo.DUST_IRON_NAME);	
		}	
			
	public static Item dustGold;
	
		//This registers the item id
		public static void initGold() {
			
			dustGold = new ItemDustGold(ItemInfo.DUST_GOLD_ID);
			GameRegistry.registerItem(dustGold, ItemInfo.DUST_GOLD_KEY);
		}
		//This registers the name
		public static void addGoldName() {
			
			LanguageRegistry.addName(dustGold, ItemInfo.DUST_GOLD_NAME);
		}
		
	public static Item ingotCopper;
	public static Item dustCopper;
	
		//This registers the item id
		public static void initCopper() {
			
			ingotCopper = new ItemIngotCopper(ItemInfo.INGOT_COPPER_ID);
			dustCopper = new ItemDustCopper(ItemInfo.DUST_COPPER_ID);
			GameRegistry.registerItem(ingotCopper, ItemInfo.INGOT_COPPER_KEY);
			GameRegistry.registerItem(dustCopper, ItemInfo.DUST_COPPER_KEY);
		}
		//This registers the name
		public static void addCopperName() {
			
			LanguageRegistry.addName(ingotCopper, ItemInfo.INGOT_COPPER_NAME);
			LanguageRegistry.addName(dustCopper, ItemInfo.DUST_COPPER_NAME);
		}
		
	public static Item ingotTin;
	public static Item dustTin;
	
		//This registers the item id
		public static void initTin() {
		
			ingotTin = new ItemIngotTin(ItemInfo.INGOT_TIN_ID);	
			dustTin = new ItemDustTin(ItemInfo.DUST_TIN_ID);
			GameRegistry.registerItem(ingotTin, ItemInfo.INGOT_TIN_KEY);
			GameRegistry.registerItem(dustTin, ItemInfo.DUST_TIN_KEY);
		}
		//This registers the name
		public static void 	addTinName() {
			
			LanguageRegistry.addName(ingotTin, ItemInfo.INGOT_TIN_NAME);
			LanguageRegistry.addName(dustTin, ItemInfo.DUST_TIN_NAME);
		}
		
	public static Item ingotBronze;
	
		//This registers the item id
		public static void initBronze() {
		
			ingotBronze = new ItemIngotBronze(ItemInfo.INGOT_BRONZE_ID);
			GameRegistry.registerItem(ingotBronze, ItemInfo.INGOT_BRONZE_NAME);
		}
		//This registers the name
		public static void 	addBronzeName() {
			
			LanguageRegistry.addName(ingotBronze, ItemInfo.INGOT_BRONZE_NAME);
		}
		
	public static Item ingotSilver;
	public static Item dustSilver;
	
		//This registers the item id
		public static void initSilver() {
		
			ingotSilver = new ItemIngotSilver(ItemInfo.INGOT_SILVER_ID);
			dustSilver = new ItemDustSilver(ItemInfo.DUST_SILVER_ID);
			GameRegistry.registerItem(ingotSilver, ItemInfo.INGOT_SILVER_KEY);
			GameRegistry.registerItem(dustSilver, ItemInfo.DUST_SILVER_KEY);
		}
		//This registers the name
		public static void 	addSilverName() {
			
			LanguageRegistry.addName(ingotSilver, ItemInfo.INGOT_SILVER_NAME);
			LanguageRegistry.addName(dustSilver, ItemInfo.DUST_SILVER_NAME);
		}
		
	public static Item ingotLead;
	public static Item dustLead;
	
		//This registers the item id
		public static void initLead() {
		
			ingotLead = new ItemIngotLead(ItemInfo.INGOT_LEAD_ID);
			dustLead = new ItemDustLead(ItemInfo.DUST_LEAD_ID);
			GameRegistry.registerItem(ingotLead, ItemInfo.INGOT_LEAD_KEY);
			GameRegistry.registerItem(dustLead, ItemInfo.DUST_LEAD_KEY);
		}
		//This registers the name
		public static void 	addLeadName() {
			
			LanguageRegistry.addName(ingotLead, ItemInfo.INGOT_LEAD_NAME);
			LanguageRegistry.addName(dustLead, ItemInfo.DUST_LEAD_NAME);
		}
		
	public static Item rawRubber;
	
		//This registers the item id
		public static void initRawRubber() {
			
			rawRubber = new ItemRawRubber(ItemInfo.RAW_RUBBER_ID);
			GameRegistry.registerItem(rawRubber, ItemInfo.RAW_RUBBER_NAME);
		}
		//This registers the name
		public static void addRawRubberName() {
			
			LanguageRegistry.addName(rawRubber, ItemInfo.RAW_RUBBER_NAME);
		}
		
	public static Item ingotRubber;
	
		//This registers the item id
		public static void initIngotRubber() {
			
			ingotRubber = new ItemRubber(ItemInfo.INGOT_RUBBER_ID);
			GameRegistry.registerItem(ingotRubber, ItemInfo.INGOT_RUBBER_NAME);
		}
		//This registers the name
		public static void addIngotRubberName() {
			
			LanguageRegistry.addName(ingotRubber, ItemInfo.INGOT_RUBBER_NAME);
		}
		
	public static Item singlePul;
	
		//This registers the item id
		public static void initSinglePul() {
			
			singlePul = new ItemOneTimePulverize(ItemInfo.PULVERIZE_ID);
			GameRegistry.registerItem(singlePul, ItemInfo.PULVERIZE_NAME);
		}
		//This registers the name
		public static void addSinglePulName() {
			
			LanguageRegistry.addName(singlePul, ItemInfo.PULVERIZE_NAME);
		}
	
	public static void initItems() {
		initIron();
		initGold();
		initCopper();
		initTin();
		initBronze();
		initSilver();
		initLead();
		initRawRubber();
		initIngotRubber();
		initSinglePul();
	}
		
	public static void addNames() {
		addIronName();
		addGoldName();
		addCopperName();
		addTinName();
		addBronzeName();
		addSilverName();
		addLeadName();
		addRawRubberName();
		addIngotRubberName();
		addSinglePulName();
	}
	
}



