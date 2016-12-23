package tech.chazwarp923.unifieditems.block;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;
import tech.chazwarp923.unifieditems.material.Material;

public class UIBlocks {
	
	public static Map<Material, UIBlockOre> ores = new HashMap<Material, UIBlockOre>();
	public static Map<Material, UIBlockStorage> blocks = new HashMap<Material, UIBlockStorage>();
	
	public static void addOre(Material mat, float hardness, String unlocalizedName, HarvestLevel harvestLevel) {
		ores.put(mat, new UIBlockOre(hardness, unlocalizedName, harvestLevel));
	}
	
	public static void addBlock(Material mat, float hardness, String unlocalizedName, HarvestLevel harvestLevel) {
		blocks.put(mat, new UIBlockStorage(hardness, unlocalizedName, harvestLevel));
	}
	
	public static void preInit() {		
		for(Map.Entry<Material, UIBlockOre> block : ores.entrySet()) {
			OreDictionary.registerOre("ore" + block.getKey().toString(), block.getValue());
			if(block.getKey().equals(Material.ALUMINUM)) {
				OreDictionary.registerOre("oreAluminium", block.getValue());
			}
		}
		for(Map.Entry<Material, UIBlockStorage> block : blocks.entrySet()) {
			OreDictionary.registerOre("block" + block.getKey().toString(), block.getValue());
			if(block.getKey().equals(Material.ALUMINUM)) {
				OreDictionary.registerOre("blockAluminium", block.getValue());
			}
		}
	}
	
	@SideOnly(Side.CLIENT)
	public static void preInitClient() {
		for(Entry<Material, UIBlockOre> block : ores.entrySet()) {
			block.getValue().initModel();
		}
		for(Entry<Material, UIBlockStorage> block : blocks.entrySet()) {
			block.getValue().initModel();
		}
	}
}