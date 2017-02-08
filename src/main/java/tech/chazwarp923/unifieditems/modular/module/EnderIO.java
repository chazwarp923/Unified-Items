/**
@author Chazwarp923
*/
package tech.chazwarp923.unifieditems.modular.module;

import java.util.ArrayList;

import tech.chazwarp923.unifieditems.material.Material;
import tech.chazwarp923.unifieditems.material.MaterialRegistry;
import tech.chazwarp923.unifieditems.modular.UIModule;

public class EnderIO extends UIModule {

	public EnderIO() {
		ArrayList<Material> materials = new ArrayList<Material>();
		materials.add(Material.COAL);
		materials.add(Material.OBSIDIAN);
		MaterialRegistry.registerUse(materials);
	}
}
