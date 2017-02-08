/**
@author Chazwarp923
*/
package tech.chazwarp923.unifieditems.modular.module;

import java.util.ArrayList;

import tech.chazwarp923.unifieditems.material.Material;
import tech.chazwarp923.unifieditems.material.MaterialRegistry;
import tech.chazwarp923.unifieditems.modular.UIModule;

public class Minecraft extends UIModule {

	public Minecraft() {
		ArrayList<Material> materials = new ArrayList<Material>();
		materials.add(Material.IRON);
		materials.add(Material.GOLD);
		MaterialRegistry.registerUse(materials);
	}
}
