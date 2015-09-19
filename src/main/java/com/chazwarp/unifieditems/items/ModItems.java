package com.chazwarp.unifieditems.items;

import java.util.ArrayList;
import java.util.List;

import com.chazwarp.unifieditems.lib.ItemInfo;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {

	protected static List<UIItemDust> dustList = new ArrayList<UIItemDust>();

	public static UIItem dustBronze = new ItemDustBronze();
	public static UIItem ingotBronze = new ItemIngotBronze();
	public static UIItem rawRubber = new ItemRawRubber();
	public static UIItem ingotRubber = new ItemRubber();
	public static UIItem mortarAndPestle = new ItemMortarAndPestle();

	public static void initItems() {

		GameRegistry.registerItem(dustBronze, ItemInfo.DUST_BRONZE_KEY);

		GameRegistry.registerItem(ingotBronze, ItemInfo.INGOT_BRONZE_KEY);

		GameRegistry.registerItem(rawRubber, ItemInfo.RAW_RUBBER_KEY);
		GameRegistry.registerItem(ingotRubber, ItemInfo.INGOT_RUBBER_KEY);
		GameRegistry.registerItem(mortarAndPestle,
				ItemInfo.MORTAR_AND_PESTLE_KEY);
	}
	
	public static void addDust(String unlocalizedName, int hexColor, String oreDictKey) {
		dustList.add(new UIItemDust(unlocalizedName, hexColor));
	}
}