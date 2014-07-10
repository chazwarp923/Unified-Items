package com.chazwarp.unifieditems.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.chazwarp.unifieditems.lib.BlockInfo;

public class BlockBronze extends BlockUI {
	
	public BlockBronze(Material mat) {
		super(mat, 2F, Block.soundTypeMetal, BlockInfo.BRONZE_BLOCK_UNLOCALIZED_NAME, "pickaxe", 2);
	}
}