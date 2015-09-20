/**
@author Chaz Kerby
*/
package com.chazwarp.unifieditems.modular.modules;

import com.chazwarp.unifieditems.material.MaterialRegistry;
import com.chazwarp.unifieditems.modular.UIModule;

public class Minecraft extends UIModule {
	
	public Minecraft() {
		usesMaterial(MaterialRegistry.IRON);
		usesMaterial(MaterialRegistry.GOLD);
	}
}
