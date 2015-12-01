package com.chazwarp.unifieditems.items;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class UIItems {

	public static Map<String, UIItemDust> dusts = new HashMap<String, UIItemDust>();
	public static Map<String, UIItemIngot> ingots = new HashMap<String, UIItemIngot>();
	public static Map<String, UIItemGem> gems = new HashMap<String, UIItemGem>();
	
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

	public static void registerItems() {
		for(Map.Entry<String, UIItemDust> item : dusts.entrySet()) {
			OreDictionary.registerOre("dust" + item.getKey(), item.getValue());
		}
		
		for(Map.Entry<String, UIItemIngot> item : ingots.entrySet()) {
			OreDictionary.registerOre("ingot" + item.getKey(), item.getValue());
		}
		
		for(Map.Entry<String, UIItemGem> item : gems.entrySet()) {
			OreDictionary.registerOre("gem" + item.getKey(), item.getValue());
		}
	}
	
	public static ItemStack getStackForCreativeTab() {
		return new ItemStack(dusts.get("Iron"));
	}
}