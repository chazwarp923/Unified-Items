package tech.chazwarp923.unifieditems.modular.module;

import tech.chazwarp923.unifieditems.material.MaterialHandler;
import tech.chazwarp923.unifieditems.material.MaterialRegistry;
import tech.chazwarp923.unifieditems.modular.UIModule;

public class TinkersConstruct extends UIModule {

	public TinkersConstruct() {
		MaterialHandler.registerUse(MaterialRegistry.COPPER);
		MaterialHandler.registerUse(MaterialRegistry.TIN);
		MaterialHandler.registerUse(MaterialRegistry.BRONZE);
		MaterialHandler.registerUse(MaterialRegistry.SILVER);
		MaterialHandler.registerUse(MaterialRegistry.INVAR);
		MaterialHandler.registerUse(MaterialRegistry.ELECTRUM);
		MaterialHandler.registerUse(MaterialRegistry.PLATINUM);
		MaterialHandler.registerUse(MaterialRegistry.STEEL);
		MaterialHandler.registerUse(MaterialRegistry.ALUMINUM);
		MaterialHandler.registerUse(MaterialRegistry.COBALT);
		MaterialHandler.registerUse(MaterialRegistry.ARDITE);
	}
}
