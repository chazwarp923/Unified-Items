/**
@author Chaz Kerby
*/

package com.chazwarp.unifieditems.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.chazwarp.unifieditems.UniTab;
import com.chazwarp.unifieditems.lib.Reference;

public class BlockUI extends Block {

	protected BlockUI(Material mat, float hardness, SoundType sound, String unlocalizedName, String harvestTool, int harvestLevel) {
		super(mat);
		
		setCreativeTab(UniTab.tab);
		setHardness(hardness);
		setStepSound(sound);
		setBlockName(unlocalizedName);
		setBlockTextureName(Reference.RESOURCE_PREFIX + unlocalizedName);
		setHarvestLevel(harvestTool, harvestLevel);
	}
}