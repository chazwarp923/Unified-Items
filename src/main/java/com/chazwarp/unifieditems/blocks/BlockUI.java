/**
@author Chaz Kerby
*/

package com.chazwarp.unifieditems.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.chazwarp.unifieditems.UniTab;
import com.chazwarp.unifieditems.lib.Reference;

public class BlockUI extends Block {

	public static String SWORD = "sword";
	public static String AXE = "axe";
	public static String PICKAXE = "pickaxe";
	public static String SHOVEL = "spade";	
	
	public static String LVL_0 = "Wood";
	public static String LVL_1 = "Stone";
	public static String LVL_2 = "Iron";
	public static String LVL_3 = "Diamond";
	
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