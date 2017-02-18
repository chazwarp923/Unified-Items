/**
@author Chazwarp923
 */
package tech.chazwarp923.unifieditems.item;

import java.util.HashMap;
import java.util.Map;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;
import tech.chazwarp923.unifieditems.material.Material;

public class UIItems {

	public static ItemMortarAndPestle mortarAndPestle;
	
	public static Map<Material, UIItemDust> dusts = new HashMap<Material, UIItemDust>();
	public static Map<Material, UIItemIngot> ingots = new HashMap<Material, UIItemIngot>();
	public static Map<Material, UIItemNugget> nuggets = new HashMap<Material, UIItemNugget>();
	public static Map<Material, UIItemGem> gems = new HashMap<Material, UIItemGem>();
	public static Map<Material, UIItemPlate> plates = new HashMap<Material, UIItemPlate>();
	public static Map<Material, UIItemGear> gears = new HashMap<Material, UIItemGear>();
	
	public static void addDust(Material mat, String unlocalizedName) {
		dusts.put(mat, new UIItemDust(unlocalizedName));
	}
	
	public static void addIngot(Material mat, String unlocalizedName) {
		ingots.put(mat, new UIItemIngot(unlocalizedName));
	}
	
	public static void addNugget(Material mat, String unlocalizedName) {
		nuggets.put(mat, new UIItemNugget(unlocalizedName));
	}
	
	public static void addGem(Material mat, String unlocalizedName) {
		gems.put(mat, new UIItemGem(unlocalizedName));
	}
	
	public static void addPlate(Material mat, String unlocalizedName) {
		plates.put(mat, new UIItemPlate(unlocalizedName));
	}
	
	public static void addGear(Material mat, String unlocalizedName) {
		gears.put(mat, new UIItemGear(unlocalizedName));
	}

	public static void preInit() {
		mortarAndPestle = new ItemMortarAndPestle();
		
		for(Map.Entry<Material, UIItemDust> item : dusts.entrySet()) {
			OreDictionary.registerOre("dust" + item.getKey().toString(), item.getValue());
			if(item.getKey().equals(Material.ALUMINUM)) {
				OreDictionary.registerOre("dustAluminium", item.getValue());
			}
		}
		
		for(Map.Entry<Material, UIItemIngot> item : ingots.entrySet()) {
			OreDictionary.registerOre("ingot" + item.getKey().toString(), item.getValue());
			if(item.getKey().equals(Material.ALUMINUM)) {
				OreDictionary.registerOre("ingotAluminium", item.getValue());
			}
		}
		
		for(Map.Entry<Material, UIItemNugget> item : nuggets.entrySet()) {
			OreDictionary.registerOre("nugget" + item.getKey().toString(), item.getValue());
			if(item.getKey().equals(Material.ALUMINUM)) {
				OreDictionary.registerOre("nuggetAluminium", item.getValue());
			}
		}
		
		for(Map.Entry<Material, UIItemGem> item : gems.entrySet()) {
			OreDictionary.registerOre("gem" + item.getKey().toString(), item.getValue());
		}
		
		for(Map.Entry<Material, UIItemPlate> item : plates.entrySet()) {
			OreDictionary.registerOre("plate" + item.getKey().toString(), item.getValue());
			if(item.getKey().equals(Material.ALUMINUM)) {
				OreDictionary.registerOre("plateAluminium", item.getValue());
			}
		}
		
		for(Map.Entry<Material, UIItemGear> item : gears.entrySet()) {
			OreDictionary.registerOre("gear" + item.getKey().toString(), item.getValue());
			if(item.getKey().equals(Material.ALUMINUM)) {
				OreDictionary.registerOre("gearAluminium", item.getValue());
			}
		}
	}
	
	@SideOnly(Side.CLIENT)
	public static void preInitClient() {
		mortarAndPestle.initModel();
		
		for(Map.Entry<Material, UIItemDust> item : dusts.entrySet()) {
			item.getValue().initModel();
		}
		
		for(Map.Entry<Material, UIItemIngot> item : ingots.entrySet()) {
			item.getValue().initModel();
		}
		
		for(Map.Entry<Material, UIItemNugget> item : nuggets.entrySet()) {
			item.getValue().initModel();
		}
		
		for(Map.Entry<Material, UIItemGem> item : gems.entrySet()) {
			item.getValue().initModel();
		}
		
		for(Map.Entry<Material, UIItemPlate> item : plates.entrySet()) {
			item.getValue().initModel();
		}
		
		for(Map.Entry<Material, UIItemGear> item : gears.entrySet()) {
			item.getValue().initModel();
		}
	}
	
	@SideOnly(Side.CLIENT)
    public static void initModel(UIItem item) {
        item.initModel();
    }
}