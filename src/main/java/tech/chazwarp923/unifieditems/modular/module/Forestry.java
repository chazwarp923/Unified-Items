/**
@author Chazwarp923
 */
package tech.chazwarp923.unifieditems.modular.module;

import java.util.ArrayList;

import tech.chazwarp923.unifieditems.material.Material;
import tech.chazwarp923.unifieditems.material.MaterialRegistry;
import tech.chazwarp923.unifieditems.modular.UIModule;

public class Forestry extends UIModule {

	public Forestry() {
		ArrayList<Material> materials = new ArrayList<Material>();
		materials.add(Material.COPPER);
		materials.add(Material.TIN);
		materials.add(Material.BRONZE);
		MaterialRegistry.registerUse(materials);
	}
}
