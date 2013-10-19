package com.chazwarp.unifieditems.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;

import com.chazwarp.unifieditems.UniTab;
import com.chazwarp.unifieditems.lib.BlockInfo;
import com.chazwarp.unifieditems.lib.Reference;
import com.chazwarp.unifieditems.lib.BlockTextures;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockRubberWood extends Block {
	
	public BlockRubberWood(int id) {
		super(id, Material.wood);
		
		setCreativeTab(UniTab.tab);
		this.setHardness(1.5F);
        this.setResistance(5F);
		this.setStepSound(Block.soundWoodFootstep);
        this.setBurnProperties(this.blockID, 5, 20);
		setUnlocalizedName(BlockInfo.RUBBER_WOOD_UNLOCALIZED_NAME);
		
	}
	
	@SideOnly(Side.CLIENT)
	private Icon topIcon;
	@SideOnly(Side.CLIENT)
	private Icon botIcon;
	@SideOnly(Side.CLIENT)
	private Icon sideIcon;
	
    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister register) {
		topIcon = register.registerIcon(Reference.TEXTURE_LOC + ":" + BlockTextures.WOOD_RUBBER_TOP);
		sideIcon = register.registerIcon(Reference.TEXTURE_LOC + ":" + BlockTextures.WOOD_RUBBER_SIDE);
		botIcon = register.registerIcon(Reference.TEXTURE_LOC + ":" + BlockTextures.WOOD_RUBBER_TOP);
		
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public Icon getIcon(int side, int meta) {
    	if (side == 0) {
    		return botIcon;
    	}else if (side == 1) {
    		return topIcon;
    	}else{
    		return sideIcon;
    	}
    }
	
}
