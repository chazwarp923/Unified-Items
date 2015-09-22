/**
@author Chaz Kerby
*/
package com.chazwarp.unifieditems.modular.modules;

import com.chazwarp.unifieditems.material.MaterialRegistry;
import com.chazwarp.unifieditems.modular.UIModule;

public class ThermalExpansion extends UIModule {

	public ThermalExpansion() {
		usesMaterial(MaterialRegistry.COAL);
		usesMaterial(MaterialRegistry.COPPER);
		usesMaterial(MaterialRegistry.TIN);
		usesMaterial(MaterialRegistry.BRONZE);
		usesMaterial(MaterialRegistry.SILVER);
		usesMaterial(MaterialRegistry.LEAD);
		usesMaterial(MaterialRegistry.NICKEL);
		usesMaterial(MaterialRegistry.INVAR);
		usesMaterial(MaterialRegistry.ELECTRUM);
		usesMaterial(MaterialRegistry.PLATINUM);
		usesMaterial(MaterialRegistry.MITHRIL);
	}
}
