package com.chazwarp.unifieditems.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;

import com.chazwarp.unifieditems.UniTab;
import com.chazwarp.unifieditems.lib.BlockInfo;
import com.chazwarp.unifieditems.lib.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockBronze extends Block {
	
	public BlockBronze(int id) {
		super(id, Material.iron);
		
		setCreativeTab(UniTab.tab);
		setHardness(2F);
		setStepSound(Block.soundMetalFootstep);
		setUnlocalizedName(BlockInfo.BRONZE_UNLOCALIZED_NAME);		
	}
	
    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister register) {
		blockIcon = register.registerIcon(Reference.TEXTURE_LOC + ":" + "blockBronze");		
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public Icon getIcon(int side, int meta) {
    	if (side == 0) {
    		return blockIcon;
    	}else if (side == 1) {
    		return blockIcon;
    	}else{
    		return blockIcon;
    	}
	}
}