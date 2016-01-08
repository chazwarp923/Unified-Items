/**
@author Chaz Kerby
*/
package com.chazwarp.unifieditems.material;

import java.util.HashMap;
import java.util.Map;

import com.chazwarp.unifieditems.block.UIBlocks;
import com.chazwarp.unifieditems.item.UIItems;

public class MaterialHandler {
	
	protected static Map<MaterialRegistry, Integer> materialUseCount = new HashMap<MaterialRegistry, Integer>();
	
	public static void registerUse(MaterialRegistry mat) {
		if(materialUseCount.containsKey(mat)) {
			materialUseCount.put(mat, materialUseCount.get(mat) + 1);
		}
		else {
			materialUseCount.put(mat, 1);
		}
	}
	
	public static void addBlocksAndItemsForMaterials() {
		for(MaterialRegistry material : materialUseCount.keySet()) {
			switch(material.type) {
			case GENERIC:
				UIBlocks.addOre(material.matName, material.hardness, "ore" + material.matName, material.harvestLevel, material.hexColor, material.baseTex);
				UIItems.addDust(material.matName, "dust" + material.matName, material.hexColor);
				UIItems.addIngot(material.matName, "ingot" + material.matName, material.hexColor);
				UIBlocks.addBlock(material.matName, material.hardness, "block" + material.matName, material.harvestLevel, material.hexColor);
				break;
			case METAL:
				UIItems.addDust(material.matName, "dust" + material.matName, material.hexColor);
				UIItems.addIngot(material.matName, "ingot" + material.matName, material.hexColor);
				UIBlocks.addBlock(material.matName, material.hardness, "block" + material.matName, material.harvestLevel, material.hexColor);
				break;
			case GEM:
				UIBlocks.addOre(material.matName, material.hardness, "ore" + material.matName, material.harvestLevel, material.hexColor, material.baseTex);
				UIItems.addDust(material.matName, "dust" + material.matName, material.hexColor);
				UIItems.addGem(material.matName, "gem" + material.matName, material.hexColor);
				UIBlocks.addBlock(material.matName, material.hardness, "block" + material.matName, material.harvestLevel, material.hexColor);
				break;
			case DUST:
				UIItems.addDust(material.matName, "dust" + material.matName, material.hexColor);
				break;
			case INGOT:
				UIItems.addIngot(material.matName, "ingot" + material.matName, material.hexColor);
				break;
			case BLOCK:
				UIBlocks.addBlock(material.matName, material.hardness, "block" + material.matName, material.harvestLevel, material.hexColor);
				break;
			default:
				System.out.println("Something dun broke");
				break;
			}
		}
	}
}
