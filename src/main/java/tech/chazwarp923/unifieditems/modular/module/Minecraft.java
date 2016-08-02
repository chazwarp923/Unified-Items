/**
@author Chaz Kerby
*/
package tech.chazwarp923.unifieditems.modular.module;

import java.util.ArrayList;

import tech.chazwarp923.unifieditems.material.MaterialHandler;
import tech.chazwarp923.unifieditems.material.MaterialRegistry;
import tech.chazwarp923.unifieditems.modular.UIModule;

public class Minecraft extends UIModule {

	public Minecraft() {
		ArrayList<MaterialRegistry> materials = new ArrayList<MaterialRegistry>();
		materials.add(MaterialRegistry.IRON);
		materials.add(MaterialRegistry.GOLD);
		MaterialHandler.registerMaterialUse(materials);
	}
}
