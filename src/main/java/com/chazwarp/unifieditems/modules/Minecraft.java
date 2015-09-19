/**
@author Chaz Kerby
*/
package com.chazwarp.unifieditems.modules;

import com.chazwarp.unifieditems.material.MaterialRegistry;

public class Minecraft extends UIModule {
	
	@Override
	public void instantiateModule() {
		usesMaterial(MaterialRegistry.IRON);
		usesMaterial(MaterialRegistry.GOLD);
	}
}
