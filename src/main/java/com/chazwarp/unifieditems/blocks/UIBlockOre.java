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
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;

public class UIBlockOre extends UIBlock {
	
	private IIcon texture;
	private String matName;
	private String unlocalizedName;
	private int hexColor;
	private Block baseTex;
	
	public UIBlockOre(String matName, float hardness, String unlocalizedName, int harvestLevel, int hexColor, Block baseTex) {
		super(Material.rock, hardness, Block.soundTypeStone, unlocalizedName, UIBlock.PICKAXE, harvestLevel);
		this.matName = matName;
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
			String name = Reference.RESOURCE_PREFIX + "ore" + matName;
			TextureAtlasSprite sprite = map.getTextureExtry(getTextureName());
			if(sprite == null) {
				sprite = new OreTexture(baseTex.getUnlocalizedName().substring(5), hexColor);
				map.setTextureEntry(Reference.RESOURCE_PREFIX + this.unlocalizedName, sprite);
				System.out.println("Just tried to create new OreTexture, idk if it worked though");
			}
			texture = map.getTextureExtry(name);
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
