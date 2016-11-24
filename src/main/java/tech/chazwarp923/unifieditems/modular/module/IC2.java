package tech.chazwarp923.unifieditems.modular.module;

import java.util.ArrayList;

import tech.chazwarp923.unifieditems.material.MaterialHandler;
import tech.chazwarp923.unifieditems.material.MaterialRegistry;
import tech.chazwarp923.unifieditems.modular.UIModule;

public class IC2 extends UIModule {

	public IC2() {
		ArrayList<MaterialRegistry> materials = new ArrayList<MaterialRegistry>();
		materials.add(MaterialRegistry.COAL);
		materials.add(MaterialRegistry.COPPER);
		materials.add(MaterialRegistry.TIN);
		materials.add(MaterialRegistry.BRONZE);
		materials.add(MaterialRegistry.SILVER);
		materials.add(MaterialRegistry.LEAD);
		materials.add(MaterialRegistry.STEEL);
		materials.add(MaterialRegistry.OBSIDIAN);
		materials.add(MaterialRegistry.URANIUM);
		MaterialHandler.registerMaterialUse(materials);
	}
}
