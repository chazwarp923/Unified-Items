package tech.chazwarp923.unifieditems.modular.module;

import java.util.ArrayList;

import tech.chazwarp923.unifieditems.material.Material;
import tech.chazwarp923.unifieditems.material.MaterialRegistry;
import tech.chazwarp923.unifieditems.modular.UIModule;

public class TechExpansion extends UIModule {

	public TechExpansion() {
		ArrayList<Material> materials = new ArrayList<Material>();
		materials.add(Material.COAL);
		materials.add(Material.COPPER);
		materials.add(Material.TIN);
		materials.add(Material.SILVER);
		materials.add(Material.LEAD);
		materials.add(Material.ELECTRUM);
		materials.add(Material.INVAR);
		materials.add(Material.NICKEL);
		materials.add(Material.PLATINUM);
		materials.add(Material.DIAMOND);
		MaterialRegistry.registerUse(materials);
	}
}
