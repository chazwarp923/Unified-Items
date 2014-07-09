package com.chazwarp.unifieditems.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.chazwarp.unifieditems.lib.BlockInfo;

public class BlockTin extends BasicBlockUI {
	
	public BlockTin(Material mat) {
		super(mat, 2F, Block.soundTypeMetal, BlockInfo.TIN_BLOCK_UNLOCALIZED_NAME, "pickaxe", 2);		
	}	
}