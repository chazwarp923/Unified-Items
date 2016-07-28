package tech.chazwarp923.unifieditems.item;

import java.util.HashMap;
import java.util.Map;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;
import tech.chazwarp923.unifieditems.material.MaterialRegistry;

public class UIItems {

	public static ItemMortarAndPestle mortarAndPestle;
	
	public static Map<MaterialRegistry, UIItemDust> dusts = new HashMap<MaterialRegistry, UIItemDust>();
	public static Map<MaterialRegistry, UIItemIngot> ingots = new HashMap<MaterialRegistry, UIItemIngot>();
	public static Map<MaterialRegistry, UIItemNugget> nuggets = new HashMap<MaterialRegistry, UIItemNugget>();
	public static Map<MaterialRegistry, UIItemGem> gems = new HashMap<MaterialRegistry, UIItemGem>();
	
	public static void addDust(MaterialRegistry mat, String unlocalizedName) {
		dusts.put(mat, new UIItemDust(unlocalizedName));
	}
	
	public static void addIngot(MaterialRegistry mat, String unlocalizedName) {
		ingots.put(mat, new UIItemIngot(unlocalizedName));
	}
	
	public static void addNugget(MaterialRegistry mat, String unlocalizedName) {
		nuggets.put(mat, new UIItemNugget(unlocalizedName));
	}
	
	public static void addGem(MaterialRegistry mat, String unlocalizedName) {
		gems.put(mat, new UIItemGem(unlocalizedName));
	}

	public static void preInit() {
		mortarAndPestle = new ItemMortarAndPestle();
		
		for(Map.Entry<MaterialRegistry, UIItemDust> item : dusts.entrySet()) {
			OreDictionary.registerOre("dust" + item.getKey().toString(), item.getValue());
		}
		for(Map.Entry<MaterialRegistry, UIItemIngot> item : ingots.entrySet()) {
			OreDictionary.registerOre("ingot" + item.getKey().toString(), item.getValue());
		}
		for(Map.Entry<MaterialRegistry, UIItemGem> item : gems.entrySet()) {
			OreDictionary.registerOre("gem" + item.getKey().toString(), item.getValue());
		}
	}
	
	@SideOnly(Side.CLIENT)
	public static void preInitClient() {
		mortarAndPestle.initModel();
		
		for(Map.Entry<MaterialRegistry, UIItemDust> item : dusts.entrySet()) {
			item.getValue().initModel();
		}
		
		for(Map.Entry<MaterialRegistry, UIItemIngot> item : ingots.entrySet()) {
			item.getValue().initModel();
		}
		
		for(Map.Entry<MaterialRegistry, UIItemGem> item : gems.entrySet()) {
			item.getValue().initModel();
		}
	}
	
	@SideOnly(Side.CLIENT)
    public static void initModel(UIItem i) {
        i.initModel();
    }
}