package com.chazwarp.unifieditems.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.chazwarp.unifieditems.lib.BlockInfo;

public class BlockSilverOre extends BlockUI {
	
	public BlockSilverOre(Material mat) {
		super(mat, 2F, Block.soundTypeStone, BlockInfo.SILVER_ORE_UNLOCALIZED_NAME, "pickaxe", 2);	
	}	
}