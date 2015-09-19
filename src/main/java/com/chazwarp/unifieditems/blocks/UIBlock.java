/**
@author Chaz Kerby
 */

package com.chazwarp.unifieditems.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.chazwarp.unifieditems.UniTab;
import com.chazwarp.unifieditems.lib.Reference;

public class UIBlock extends Block {

	public static final String SWORD = "sword";
	public static final String AXE = "axe";
	public static final String PICKAXE = "pickaxe";
	public static final String SHOVEL = "spade";

	public static final int WOOD = 0;
	public static final int STONE = 1;
	public static final int IRON = 2;
	public static final int DIAMOND = 3;

	public UIBlock(Material mat, float hardness, SoundType sound, String unlocalizedName, String harvestTool, int harvestLevel) {
		super(mat);

		setCreativeTab(UniTab.tab);
		setHardness(hardness);
		setStepSound(sound);
		setBlockName(unlocalizedName);
		setBlockTextureName(Reference.RESOURCE_PREFIX + unlocalizedName);
		setHarvestLevel(harvestTool, harvestLevel);
	}
}