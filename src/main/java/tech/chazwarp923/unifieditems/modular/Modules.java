/**
@author Chaz Kerby
*/
package tech.chazwarp923.unifieditems.modular;

import tech.chazwarp923.unifieditems.modular.module.Minecraft;
import tech.chazwarp923.unifieditems.modular.module.ThermalExpansion;

public enum Modules {

	MINECRAFT("Minecraft", Minecraft.class),
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
