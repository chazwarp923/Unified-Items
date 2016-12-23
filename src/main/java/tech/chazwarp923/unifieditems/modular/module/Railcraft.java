/**
@author Chaz Kerby
*/
package tech.chazwarp923.unifieditems.modular.module;

import java.util.ArrayList;

import tech.chazwarp923.unifieditems.material.Material;
import tech.chazwarp923.unifieditems.material.MaterialRegistry;
import tech.chazwarp923.unifieditems.modular.UIModule;

public class Railcraft extends UIModule {
	
	public Railcraft() {
		ArrayList<Material> materials = new ArrayList<Material>();
		materials.add(Material.COPPER);
		materials.add(Material.TIN);
		materials.add(Material.LEAD);
		materials.add(Material.STEEL);
		materials.add(Material.OBSIDIAN);
		MaterialRegistry.registerUse(materials);
	}
}
