package com.chazwarp.unifieditems.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import com.chazwarp.unifieditems.UniTab;
import com.chazwarp.unifieditems.lib.BlockInfo;
import com.chazwarp.unifieditems.lib.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockBronze extends Block {
	
	public BlockBronze(Material mat) {
		super(mat);
		
		setCreativeTab(UniTab.tab);
		setHardness(2F);
		setStepSound(Block.soundTypeMetal);
		setBlockName(BlockInfo.BRONZE_UNLOCALIZED_NAME);
		setBlockTextureName(Reference.TEXTURE_LOC + ":" + BlockInfo.BRONZE_UNLOCALIZED_NAME);
		setHarvestLevel("pickaxe", 2);
	}
}