/**
@author Chaz Kerby
*/
package com.chazwarp.unifieditems.blocks;

import com.chazwarp.unifieditems.lib.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class UIBlockStorage extends UIBlock {
	
	protected UIBlockStorage(float hardness, String unlocalizedName, int harvestLevel, int hexColor) {
		super(Material.iron, hardness, Block.soundTypeMetal, unlocalizedName, UIBlock.PICKAXE, harvestLevel);
		setBlockTextureName(Reference.RESOURCE_PREFIX + "block");
	}
}
