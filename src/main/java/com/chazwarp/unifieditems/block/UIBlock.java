/**
@author Chaz Kerby
 */

package com.chazwarp.unifieditems.block;

import com.chazwarp.unifieditems.UniTab;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class UIBlock extends Block {

	public static final String SWORD = "sword";
	public static final String AXE = "axe";
	public static final String PICKAXE = "pickaxe";
	public static final String SHOVEL = "spade";

	public static final int WOOD = 0;
	public static final int STONE = 1;
	public static final int IRON = 2;
	public static final int DIAMOND = 3;
	
	private String name = "UIDefaultBlock";

	public UIBlock(Material mat, float hardness, SoundType sound, String unlocalizedName, String harvestTool, int harvestLevel) {
		super(mat);
		
		name = unlocalizedName;

		setCreativeTab(UniTab.tab);
		setHardness(hardness);
		setHarvestLevel(harvestTool, harvestLevel);
		setRegistryName(unlocalizedName);
		setStepSound(sound);
		setUnlocalizedName(unlocalizedName);
		
		GameRegistry.registerBlock(this, name);
	}
	
	public String getName() {
		return name;
	}
}