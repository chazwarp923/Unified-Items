/**
@author Chazwarp923
*/
package tech.chazwarp923.unifieditems.modular.module;

import java.util.ArrayList;

import tech.chazwarp923.unifieditems.material.Material;
import tech.chazwarp923.unifieditems.material.MaterialRegistry;
import tech.chazwarp923.unifieditems.modular.UIModule;

public class VicsModernWarfare extends UIModule {

	public VicsModernWarfare() {
		ArrayList<Material> materials = new ArrayList<Material>();
		materials.add(Material.COPPER);
		materials.add(Material.TIN);
		materials.add(Material.BRONZE);
		materials.add(Material.LEAD);
		materials.add(Material.STEEL);
		materials.add(Material.ALUMINUM);
		materials.add(Material.RUBY);
		//materials.add(Material.SULFUR);
		MaterialRegistry.registerUse(materials);
	}
}
