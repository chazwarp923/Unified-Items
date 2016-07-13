/**
@author Chaz Kerby
*/
package tech.chazwarp923.unifieditems.material;

import tech.chazwarp923.unifieditems.block.HarvestLevel;

public enum MaterialRegistry {
	
	COAL(MaterialType.DUST, "Coal"),
	IRON(MaterialType.DUST, "Iron"),
	GOLD(MaterialType.DUST, "Gold"),
	COPPER(MaterialType.GENERIC, "Copper", 2F, HarvestLevel.STONE, 40, 75, 8, 10, 1),
	TIN(MaterialType.GENERIC, "Tin", 2F, HarvestLevel.STONE, 20, 55, 8, 10, 1),
	BRONZE(MaterialType.ALLOY, "Bronze"),
	SILVER(MaterialType.GENERIC, "Silver", 2F, HarvestLevel.DIAMOND, 5, 30, 8, 10, 1),
	LEAD(MaterialType.GENERIC, "Lead", 2F, HarvestLevel.DIAMOND, 10, 35, 8, 10, 1),
	NICKEL(MaterialType.GENERIC, "Nickel", 2F, HarvestLevel.IRON, 5, 20, 4, 2, 1),
	INVAR(MaterialType.ALLOY, "Invar"),
	ELECTRUM(MaterialType.ALLOY, "Electrum"),
	PLATINUM(MaterialType.GENERIC, "Platinum", 2F, HarvestLevel.DIAMOND, 5, 15, 2, 2, 1),
	MITHRIL(MaterialType.GENERIC, "Mithril", 2F, HarvestLevel.DIAMOND, 5, 15, 2, 2, 1),
    ALUMINUM(MaterialType.GENERIC, "Aluminum", 2F, HarvestLevel.STONE, 40, 85, 8, 12, 1),
    URANIUM(MaterialType.GENERIC, "Uranium", 2F, HarvestLevel.DIAMOND, 5, 25, 2, 4, 1),
    STEEL(MaterialType.ALLOY, "Steel"),
    COBALT(MaterialType.GENERIC, "Cobalt", 2F, HarvestLevel.DIAMOND, 5, 120, 3, 4, 2),
    ARDITE(MaterialType.GENERIC, "Ardite", 2F, HarvestLevel.DIAMOND, 5, 120, 3, 4, 2),
    IRIDIUM(MaterialType.GENERIC, "Iridium", 2F, HarvestLevel.DIAMOND, 5, 10, 1, 1, 1);
	
	final MaterialType type;
	final String name;
	final float hardness;
	final HarvestLevel harvestLevel;
	
	MaterialRegistry(MaterialType type, String name, float hardness, HarvestLevel harvestLevel, int minY, int maxY, int perVein, int chunkDensity, int dimId) {
		this.type = type;
		this.name = name;
		this.hardness = hardness;
		this.harvestLevel = harvestLevel;
	}
	
	MaterialRegistry(MaterialType type, String name) {
		this.type = type;
		this.name = name;
		this.hardness = -1;
		this.harvestLevel = HarvestLevel.WOOD;
	}
}
