/**
@author Chaz Kerby
*/
package com.chazwarp.unifieditems.blocks;

import com.chazwarp.unifieditems.lib.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class UIBlockOre extends UIBlock {
	
	protected UIBlockOre(float hardness, String unlocalizedName, int harvestLevel, int hexColor, Block base) {
		super(Material.rock, hardness, Block.soundTypeStone, unlocalizedName, UIBlock.PICKAXE, harvestLevel);
		setBlockTextureName(Reference.RESOURCE_PREFIX + "ore");
	}
}
