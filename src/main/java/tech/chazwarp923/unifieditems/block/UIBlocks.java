package tech.chazwarp923.unifieditems.block;

import java.util.HashMap;
import java.util.Map;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

public class UIBlocks {
	
	public static Map<String, UIBlockOre> ores = new HashMap<String, UIBlockOre>();
	public static Map<String, UIBlockStorage> blocks = new HashMap<String, UIBlockStorage>();
	
	public static void addOre(String matName, float hardness, String unlocalizedName, HarvestLevel harvestLevel) {
		ores.put(matName, new UIBlockOre(hardness, unlocalizedName, harvestLevel));
	}
	
	public static void addBlock(String matName, float hardness, String unlocalizedName, HarvestLevel harvestLevel) {
		blocks.put(matName, new UIBlockStorage(hardness, unlocalizedName, harvestLevel));
	}
	
	public static void preInit() {		
		for(Map.Entry<String, UIBlockOre> block : ores.entrySet()) {
			OreDictionary.registerOre("ore" + block.getKey(), block.getValue());
		}
		for(Map.Entry<String, UIBlockStorage> block : blocks.entrySet()) {
			OreDictionary.registerOre("block" + block.getKey(), block.getValue());
		}
	}
	
	@SideOnly(Side.CLIENT)
	public static void preInitClient() {
		for(Map.Entry<String, UIBlockOre> block : ores.entrySet()) {
			block.getValue().initModel();
		}
		for(Map.Entry<String, UIBlockStorage> block : blocks.entrySet()) {
			block.getValue().initModel();
		}
	}
}