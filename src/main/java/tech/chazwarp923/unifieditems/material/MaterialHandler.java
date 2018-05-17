/**
@author Chazwarp923
*/
package tech.chazwarp923.unifieditems.material;

import org.apache.logging.log4j.Level;

import tech.chazwarp923.unifieditems.UnifiedItems;
import tech.chazwarp923.unifieditems.block.UIBlocks;
import tech.chazwarp923.unifieditems.item.UIItems;

public class MaterialHandler {

	public static void addBlocksAndItemsForMaterials() {
		for(Material material : MaterialRegistry.enabledMaterials.keySet()) {
			if(MaterialRegistry.enabledMaterials.get(material)) {
				switch(material.type) {
				case GENERIC:
					UIBlocks.addMetalOre(material, material.hardness, "ore_" + material.name.toLowerCase(), material.harvestLevel);
					UIItems.addDust(material, "dust_" + material.name.toLowerCase().toLowerCase());
					UIItems.addIngot(material, "ingot_" + material.name.toLowerCase());
					UIItems.addNugget(material, "nugget_" + material.name.toLowerCase());
					UIItems.addPlate(material, "plate_" + material.name.toLowerCase());
					UIItems.addGear(material, "gear_" + material.name.toLowerCase());
					UIBlocks.addBlock(material, material.hardness, "block_" + material.name.toLowerCase(), material.harvestLevel);
					break;
				case ALLOY:
					UIItems.addDust(material, "dust_" + material.name.toLowerCase());
					UIItems.addIngot(material, "ingot_" + material.name.toLowerCase());
					UIItems.addNugget(material, "nugget_" + material.name.toLowerCase());
					UIItems.addPlate(material, "plate_" + material.name.toLowerCase());
					UIItems.addGear(material, "gear_" + material.name.toLowerCase());
					UIBlocks.addBlock(material, material.hardness, "block_" + material.name.toLowerCase(), material.harvestLevel);
					break;
				case GENERIC_GEM:
					UIBlocks.addGemOre(material, material.hardness, "ore_" + material.name.toLowerCase(), material.harvestLevel);
					UIItems.addDust(material, "dust_" + material.name.toLowerCase());
					UIItems.addGem(material, "gem_" + material.name.toLowerCase());
					UIBlocks.addBlock(material, material.hardness, "block_" + material.name.toLowerCase(), material.harvestLevel);
					break;
                case VANILLA:
                    UIItems.addDust(material, "dust_" + material.name.toLowerCase().toLowerCase());
                    UIItems.addPlate(material, "plate_" + material.name.toLowerCase());
                    UIItems.addGear(material, "gear_" + material.name.toLowerCase());
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
				case PLATE:
					UIItems.addPlate(material, "plate_" + material.name.toLowerCase());
					break;
				case GEAR:
					UIItems.addGear(material, "gear_" + material.name.toLowerCase());
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
}
