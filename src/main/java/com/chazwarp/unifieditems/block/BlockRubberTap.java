package com.chazwarp.unifieditems.block;

import com.chazwarp.unifieditems.UniTab;
import com.chazwarp.unifieditems.item.UIItemBlock;
import com.chazwarp.unifieditems.lib.BlockInfo;
import com.chazwarp.unifieditems.lib.Reference;
import com.chazwarp.unifieditems.tileentity.TileEntityRubberTap;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockRubberTap extends BlockContainer {

	public BlockRubberTap() {
		super(Material.iron);
		
		GameRegistry.registerBlock(this, UIItemBlock.class, BlockInfo.RUBBER_TAP_UNLOCALIZED_NAME);
		
		setCreativeTab(UniTab.tab);
		setHardness(2F);
		setStepSound(Block.soundTypeMetal);
		setUnlocalizedName(Reference.TEXTURE_LOC + "_" + BlockInfo.RUBBER_TAP_UNLOCALIZED_NAME);
		setBlockBounds(0.3F, 0.25F, 0.6F, 0.7F, 0.55F, 1.0F);
		setLightOpacity(0);
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public int getRenderType() {
		return -1;
	}

	@Override
	public TileEntity createNewTileEntity(World world, int Integer) {
		return new TileEntityRubberTap();
	}
}