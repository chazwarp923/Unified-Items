/**
@author Chaz Kerby
*/
package com.chazwarp.unifieditems.blocks;

import net.minecraft.block.material.Material;

public class UIBlockStorage extends UIBlock {
	
	protected UIBlockStorage(Material mat, float hardness, SoundType sound, String unlocalizedName, String harvestTool, int harvestLevel, int hexColor) {
		super(mat, hardness, sound, unlocalizedName, harvestTool, harvestLevel);
	}
}
