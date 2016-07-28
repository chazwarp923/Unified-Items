/**
@author Chaz Kerby
*/
package tech.chazwarp923.unifieditems.material;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.Level;

import tech.chazwarp923.unifieditems.UnifiedItems;
import tech.chazwarp923.unifieditems.block.UIBlocks;
import tech.chazwarp923.unifieditems.item.UIItems;

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
	
	public static int getMaterialUseCount(MaterialRegistry mat) {
		return materialUseCount.get(mat);
	}
	
	public static void addBlocksAndItemsForMaterials() {
		for(MaterialRegistry material : materialUseCount.keySet()) {
			switch(material.type) {
			case GENERIC:
				UIBlocks.addOre(material, material.hardness, "ore" + material.name, material.harvestLevel);
				UIItems.addDust(material, "dust" + material.name);
				UIItems.addIngot(material, "ingot" + material.name);
				UIItems.addNugget(material, "nugget" + material.name);
				UIBlocks.addBlock(material, material.hardness, "block" + material.name, material.harvestLevel);
				break;
			case ALLOY:
				UIItems.addDust(material, "dust" + material.name);
				UIItems.addIngot(material, "ingot" + material.name);
				UIItems.addNugget(material, "nugget" + material.name);
				UIBlocks.addBlock(material, material.hardness, "block" + material.name, material.harvestLevel);
				break;
			case GENERIC_GEM:
				UIBlocks.addOre(material, material.hardness, "ore" + material.name, material.harvestLevel);
				UIItems.addDust(material, "dust" + material.name);
				UIItems.addGem(material, "gem" + material.name);
				UIBlocks.addBlock(material, material.hardness, "block" + material.name, material.harvestLevel);
				break;
			case DUST:
				UIItems.addDust(material, "dust" + material.name);
				break;
			case INGOT:
				UIItems.addIngot(material, "ingot" + material.name);
				break;
			case NUGGET:
				UIItems.addNugget(material, "nugget" + material.name);
				break;
			case GEM:
				UIItems.addGem(material, "gem" + material.name);
				break;
			case BLOCK:
				UIBlocks.addBlock(material, material.hardness, "block" + material.name, material.harvestLevel);
				break;
			default:
				UnifiedItems.logger.log(Level.ERROR, "Invalid material enum passed for " + material.toString() );
				break;
			}
		}
	}
}
