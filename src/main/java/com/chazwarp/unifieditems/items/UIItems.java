package com.chazwarp.unifieditems.items;

import java.util.HashMap;
import java.util.Map;

import com.chazwarp.unifieditems.lib.ItemInfo;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class UIItems {

	protected static Map<String, UIItemDust> dusts = new HashMap<String, UIItemDust>();
	protected static Map<String, UIItemIngot> ingots = new HashMap<String, UIItemIngot>();
	protected static Map<String, UIItemGem> gems = new HashMap<String, UIItemGem>();
	
	public static void addDust(String matName, String unlocalizedName, int hexColor) {
		dusts.put(matName, new UIItemDust(unlocalizedName, hexColor));
	}
	
	public static void addIngot(String matName, String unlocalizedName, int hexColor) {
		ingots.put(matName, new UIItemIngot(unlocalizedName, hexColor));
	}
	
	public static void addGem(String matName, String unlocalizedName, int hexColor) {
		gems.put(matName, new UIItemGem(unlocalizedName, hexColor));
	}
	
	public static UIItem rawRubber = new ItemRawRubber();
	public static UIItem ingotRubber = new ItemRubber();
	public static UIItem mortarAndPestle = new ItemMortarAndPestle();

	public static void initItems() {
		for(Map.Entry<String, UIItemDust> item : dusts.entrySet()) {
			GameRegistry.registerItem(item.getValue(), item.getKey() + " Dust");
			OreDictionary.registerOre("dust" + item.getKey(), item.getValue());
		}
		
		for(Map.Entry<String, UIItemIngot> item : ingots.entrySet()) {
			GameRegistry.registerItem(item.getValue(), item.getKey() + " Ingot");
			OreDictionary.registerOre("ingot" + item.getKey(), item.getValue());
		}
		
		for(Map.Entry<String, UIItemGem> item : gems.entrySet()) {
			GameRegistry.registerItem(item.getValue(), item.getKey() + " Gem");
			OreDictionary.registerOre("gem" + item.getKey(), item.getValue());
		}

		GameRegistry.registerItem(rawRubber, ItemInfo.RAW_RUBBER_KEY);
		GameRegistry.registerItem(ingotRubber, ItemInfo.INGOT_RUBBER_KEY);
		GameRegistry.registerItem(mortarAndPestle, ItemInfo.MORTAR_AND_PESTLE_KEY);
	}
	
	public static ItemStack getStackForCreativeTab() {
		return new ItemStack(dusts.get("Iron"));
	}
}