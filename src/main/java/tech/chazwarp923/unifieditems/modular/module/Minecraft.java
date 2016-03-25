/**
@author Chaz Kerby
*/
package tech.chazwarp923.unifieditems.modular.module;

import tech.chazwarp923.unifieditems.material.MaterialHandler;
import tech.chazwarp923.unifieditems.material.MaterialRegistry;
import tech.chazwarp923.unifieditems.modular.UIModule;

public class Minecraft extends UIModule {
	
	public Minecraft() {
		MaterialHandler.registerUse(MaterialRegistry.IRON);
		MaterialHandler.registerUse(MaterialRegistry.GOLD);
	}
}
