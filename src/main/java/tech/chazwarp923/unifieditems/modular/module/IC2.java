package tech.chazwarp923.unifieditems.modular.module;

import tech.chazwarp923.unifieditems.material.MaterialHandler;
import tech.chazwarp923.unifieditems.material.MaterialRegistry;
import tech.chazwarp923.unifieditems.modular.UIModule;

public class IC2 extends UIModule {

	public IC2() {
		MaterialHandler.registerUse(MaterialRegistry.COPPER);
		MaterialHandler.registerUse(MaterialRegistry.TIN);
		MaterialHandler.registerUse(MaterialRegistry.BRONZE);
		MaterialHandler.registerUse(MaterialRegistry.SILVER);
		MaterialHandler.registerUse(MaterialRegistry.LEAD);
		MaterialHandler.registerUse(MaterialRegistry.STEEL);
		MaterialHandler.registerUse(MaterialRegistry.URANIUM);
		MaterialHandler.registerUse(MaterialRegistry.IRIDIUM);
	}
}
