/**
@author Chaz Kerby
*/
package com.chazwarp.unifieditems.modules;

import com.chazwarp.unifieditems.material.MaterialRegistry;

public class ThermalExpansion extends UIModule {

	@Override
	public void instantiateModule() {
		usesMaterial(MaterialRegistry.COPPER);
		usesMaterial(MaterialRegistry.TIN);
		usesMaterial(MaterialRegistry.BRONZE);
		usesMaterial(MaterialRegistry.SILVER);
		usesMaterial(MaterialRegistry.LEAD);
		usesMaterial(MaterialRegistry.NICKEL);
		usesMaterial(MaterialRegistry.PLATINUM);
		usesMaterial(MaterialRegistry.MITHRIL);
	}
}
