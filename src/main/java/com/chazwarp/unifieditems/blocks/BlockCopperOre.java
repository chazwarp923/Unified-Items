package com.chazwarp.unifieditems.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.world.World;

import com.chazwarp.unifieditems.UniTab;
import com.chazwarp.unifieditems.lib.BlockInfo;
import com.chazwarp.unifieditems.lib.BlockTextures;
import com.chazwarp.unifieditems.lib.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockCopperOre extends Block {
	
	public BlockCopperOre(int id) {
		super(id, Material.rock);
		
		setCreativeTab(UniTab.tab);
		setHardness(2F);
		setStepSound(Block.soundStoneFootstep);
		setUnlocalizedName(BlockInfo.COPPER_ORE_UNLOCALIZED_NAME);		
	}
	
	@Override
	public int getExpDrop(World world, int data, int enchantmentLevel)
    {
        return 1;
    }
	
    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister register) {
		blockIcon = register.registerIcon(Reference.TEXTURE_LOC + ":" + BlockTextures.COPPER_ORE);		
    }	
}