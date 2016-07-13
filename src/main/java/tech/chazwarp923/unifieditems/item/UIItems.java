package tech.chazwarp923.unifieditems.item;

import java.util.HashMap;
import java.util.Map;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

public class UIItems {

	public static ItemMortarAndPestle mortarAndPestle;
	
	public static Map<String, UIItemDust> dusts = new HashMap<String, UIItemDust>();
	public static Map<String, UIItemIngot> ingots = new HashMap<String, UIItemIngot>();
	public static Map<String, UIItemGem> gems = new HashMap<String, UIItemGem>();
	
	public static void addDust(String matName, String unlocalizedName) {
		dusts.put(matName, new UIItemDust(unlocalizedName));
	}
	
	public static void addIngot(String matName, String unlocalizedName) {
		ingots.put(matName, new UIItemIngot(unlocalizedName));
	}
	
	public static void addGem(String matName, String unlocalizedName) {
		gems.put(matName, new UIItemGem(unlocalizedName));
	}

	public static void preInit() {
		mortarAndPestle = new ItemMortarAndPestle();
		
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
	
	@SideOnly(Side.CLIENT)
	public static void preInitClient() {
		mortarAndPestle.initModel();
		
		for(Map.Entry<String, UIItemDust> item : dusts.entrySet()) {
			item.getValue().initModel();
		}
		
		for(Map.Entry<String, UIItemIngot> item : ingots.entrySet()) {
			item.getValue().initModel();
		}
		
		for(Map.Entry<String, UIItemGem> item : gems.entrySet()) {
			item.getValue().initModel();
		}
	}
	
	@SideOnly(Side.CLIENT)
    public static void initModel(UIItem i) {
        i.initModel();
    }
}