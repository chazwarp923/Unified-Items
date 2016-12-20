/**
@author Chaz Kerby
*/
package tech.chazwarp923.unifieditems.modular.module;

import java.util.ArrayList;

import tech.chazwarp923.unifieditems.material.Material;
import tech.chazwarp923.unifieditems.material.MaterialRegistry;
import tech.chazwarp923.unifieditems.modular.UIModule;

public class ImmersiveEngineering extends UIModule {

	public ImmersiveEngineering() {
		ArrayList<Material> materials = new ArrayList<Material>();
		materials.add(Material.COPPER);
		materials.add(Material.ALUMINUM);
		materials.add(Material.SILVER);
		materials.add(Material.LEAD);
		materials.add(Material.NICKEL);
		materials.add(Material.ELECTRUM);
		materials.add(Material.STEEL);
		materials.add(Material.URANIUM);
		MaterialRegistry.registerUse(materials);
	}
}
