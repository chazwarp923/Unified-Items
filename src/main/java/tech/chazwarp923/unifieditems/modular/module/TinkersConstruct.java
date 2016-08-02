package tech.chazwarp923.unifieditems.modular.module;

import java.util.ArrayList;

import tech.chazwarp923.unifieditems.material.MaterialHandler;
import tech.chazwarp923.unifieditems.material.MaterialRegistry;
import tech.chazwarp923.unifieditems.modular.UIModule;

public class TinkersConstruct extends UIModule {

	public TinkersConstruct() {
		ArrayList<MaterialRegistry> materials = new ArrayList<MaterialRegistry>();
		materials.add(MaterialRegistry.COPPER);
		materials.add(MaterialRegistry.TIN);
		materials.add(MaterialRegistry.BRONZE);
		materials.add(MaterialRegistry.SILVER);
		materials.add(MaterialRegistry.INVAR);
		materials.add(MaterialRegistry.ELECTRUM);
		materials.add(MaterialRegistry.PLATINUM);
		materials.add(MaterialRegistry.STEEL);
		materials.add(MaterialRegistry.ALUMINUM);
		materials.add(MaterialRegistry.COBALT);
		materials.add(MaterialRegistry.ARDITE);
		MaterialHandler.registerMaterialUse(materials);
	}
}
