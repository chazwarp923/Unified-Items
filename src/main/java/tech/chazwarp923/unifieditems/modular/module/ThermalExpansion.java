/**
@author Chazwarp923
*/
package tech.chazwarp923.unifieditems.modular.module;

import java.util.ArrayList;

import tech.chazwarp923.unifieditems.material.Material;
import tech.chazwarp923.unifieditems.material.MaterialRegistry;
import tech.chazwarp923.unifieditems.modular.UIModule;

public class ThermalExpansion extends UIModule {

	public ThermalExpansion() {
		ArrayList<Material> materials = new ArrayList<Material>();
		materials.add(Material.COAL);
		materials.add(Material.COPPER);
		materials.add(Material.TIN);
		materials.add(Material.BRONZE);
		materials.add(Material.ALUMINUM);
		materials.add(Material.SILVER);
		materials.add(Material.LEAD);
		materials.add(Material.NICKEL);
		materials.add(Material.INVAR);
		materials.add(Material.ELECTRUM);
		materials.add(Material.CONSTANTAN);
		materials.add(Material.STEEL);
		materials.add(Material.OBSIDIAN);
		materials.add(Material.PLATINUM);
		materials.add(Material.MITHRIL);
		materials.add(Material.IRIDIUM);
		MaterialRegistry.registerUse(materials);
	}
}
