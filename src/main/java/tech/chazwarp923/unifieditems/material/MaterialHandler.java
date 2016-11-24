/**
@author Chaz Kerby
*/
package tech.chazwarp923.unifieditems.material;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.Level;

import tech.chazwarp923.unifieditems.UnifiedItems;
import tech.chazwarp923.unifieditems.block.UIBlocks;
import tech.chazwarp923.unifieditems.item.UIItems;

public class MaterialHandler {
	
	private static Map<MaterialRegistry, Integer> materials = new HashMap<MaterialRegistry, Integer>();
	
	public static void registerMaterialUse(ArrayList<MaterialRegistry> materialsToBeAdded) {
		for(MaterialRegistry material : materialsToBeAdded) {
			addToMap(material);
		}
	}
	
	protected static void addToMap(MaterialRegistry mat) {
		if(materials.containsKey(mat)) {
			materials.put(mat, materials.get(mat) + 1);
		}
		else {
			materials.put(mat, 1);
		}
	}
	
	public static int getMaterialUseCount(MaterialRegistry mat) {
		return materials.get(mat);
	}
	
	public static Map<MaterialRegistry, Integer> getMaterials() {
		return materials;
	}

	public static void addBlocksAndItemsForMaterials() {
		for(MaterialRegistry material : materials.keySet()) {
			switch(material.type) {
			case GENERIC:
				UIBlocks.addOre(material, material.hardness, "ore_" + material.name.toLowerCase(), material.harvestLevel);
				UIItems.addDust(material, "dust_" + material.name.toLowerCase().toLowerCase());
				UIItems.addIngot(material, "ingot_" + material.name.toLowerCase());
				UIItems.addNugget(material, "nugget_" + material.name.toLowerCase());
				UIBlocks.addBlock(material, material.hardness, "block_" + material.name.toLowerCase(), material.harvestLevel);
				break;
			case ALLOY:
				UIItems.addDust(material, "dust_" + material.name.toLowerCase());
				UIItems.addIngot(material, "ingot_" + material.name.toLowerCase());
				UIItems.addNugget(material, "nugget_" + material.name.toLowerCase());
				UIBlocks.addBlock(material, material.hardness, "block_" + material.name.toLowerCase(), material.harvestLevel);
				break;
			case GENERIC_GEM:
				UIBlocks.addOre(material, material.hardness, "ore_" + material.name.toLowerCase(), material.harvestLevel);
				UIItems.addDust(material, "dust_" + material.name.toLowerCase());
				UIItems.addGem(material, "gem_" + material.name.toLowerCase());
				UIBlocks.addBlock(material, material.hardness, "block_" + material.name.toLowerCase(), material.harvestLevel);
				break;
			case DUST:
				UIItems.addDust(material, "dust_" + material.name.toLowerCase());
				break;
			case INGOT:
				UIItems.addIngot(material, "ingot_" + material.name.toLowerCase());
				break;
			case NUGGET:
				UIItems.addNugget(material, "nugget_" + material.name.toLowerCase());
				break;
			case GEM:
				UIItems.addGem(material, "gem_" + material.name.toLowerCase());
				break;
			case BLOCK:
				UIBlocks.addBlock(material, material.hardness, "block_" + material.name.toLowerCase(), material.harvestLevel);
				break;
			default:
				UnifiedItems.logger.log(Level.ERROR, "Invalid material enum passed for " + material.toString() );
				break;
			}
		}
	}
}
