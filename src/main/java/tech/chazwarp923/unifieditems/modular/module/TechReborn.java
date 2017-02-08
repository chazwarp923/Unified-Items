/**
@author Chazwarp923
*/
package tech.chazwarp923.unifieditems.modular.module;

import java.util.ArrayList;

import tech.chazwarp923.unifieditems.material.Material;
import tech.chazwarp923.unifieditems.material.MaterialRegistry;
import tech.chazwarp923.unifieditems.modular.UIModule;

public class TechReborn extends UIModule {

	public TechReborn() {
		ArrayList<Material> materials = new ArrayList<Material>();
		materials.add(Material.COPPER);
		materials.add(Material.TIN);
		materials.add(Material.LEAD);
		materials.add(Material.SILVER);
		materials.add(Material.DIAMOND);
		materials.add(Material.RUBY);
		materials.add(Material.SAPPHIRE);
		materials.add(Material.IRIDIUM);
		materials.add(Material.BRASS);
		materials.add(Material.BRONZE);
		materials.add(Material.ELECTRUM);
		materials.add(Material.INVAR);
		materials.add(Material.NICKEL);
		materials.add(Material.PLATINUM);
		materials.add(Material.STEEL);
		materials.add(Material.ZINC);
		MaterialRegistry.registerUse(materials);
	}
}
