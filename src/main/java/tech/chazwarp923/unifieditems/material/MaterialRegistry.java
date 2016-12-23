/**
@author Chaz Kerby
*/
package tech.chazwarp923.unifieditems.material;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.logging.log4j.Level;

import tech.chazwarp923.unifieditems.UnifiedItems;
import tech.chazwarp923.unifieditems.config.ConfigHandler;

public class MaterialRegistry {
    						//Material, State(Enabled/Disabled)
		public static HashMap<Material, Boolean> enabledMaterials = new HashMap<Material, Boolean>();
		public static HashMap<Material, Integer> materialUsage = new HashMap<Material, Integer>();

		public static void populate() {
			for(Material mat : Material.values()) {
				enabledMaterials.put(mat, false);
				materialUsage.put(mat, 0);
			}
		}

		public static void registerUse(ArrayList<Material> materialList) {
			for(Material mat : materialList) {
				enabledMaterials.put(mat, true);
				materialUsage.put(mat, materialUsage.get(mat) + 1);
			}
		}

		public static void setEnabled() {
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
						UnifiedItems.logger.log(Level.ERROR, "ERROR: INVALID VALUE PASSED IN MANUAL OVERRIDE FOR " + mat.name.toUpperCase());
				}
			}
		}

		public static int getUseCount(Material mat) {
			return materialUsage.get(mat);
		}
}
