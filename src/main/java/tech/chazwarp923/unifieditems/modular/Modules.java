/**
@author Chaz Kerby
*/
package tech.chazwarp923.unifieditems.modular;

import tech.chazwarp923.unifieditems.modular.module.DenseOres;
import tech.chazwarp923.unifieditems.modular.module.EnderIO;
import tech.chazwarp923.unifieditems.modular.module.Forestry;
import tech.chazwarp923.unifieditems.modular.module.IC2;
import tech.chazwarp923.unifieditems.modular.module.ImmersiveEngineering;
import tech.chazwarp923.unifieditems.modular.module.Minecraft;
import tech.chazwarp923.unifieditems.modular.module.Railcraft;
import tech.chazwarp923.unifieditems.modular.module.TechExpansion;
import tech.chazwarp923.unifieditems.modular.module.TechReborn;
import tech.chazwarp923.unifieditems.modular.module.ThermalExpansion;
import tech.chazwarp923.unifieditems.modular.module.TinkersConstruct;

public enum Modules {

	MINECRAFT("Minecraft", Minecraft.class),
	FORESTRY("forestry", Forestry.class),
	IC2("IC2", IC2.class),
	TINKERSCONSTRUCT("tconstruct", TinkersConstruct.class),
	THERMALEXPANSION("ThermalExpansion", ThermalExpansion.class),
	TECHREBORN("techreborn", TechReborn.class),
	ENDERIO("EnderIO", EnderIO.class),
	IMMERSIVEENGINEERING("immersiveengineering", ImmersiveEngineering.class),
	RAILCRAFT("railcraft", Railcraft.class),
	DENSEORES("denseores", DenseOres.class),
	TECHEXPANSION("techexpansion", TechExpansion.class);
	
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
