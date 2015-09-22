/**
@author Chaz Kerby
*/
package com.chazwarp.unifieditems.blocks;

import com.chazwarp.unifieditems.client.texture.OreTexture;
import com.chazwarp.unifieditems.lib.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;

public class UIBlockStorage extends UIBlock {
	
	private static String matName;
	private static IIcon texture;
	
	public UIBlockStorage(String matName, float hardness, String unlocalizedName, int harvestLevel, int hexColor) {
		super(Material.iron, hardness, Block.soundTypeMetal, unlocalizedName, UIBlock.PICKAXE, harvestLevel);
		this.matName = matName;
		setBlockTextureName(Reference.RESOURCE_PREFIX + "block");
	}
	
	/*@SideOnly(Side.CLIENT)
    @Override
    public void registerBlockIcons(IIconRegister register) {
		//You can never be too sure
		if(register instanceof TextureMap) {
			TextureMap map = (TextureMap) register;
			map.setTextureEntry("", new OreTexture(""));
		}
	}
	
	@SideOnly(Side.CLIENT)
    @Override
    public IIcon getIcon(int side, int meta) {
		return null;
	}
	
	 @SideOnly(Side.CLIENT)
	 @Override
	 public IIcon getIcon(IBlockAccess world, int x, int y, int z, int side) {
		 return null;
	 }*/
}
