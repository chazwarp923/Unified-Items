package com.chazwarp.unifieditems.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

import com.chazwarp.unifieditems.lib.BlockInfo;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockRubberWood extends Block {
	
	public BlockRubberWood(int id) {
		super(id, Material.wood);
		
		setCreativeTab(CreativeTabs.tabBlock);
		setHardness(1F);
		setStepSound(Block.soundWoodFootstep);
		setUnlocalizedName(BlockInfo.RUBBER_WOOD_UNLOCALIZED_NAME);
		
		this.func_111022_d("test:woodRubber");
	}
	
	@Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {

        this.blockIcon = iconRegister.registerIcon(this.func_111023_E());
	}
	
}
