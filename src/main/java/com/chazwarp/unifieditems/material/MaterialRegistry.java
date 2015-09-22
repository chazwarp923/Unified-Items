/**
@author Chaz Kerby
*/
package com.chazwarp.unifieditems.material;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

public enum MaterialRegistry {
	
	COAL(MaterialType.DUST, "Coal", 0x404040),
	IRON(MaterialType.DUST, "Iron", 0xCABAB5, 2F, 2, Blocks.stone),
	GOLD(MaterialType.DUST, "Gold", 0xFFFF48, 2F, 3, Blocks.stone),
	COPPER(MaterialType.GENERIC, "Copper", 0xFFA700, 2F, 1, Blocks.stone),
	TIN(MaterialType.GENERIC, "Tin", 0xC5EBFF, 2F, 1, Blocks.stone),
	BRONZE(MaterialType.METAL, "Bronze", 0xC26E1C),
	SILVER(MaterialType.GENERIC, "Silver", 0xD9F0F5, 2F, 3, Blocks.stone),
	LEAD(MaterialType.GENERIC, "Lead", 0x879ADB, 2F, 3, Blocks.stone),
	NICKEL(MaterialType.GENERIC, "Nickel", 0xF4F4DE, 2F, 2, Blocks.stone),
	INVAR(MaterialType.METAL, "Invar", 0x404040),
	ELECTRUM(MaterialType.METAL, "Electrum", 0x404040),
	PLATINUM(MaterialType.GENERIC, "Platinum", 0xD1F1FB, 2F, 3, Blocks.stone),
	MITHRIL(MaterialType.GENERIC, "Mithril", 0x70C7FD, 2F, 3, Blocks.stone);
	
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
