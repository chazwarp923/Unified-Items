package com.chazwarp.unifieditems.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.chazwarp.unifieditems.UniTab;
import com.chazwarp.unifieditems.lib.BlockInfo;
import com.chazwarp.unifieditems.lib.BlockTextures;
import com.chazwarp.unifieditems.lib.Reference;
import com.chazwarp.unifieditems.tileentity.TileEntityRubberTap;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockRubberTap extends BlockContainer {
	
	public BlockRubberTap(int id) {
		super(id, Material.rock);
		
		setCreativeTab(UniTab.tab);
		setHardness(2F);
		setStepSound(Block.soundStoneFootstep);
		setUnlocalizedName(BlockInfo.RUBBER_TAP_UNLOCALIZED_NAME);
		this.setBlockBounds(0.3F, 0.25F, 0.6F, 0.7000F, 0.55F, 1.0F);		
	}
	
	public boolean isOpaqueCube()
    {
        return false;
    }
	
	@Override
	public boolean renderAsNormalBlock()
    {
        return false;
    }
	
	@Override
	public int getRenderType() {
		return -1;	
	}
	
	public TileEntity createNewTileEntity(World par1World)
    {
        TileEntityRubberTap tileEntityRubberTap = new TileEntityRubberTap();
        return tileEntityRubberTap;
    }
	
    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister register) {
		blockIcon = register.registerIcon(Reference.TEXTURE_LOC + ":" + BlockTextures.RUBBER_TAP);		
    }	
}
