package tech.chazwarp923.unifieditems.block;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;
import tech.chazwarp923.unifieditems.material.MaterialRegistry;

public class UIBlocks {
	
	public static Map<MaterialRegistry, UIBlockOre> ores = new HashMap<MaterialRegistry, UIBlockOre>();
	public static Map<MaterialRegistry, UIBlockStorage> blocks = new HashMap<MaterialRegistry, UIBlockStorage>();
	
	public static void addOre(MaterialRegistry mat, float hardness, String unlocalizedName, HarvestLevel harvestLevel) {
		ores.put(mat, new UIBlockOre(hardness, unlocalizedName, harvestLevel));
	}
	
	public static void addBlock(MaterialRegistry mat, float hardness, String unlocalizedName, HarvestLevel harvestLevel) {
		blocks.put(mat, new UIBlockStorage(hardness, unlocalizedName, harvestLevel));
	}
	
	public static void preInit() {		
		for(Map.Entry<MaterialRegistry, UIBlockOre> block : ores.entrySet()) {
			OreDictionary.registerOre("ore" + block.getKey().toString(), block.getValue());
			if(block.getKey().equals(MaterialRegistry.ALUMINUM)) {
				OreDictionary.registerOre("oreAluminium", block.getValue());
			}
		}
		for(Map.Entry<MaterialRegistry, UIBlockStorage> block : blocks.entrySet()) {
			OreDictionary.registerOre("block" + block.getKey().toString(), block.getValue());
			if(block.getKey().equals(MaterialRegistry.ALUMINUM)) {
				OreDictionary.registerOre("blockAluminium", block.getValue());
			}
		}
	}
	
	@SideOnly(Side.CLIENT)
	public static void preInitClient() {
		for(Entry<MaterialRegistry, UIBlockOre> block : ores.entrySet()) {
			block.getValue().initModel();
		}
		for(Entry<MaterialRegistry, UIBlockStorage> block : blocks.entrySet()) {
			block.getValue().initModel();
		}
	}
}