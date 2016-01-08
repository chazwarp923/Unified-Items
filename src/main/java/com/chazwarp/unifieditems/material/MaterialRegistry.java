/**
@author Chaz Kerby
*/
package com.chazwarp.unifieditems.material;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

public enum MaterialRegistry {
	
	COAL(MaterialType.DUST, "Coal", 0x404040),
	IRON(MaterialType.DUST, "Iron", 0x768492, 2F, 2, Blocks.stone),
	GOLD(MaterialType.DUST, "Gold", 0xD2BF24, 2F, 3, Blocks.stone),
	COPPER(MaterialType.GENERIC, "Copper", 0xA96C3A, 2F, 1, Blocks.stone),
	TIN(MaterialType.GENERIC, "Tin", 0xC0C0C0, 2F, 1, Blocks.stone),
	BRONZE(MaterialType.METAL, "Bronze", 0xC26E1C),
	SILVER(MaterialType.GENERIC, "Silver", 0xE9EDEE, 2F, 3, Blocks.stone),
	LEAD(MaterialType.GENERIC, "Lead", 0x799F9E, 2F, 3, Blocks.stone),
	NICKEL(MaterialType.GENERIC, "Nickel", 0xA38E6F, 2F, 2, Blocks.stone),
	INVAR(MaterialType.METAL, "Invar", 0x404040),
	ELECTRUM(MaterialType.METAL, "Electrum", 0x404040),
	PLATINUM(MaterialType.GENERIC, "Platinum", 0x4BA7CE, 2F, 3, Blocks.stone),
	MITHRIL(MaterialType.GENERIC, "Mithril", 0x847EFE, 2F, 3, Blocks.stone),
    ALUMINUM(MaterialType.GENERIC, "Aluminum", 0x7F7F7F, 2F, 1, Blocks.stone),
    URANIUM(MaterialType.GENERIC, "Uranium", 0x75B02B, 2F, 3, Blocks.stone),
    STEEL(MaterialType.METAL, "Steel", 0x434A51),
    COBALT(MaterialType.GENERIC, "Cobalt", 0x1A52C7, 2F, 3, Blocks.stone),
    ARDITE(MaterialType.GENERIC, "Ardite", 0xBD4040, 2F, 3, Blocks.stone),
    IRIDIUM(MaterialType.GENERIC, "Iridium", 0xCCCCCC, 2F, 3, Blocks.stone);
	
	final MaterialType type;
	final String matName;
	final int hexColor;
	final float hardness;
	final int harvestLevel;
	final Block baseTex;
	
	MaterialRegistry(MaterialType types, String matName, int hexColor, float hardness, int harvestLevel, Block baseTex) {
		this.type = types;
		this.matName = matName;
		this.hexColor = hexColor;
		this.hardness = hardness;
		this.harvestLevel = harvestLevel;
		this.baseTex = baseTex;
	}
	
	MaterialRegistry(MaterialType types, String matName, int hexColor) {
		this.type = types;
		this.matName = matName;
		this.hexColor = hexColor;
		this.hardness = 0;
		this.harvestLevel = 0;
		this.baseTex = Blocks.stone;
	}
}
