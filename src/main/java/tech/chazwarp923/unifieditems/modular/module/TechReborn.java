/**
@author Chaz Kerby
*/
package tech.chazwarp923.unifieditems.modular.module;

import java.util.ArrayList;

import tech.chazwarp923.unifieditems.material.MaterialHandler;
import tech.chazwarp923.unifieditems.material.MaterialRegistry;
import tech.chazwarp923.unifieditems.modular.UIModule;

public class TechReborn extends UIModule {

	public TechReborn() {
		ArrayList<MaterialRegistry> materials = new ArrayList<MaterialRegistry>();
		materials.add(MaterialRegistry.COPPER);
		materials.add(MaterialRegistry.TIN);
		materials.add(MaterialRegistry.LEAD);
		materials.add(MaterialRegistry.SILVER);
		materials.add(MaterialRegistry.RUBY);
		materials.add(MaterialRegistry.SAPPHIRE);
		materials.add(MaterialRegistry.IRIDIUM);
		materials.add(MaterialRegistry.BRASS);
		materials.add(MaterialRegistry.BRONZE);
		materials.add(MaterialRegistry.ELECTRUM);
		materials.add(MaterialRegistry.INVAR);
		materials.add(MaterialRegistry.NICKEL);
		materials.add(MaterialRegistry.PLATINUM);
		materials.add(MaterialRegistry.STEEL);
		materials.add(MaterialRegistry.ZINC);
		MaterialHandler.registerMaterialUse(materials);
	}
}
