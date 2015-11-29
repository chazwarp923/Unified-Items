/**
@author Chaz Kerby
*/
package com.chazwarp.unifieditems.modular.modules;

import com.chazwarp.unifieditems.material.MaterialHandler;
import com.chazwarp.unifieditems.material.MaterialRegistry;
import com.chazwarp.unifieditems.modular.UIModule;

public class Minecraft extends UIModule {
	
	public Minecraft() {
		MaterialHandler.registerUse(MaterialRegistry.IRON);
		MaterialHandler.registerUse(MaterialRegistry.GOLD);
	}
}
