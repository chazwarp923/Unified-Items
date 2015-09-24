/**
@author Chaz Kerby
*/
package com.chazwarp.unifieditems.blocks;

import com.chazwarp.unifieditems.client.texture.TextureOre;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;

public class UIBlockOre extends UIBlock {
	
	private IIcon texture;
	private String unlocalizedName;
	private int hexColor;
	private Block baseTex;
	
	public UIBlockOre(float hardness, String unlocalizedName, int harvestLevel, int hexColor, Block baseTex) {
		super(Material.rock, hardness, Block.soundTypeStone, unlocalizedName, UIBlock.PICKAXE, harvestLevel);
		this.unlocalizedName = unlocalizedName;
		this.hexColor = hexColor;
		this.baseTex = baseTex;
	}
	
	@SideOnly(Side.CLIENT)
    @Override
    public void registerBlockIcons(IIconRegister register) {
		//You can never be too sure
		if(register instanceof TextureMap) {
			TextureMap map = (TextureMap) register;
			String name = getTextureName();
			TextureAtlasSprite sprite = map.getTextureExtry(name);
			if(sprite == null) {
				sprite = new TextureOre(this.unlocalizedName, baseTex.getUnlocalizedName().substring(5), hexColor);
				map.setTextureEntry(name, sprite);
			}
			texture = sprite;//map.getTextureExtry(name);
		}
	}
	
	@SideOnly(Side.CLIENT)
    @Override
    public IIcon getIcon(int side, int meta) {
		return texture;
	}
	
	 @SideOnly(Side.CLIENT)
	 @Override
	 public IIcon getIcon(IBlockAccess world, int x, int y, int z, int side) {
		 return texture;
	 }
}
