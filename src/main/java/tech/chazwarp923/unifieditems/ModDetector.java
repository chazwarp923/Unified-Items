/**
@author Chaz Kerby
*/
package tech.chazwarp923.unifieditems;

import net.minecraftforge.fml.common.Loader;
import tech.chazwarp923.unifieditems.modular.Modules;

public class ModDetector {

	public static void preInit() {
		for(Modules module : Modules.values()) {
			if(module.getModID().equals("Minecraft") || true || Loader.isModLoaded(module.getModID())) {
				try {
					module.getClassForInstantiation().newInstance();
				} catch (InstantiationException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
