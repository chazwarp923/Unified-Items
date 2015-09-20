package com.chazwarp.unifieditems.blocks;

import java.util.HashMap;
import java.util.Map;

import com.chazwarp.unifieditems.items.UIItemBlock;
import com.chazwarp.unifieditems.lib.BlockInfo;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraftforge.oredict.OreDictionary;

public class UIBlocks {

	protected static Map<String, UIBlockOre> ores = new HashMap<String, UIBlockOre>();
	protected static Map<String, UIBlockStorage> blocks = new HashMap<String, UIBlockStorage>();
	
	public static void addOre(String matName, float hardness, String unlocalizedName, int harvestLevel, int hexColor, Block baseTex) {
		ores.put(matName, new UIBlockOre(hardness, unlocalizedName, harvestLevel, hexColor, baseTex));
	}
	
	public static void addBlock(String matName, float hardness, String unlocalizedName, int harvestLevel, int hexColor) {
		blocks.put(matName, new UIBlockStorage(hardness, unlocalizedName, harvestLevel, hexColor));
	}
	
	public static Block rubberTap = new BlockRubberTap();

	public static void registerBlocks() {
		for(Map.Entry<String, UIBlockOre> block : ores.entrySet()) {
			GameRegistry.registerBlock(block.getValue(), block.getKey() + " Ore");
			OreDictionary.registerOre("ore" + block.getKey(), block.getValue());
		}
		
		for(Map.Entry<String, UIBlockStorage> block : blocks.entrySet()) {
			GameRegistry.registerBlock(block.getValue(), UIItemBlock.class, block.getKey() + " Block");
			OreDictionary.registerOre("block" + block.getKey(), block.getValue());
		}
		
		GameRegistry.registerBlock(rubberTap, UIItemBlock.class, BlockInfo.RUBBER_TAP_KEY);
	}
}