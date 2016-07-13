/**
@author Chaz Kerby
*/
package tech.chazwarp923.unifieditems.material;

import tech.chazwarp923.unifieditems.block.HarvestLevel;

public enum MaterialRegistry {
	
	COAL(MaterialType.DUST, "Coal"),
	IRON(MaterialType.DUST, "Iron"),
	GOLD(MaterialType.DUST, "Gold"),
	COPPER(MaterialType.GENERIC, "Copper", 2F, HarvestLevel.STONE),
	TIN(MaterialType.GENERIC, "Tin", 2F, HarvestLevel.STONE),
	BRONZE(MaterialType.ALLOY, "Bronze"),
	SILVER(MaterialType.GENERIC, "Silver", 2F, HarvestLevel.DIAMOND),
	LEAD(MaterialType.GENERIC, "Lead", 2F, HarvestLevel.DIAMOND),
	NICKEL(MaterialType.GENERIC, "Nickel", 2F, HarvestLevel.IRON),
	INVAR(MaterialType.ALLOY, "Invar"),
	ELECTRUM(MaterialType.ALLOY, "Electrum"),
	PLATINUM(MaterialType.GENERIC, "Platinum", 2F, HarvestLevel.DIAMOND),
	MITHRIL(MaterialType.GENERIC, "Mithril", 2F, HarvestLevel.DIAMOND),
    ALUMINUM(MaterialType.GENERIC, "Aluminum", 2F, HarvestLevel.STONE),
    URANIUM(MaterialType.GENERIC, "Uranium", 2F, HarvestLevel.DIAMOND),
    STEEL(MaterialType.ALLOY, "Steel"),
    COBALT(MaterialType.GENERIC, "Cobalt", 2F, HarvestLevel.DIAMOND),
    ARDITE(MaterialType.GENERIC, "Ardite", 2F, HarvestLevel.DIAMOND),
    IRIDIUM(MaterialType.GENERIC, "Iridium", 2F, HarvestLevel.DIAMOND);
	
	final MaterialType type;
	final String name;
	final float hardness;
	final HarvestLevel harvestLevel;
	
	MaterialRegistry(MaterialType types, String name, float hardness, HarvestLevel harvestLevel) {
		this.type = types;
		this.name = name;
		this.hardness = hardness;
		this.harvestLevel = harvestLevel;
	}
	
	MaterialRegistry(MaterialType types, String name) {
		this.type = types;
		this.name = name;
		this.hardness = -1;
		this.harvestLevel = HarvestLevel.WOOD;
	}
}
