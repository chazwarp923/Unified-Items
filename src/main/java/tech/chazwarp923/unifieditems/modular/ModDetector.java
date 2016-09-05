/**
@author Chaz Kerby
*/
package tech.chazwarp923.unifieditems.modular;

import net.minecraftforge.fml.common.Loader;

public class ModDetector {

	public static void preInit() {
		for(Modules module : Modules.values()) {
			if(module.getModID().equals("Minecraft") || Loader.isModLoaded(module.getModID()) || System.getProperty("user.name").equals("chaz")) {
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
