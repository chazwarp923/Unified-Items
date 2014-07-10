package com.chazwarp.unifieditems.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.chazwarp.unifieditems.lib.BlockInfo;

public class BlockTinOre extends BlockUI {
	
	public BlockTinOre(Material mat) {
		super(mat, 2F, Block.soundTypeStone, BlockInfo.TIN_ORE_UNLOCALIZED_NAME, "pickaxe", 1);	
	}   
}