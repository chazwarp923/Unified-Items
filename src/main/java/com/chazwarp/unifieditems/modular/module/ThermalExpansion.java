/**
@author Chaz Kerby
*/
package com.chazwarp.unifieditems.modular.module;

import com.chazwarp.unifieditems.material.MaterialHandler;
import com.chazwarp.unifieditems.material.MaterialRegistry;
import com.chazwarp.unifieditems.modular.UIModule;

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
