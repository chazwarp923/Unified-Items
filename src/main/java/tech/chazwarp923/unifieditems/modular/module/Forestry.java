package tech.chazwarp923.unifieditems.modular.module;

import java.util.ArrayList;

import tech.chazwarp923.unifieditems.material.MaterialHandler;
import tech.chazwarp923.unifieditems.material.MaterialRegistry;
import tech.chazwarp923.unifieditems.modular.UIModule;

public class Forestry extends UIModule {

	public Forestry() {
		ArrayList<MaterialRegistry> materials = new ArrayList<MaterialRegistry>();
		materials.add(MaterialRegistry.COPPER);
		materials.add(MaterialRegistry.TIN);
		materials.add(MaterialRegistry.BRONZE);
		MaterialHandler.registerMaterialUse(materials);
	}
}
