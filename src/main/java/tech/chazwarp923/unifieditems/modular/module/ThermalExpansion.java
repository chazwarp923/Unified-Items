/**
@author Chaz Kerby
*/
package tech.chazwarp923.unifieditems.modular.module;

import tech.chazwarp923.unifieditems.material.MaterialHandler;
import tech.chazwarp923.unifieditems.material.MaterialRegistry;
import tech.chazwarp923.unifieditems.modular.UIModule;

public class ThermalExpansion extends UIModule {

	public ThermalExpansion() {
		MaterialHandler.registerUse(MaterialRegistry.COAL);
		MaterialHandler.registerUse(MaterialRegistry.COPPER);
		MaterialHandler.registerUse(MaterialRegistry.TIN);
		MaterialHandler.registerUse(MaterialRegistry.BRONZE);
		MaterialHandler.registerUse(MaterialRegistry.SILVER);
		MaterialHandler.registerUse(MaterialRegistry.LEAD);
		MaterialHandler.registerUse(MaterialRegistry.NICKEL);
		MaterialHandler.registerUse(MaterialRegistry.INVAR);
		MaterialHandler.registerUse(MaterialRegistry.ELECTRUM);
		MaterialHandler.registerUse(MaterialRegistry.PLATINUM);
		MaterialHandler.registerUse(MaterialRegistry.MITHRIL);
	}
}
