/**
@author Chaz Kerby
*/
package tech.chazwarp923.unifieditems.material;

import tech.chazwarp923.unifieditems.block.HarvestLevel;

public enum MaterialRegistry {
	
	COAL(MaterialType.DUST, "Coal"),
	IRON(MaterialType.DUST, "Iron"),
	GOLD(MaterialType.DUST, "Gold"),
	COPPER(MaterialType.GENERIC, "Copper", 2F, HarvestLevel.STONE, 40, 75, 8, 10, 0),
	TIN(MaterialType.GENERIC, "Tin", 2F, HarvestLevel.STONE, 20, 55, 8, 10, 0),
	BRONZE(MaterialType.ALLOY, "Bronze"),
	SILVER(MaterialType.GENERIC, "Silver", 2F, HarvestLevel.DIAMOND, 5, 30, 8, 10, 0),
	LEAD(MaterialType.GENERIC, "Lead", 2F, HarvestLevel.DIAMOND, 10, 35, 8, 10, 0),
	NICKEL(MaterialType.GENERIC, "Nickel", 2F, HarvestLevel.IRON, 5, 20, 4, 2, 0),
	INVAR(MaterialType.ALLOY, "Invar"),
	ELECTRUM(MaterialType.ALLOY, "Electrum"),
	OBSIDIAN(MaterialType.DUST, "Obsidian"),
	PLATINUM(MaterialType.GENERIC, "Platinum", 2F, HarvestLevel.DIAMOND, 5, 15, 2, 2, 0),
	MITHRIL(MaterialType.GENERIC, "Mithril", 2F, HarvestLevel.DIAMOND, 5, 15, 2, 2, 0),
    ALUMINUM(MaterialType.GENERIC, "Aluminum", 2F, HarvestLevel.STONE, 40, 85, 8, 12, 0),
    URANIUM(MaterialType.GENERIC, "Uranium", 2F, HarvestLevel.DIAMOND, 5, 25, 2, 4, 0),
    STEEL(MaterialType.ALLOY, "Steel"),
    COBALT(MaterialType.GENERIC, "Cobalt", 2F, HarvestLevel.DIAMOND, 5, 120, 3, 4, 1),
    ARDITE(MaterialType.GENERIC, "Ardite", 2F, HarvestLevel.DIAMOND, 5, 120, 3, 4, 1),
    IRIDIUM(MaterialType.GENERIC, "Iridium", 2F, HarvestLevel.DIAMOND, 5, 10, 1, 1, 0),
	RUBY(MaterialType.GENERIC_GEM, "Ruby", 2F, HarvestLevel.IRON, 10, 60, 6, 3, 0),
	SAPPHIRE(MaterialType.GENERIC_GEM, "Sapphire", 2F, HarvestLevel.IRON, 10, 60, 6, 3, 0),
	BRASS(MaterialType.ALLOY, "Brass"),
	ZINC(MaterialType.GENERIC, "Zinc", 2F, HarvestLevel.IRON, 20, 55, 7, 10, 0);
	
	public final MaterialType type;
	public final String name;
	public final float hardness;
	public final HarvestLevel harvestLevel;
	public final int minY;
	public final int maxY;
	public final int perVein;
	public final int chunkDensity;
	public final int dimId;
	
	MaterialRegistry(MaterialType type, String name, float hardness, HarvestLevel harvestLevel, int minY, int maxY, int perVein, int chunkDensity, int dimId) {
		this.type = type;
		this.name = name;
		this.hardness = hardness;
		this.harvestLevel = harvestLevel;
		this.minY = minY;
		this.maxY = maxY;
		this.perVein = perVein;
		this.chunkDensity = chunkDensity;
		this.dimId = dimId;
	}
	
	MaterialRegistry(MaterialType type, String name) {
		this.type = type;
		this.name = name;
		this.hardness = 2F;
		this.harvestLevel = HarvestLevel.STONE;
		this.minY = 0;
		this.maxY = 0;
		this.perVein = 0;
		this.chunkDensity = 0;
		this.dimId = 0;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
