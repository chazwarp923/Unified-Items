/**
@author Chaz Kerby
*/
package tech.chazwarp923.unifieditems.block;

import tech.chazwarp923.unifieditems.client.texture.TextureOre;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class UIBlockOre extends UIBlock {
	
	//private IIcon texture;
	private String unlocalizedName;
	private int hexColor;
	private Block baseTex;
	
	public UIBlockOre(float hardness, String unlocalizedName, HarvestLevel harvestLevel, int hexColor, Block baseTex) {
		super(Material.ROCK, hardness, SoundType.STONE, unlocalizedName, HarvestType.PICKAXE, harvestLevel);
		this.unlocalizedName = unlocalizedName;
		this.hexColor = hexColor;
		this.baseTex = baseTex;
	}
	
	//TODO Reimplement
	/*@SideOnly(Side.CLIENT)
    @Override
    public void registerBlockIcons(IIconRegister register) {
		//You can never be too sure
		if(register instanceof TextureMap) {
			TextureMap map = (TextureMap) register;
			String name = getName();
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
	 }*/
}
