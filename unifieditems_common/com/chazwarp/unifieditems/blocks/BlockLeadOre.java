package com.chazwarp.unifieditems.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

import com.chazwarp.unifieditems.lib.BlockInfo;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockLeadOre extends Block {
	
	public BlockLeadOre(int id) {
		super(id, Material.rock);
		
		setCreativeTab(CreativeTabs.tabBlock);
		setHardness(2F);
		setStepSound(Block.soundStoneFootstep);
		setUnlocalizedName(BlockInfo.LEAD_ORE_UNLOCALIZED_NAME);
		
		this.func_111022_d("uniitems:oreLead");
	}
	
	@Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {

        this.blockIcon = iconRegister.registerIcon(this.func_111023_E());
	}
	
}
