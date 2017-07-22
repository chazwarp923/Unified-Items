/**
@author Chazwarp923
 */
package tech.chazwarp923.unifieditems.material;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.logging.log4j.Level;

import tech.chazwarp923.unifieditems.UnifiedItems;
import tech.chazwarp923.unifieditems.config.ConfigHandler;

public class MaterialRegistry {
	                    //Material, State(Enabled/Disabled)
	public static HashMap<Material, Boolean> enabledMaterials = new HashMap<Material, Boolean>();
	public static ArrayList<Material> ores = new ArrayList<Material>();
	public static ArrayList<Material> dusts = new ArrayList<Material>();
	public static ArrayList<Material> ingots = new ArrayList<Material>();
	public static ArrayList<Material> nuggets = new ArrayList<Material>();
	public static ArrayList<Material> gems = new ArrayList<Material>();
	public static ArrayList<Material> plates = new ArrayList<Material>();
	public static ArrayList<Material> gears = new ArrayList<Material>();
	public static ArrayList<Material> blocks = new ArrayList<Material>();
	
	public static void populate() {
		for(Material mat : Material.values()) {
			//ModelJsonHelper.generateJson(mat);
			enabledMaterials.put(mat, false);
			switch(mat.type) {
				case GENERIC:
					ores.add(mat);
					dusts.add(mat);
					ingots.add(mat);
					nuggets.add(mat);
					plates.add(mat);
					gears.add(mat);
					blocks.add(mat);
					break;
				case ALLOY:
					dusts.add(mat);
					ingots.add(mat);
					nuggets.add(mat);
					plates.add(mat);
					gears.add(mat);
					blocks.add(mat);
					break;
				case GENERIC_GEM:
					ores.add(mat);
					dusts.add(mat);
					gems.add(mat);
					blocks.add(mat);
					break;
				case DUST:
					dusts.add(mat);
					break;
				case INGOT:
					ingots.add(mat);
					break;
				case NUGGET:
					nuggets.add(mat);
					break;
				case GEM:
					gems.add(mat);
					break;
				case PLATE:
					plates.add(mat);
					break;
				case GEAR:
					gears.add(mat);
					break;
				case BLOCK:
					blocks.add(mat);
					break;
				default:
					UnifiedItems.logger.log(Level.ERROR, "ERROR: Material:" + mat + " has an incorrect type");
					break;
			}
		}
	}
	
	public static void setEnabled(List<Material> materialsToEnable) {
		if(materialsToEnable != null) {
			for(Material mat : materialsToEnable) {
				enabledMaterials.put(mat, true);
			}
		}
		for(Material mat : ConfigHandler.manualOverride.keySet()) {
			switch(ConfigHandler.manualOverride.get(mat)) {
				case 0:
					break;
				case -1:
					enabledMaterials.put(mat, false);
					break;
				case 1:
					enabledMaterials.put(mat, true);
					break;
				default:
					throw new UnsupportedOperationException("INVALID VALUE PASSED IN MANUAL OVERRIDE FOR " + mat.name.toUpperCase());
			}
		}
	}
}
