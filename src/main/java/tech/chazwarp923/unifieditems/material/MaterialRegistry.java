/**
@author Chaz Kerby
*/
package tech.chazwarp923.unifieditems.material;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import tech.chazwarp923.unifieditems.block.HarvestLevel;

public enum MaterialRegistry {
	
	COAL(MaterialType.DUST, "Coal", 0x404040),
	IRON(MaterialType.DUST, "Iron", 0x768492),
	GOLD(MaterialType.DUST, "Gold", 0xD2BF24),
	COPPER(MaterialType.GENERIC, "Copper", 0xA96C3A, 2F, HarvestLevel.STONE, Blocks.STONE),
	TIN(MaterialType.GENERIC, "Tin", 0xC0C0C0, 2F, HarvestLevel.STONE, Blocks.STONE),
	BRONZE(MaterialType.ALLOY, "Bronze", 0xC26E1C),
	SILVER(MaterialType.GENERIC, "Silver", 0xE9EDEE, 2F, HarvestLevel.DIAMOND, Blocks.STONE),
	LEAD(MaterialType.GENERIC, "Lead", 0x799F9E, 2F, HarvestLevel.DIAMOND, Blocks.STONE),
	NICKEL(MaterialType.GENERIC, "Nickel", 0xA38E6F, 2F, HarvestLevel.IRON, Blocks.STONE),
	INVAR(MaterialType.ALLOY, "Invar", 0x404040),
	ELECTRUM(MaterialType.ALLOY, "Electrum", 0x404040),
	PLATINUM(MaterialType.GENERIC, "Platinum", 0x4BA7CE, 2F, HarvestLevel.DIAMOND, Blocks.STONE),
	MITHRIL(MaterialType.GENERIC, "Mithril", 0x847EFE, 2F, HarvestLevel.DIAMOND, Blocks.STONE),
    ALUMINUM(MaterialType.GENERIC, "Aluminum", 0x7F7F7F, 2F, HarvestLevel.STONE, Blocks.STONE),
    URANIUM(MaterialType.GENERIC, "Uranium", 0x75B02B, 2F, HarvestLevel.DIAMOND, Blocks.STONE),
    STEEL(MaterialType.ALLOY, "Steel", 0x434A51),
    COBALT(MaterialType.GENERIC, "Cobalt", 0x1A52C7, 2F, HarvestLevel.DIAMOND, Blocks.STONE),
    ARDITE(MaterialType.GENERIC, "Ardite", 0xBD4040, 2F, HarvestLevel.DIAMOND, Blocks.STONE),
    IRIDIUM(MaterialType.GENERIC, "Iridium", 0xCCCCCC, 2F, HarvestLevel.DIAMOND, Blocks.STONE);
	
	final MaterialType type;
	final String name;
	final int hexColor;
	final float hardness;
	final HarvestLevel harvestLevel;
	final Block baseTex;
	
	MaterialRegistry(MaterialType types, String name, int hexColor, float hardness, HarvestLevel harvestLevel, Block baseTex) {
		this.type = types;
		this.name = name;
		this.hexColor = hexColor;
		this.hardness = hardness;
		this.harvestLevel = harvestLevel;
		this.baseTex = baseTex;
	}
	
	MaterialRegistry(MaterialType types, String name, int hexColor) {
		this.type = types;
		this.name = name;
		this.hexColor = hexColor;
		this.hardness = 0;
		this.harvestLevel = HarvestLevel.WOOD;
		this.baseTex = Blocks.STONE;
	}
}
