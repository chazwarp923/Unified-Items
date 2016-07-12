package tech.chazwarp923.unifieditems.modular.module;

import tech.chazwarp923.unifieditems.material.MaterialHandler;
import tech.chazwarp923.unifieditems.material.MaterialRegistry;
import tech.chazwarp923.unifieditems.modular.UIModule;

public class Forestry extends UIModule {

	public Forestry() {
		MaterialHandler.registerUse(MaterialRegistry.COPPER);
		MaterialHandler.registerUse(MaterialRegistry.TIN);
		MaterialHandler.registerUse(MaterialRegistry.BRONZE);
	}
}
