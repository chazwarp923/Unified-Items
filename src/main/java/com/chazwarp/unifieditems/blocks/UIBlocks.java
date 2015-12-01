package com.chazwarp.unifieditems.blocks;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.block.Block;
import net.minecraftforge.oredict.OreDictionary;

public class UIBlocks {

	public static Map<String, UIBlockOre> ores = new HashMap<String, UIBlockOre>();
	public static Map<String, UIBlockStorage> blocks = new HashMap<String, UIBlockStorage>();
	
	public static void addOre(String matName, float hardness, String unlocalizedName, int harvestLevel, int hexColor, Block baseTex) {
		ores.put(matName, new UIBlockOre(hardness, unlocalizedName, harvestLevel, hexColor, baseTex));
	}
	
	public static void addBlock(String matName, float hardness, String unlocalizedName, int harvestLevel, int hexColor) {
		blocks.put(matName, new UIBlockStorage(matName, hardness, unlocalizedName, harvestLevel, hexColor));
	}
	
	public static Block rubberTap = new BlockRubberTap();
	
	public static void registerBlocks() {
		for(Map.Entry<String, UIBlockOre> block : ores.entrySet()) {
			OreDictionary.registerOre("ore" + block.getKey(), block.getValue());
		}
		
		for(Map.Entry<String, UIBlockStorage> block : blocks.entrySet()) {
			OreDictionary.registerOre("block" + block.getKey(), block.getValue());
		}
	}
}