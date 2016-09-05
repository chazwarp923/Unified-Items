/**
@author Chaz Kerby
*/
package tech.chazwarp923.unifieditems.modular.module;

import java.util.ArrayList;

import tech.chazwarp923.unifieditems.material.MaterialHandler;
import tech.chazwarp923.unifieditems.material.MaterialRegistry;
import tech.chazwarp923.unifieditems.modular.UIModule;

public class ImmersiveEngineering extends UIModule {

	public ImmersiveEngineering() {
		ArrayList<MaterialRegistry> materials = new ArrayList<MaterialRegistry>();
		materials.add(MaterialRegistry.COPPER);
		materials.add(MaterialRegistry.ALUMINUM);
		materials.add(MaterialRegistry.SILVER);
		materials.add(MaterialRegistry.LEAD);
		materials.add(MaterialRegistry.NICKEL);
		materials.add(MaterialRegistry.ELECTRUM);
		materials.add(MaterialRegistry.STEEL);
		materials.add(MaterialRegistry.URANIUM);
		MaterialHandler.registerMaterialUse(materials);
	}
}
