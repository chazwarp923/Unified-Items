/**
@author Chazwarp923
 */
package tech.chazwarp923.unifieditems.modular.module;

import java.util.ArrayList;

import tech.chazwarp923.unifieditems.material.Material;
import tech.chazwarp923.unifieditems.material.MaterialRegistry;
import tech.chazwarp923.unifieditems.modular.UIModule;

public class IC2 extends UIModule {

	public IC2() {
		ArrayList<Material> materials = new ArrayList<Material>();
		materials.add(Material.COAL);
		materials.add(Material.COPPER);
		materials.add(Material.TIN);
		materials.add(Material.BRONZE);
		materials.add(Material.SILVER);
		materials.add(Material.LEAD);
		materials.add(Material.DIAMOND);
		materials.add(Material.STEEL);
		materials.add(Material.OBSIDIAN);
		materials.add(Material.URANIUM);
		MaterialRegistry.registerUse(materials);
	}
}
