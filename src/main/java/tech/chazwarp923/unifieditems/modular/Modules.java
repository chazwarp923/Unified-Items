/**
@author Chaz Kerby
*/
package tech.chazwarp923.unifieditems.modular;

import tech.chazwarp923.unifieditems.modular.module.Forestry;
import tech.chazwarp923.unifieditems.modular.module.IC2;
import tech.chazwarp923.unifieditems.modular.module.Minecraft;
import tech.chazwarp923.unifieditems.modular.module.ThermalExpansion;
import tech.chazwarp923.unifieditems.modular.module.TinkersConstruct;

public enum Modules {

	MINECRAFT("Minecraft", Minecraft.class),
	FORESTRY("ForestryforMinecraft", Forestry.class),
	IC2("ic2", IC2.class),
	TINKERSCONSTRUCT("TinkersConstruct", TinkersConstruct.class),
	THERMALEXPANSION("ThermalExpansion", ThermalExpansion.class);
	
	final String modid;
	final Class<? extends UIModule> module;
	
	Modules(String modid, Class<? extends UIModule> module) {
		this.modid = modid;
		this.module = module;
	}
	
	public String getModID() {
		return this.modid;
	}
	
	public Class<? extends UIModule> getClassForInstantiation() {
		return this.module;
	}
}
