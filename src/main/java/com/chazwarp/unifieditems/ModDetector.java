/**
@author Chaz Kerby
*/
package com.chazwarp.unifieditems;

import com.chazwarp.unifieditems.modular.Modules;

import net.minecraftforge.fml.common.Loader;

public class ModDetector {

	public static void preInit() {
		for(Modules module : Modules.values()) {
			if(module.getModID().equals("Minecraft") || Loader.isModLoaded(module.getModID())) {
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
