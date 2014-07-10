package com.chazwarp.unifieditems.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.chazwarp.unifieditems.lib.BlockInfo;

public class BlockLead extends BlockUI {
	
	public BlockLead(Material mat) {
		super(mat, 2F, Block.soundTypeMetal, BlockInfo.LEAD_BLOCK_UNLOCALIZED_NAME, "pickaxe", 2);
	}
}