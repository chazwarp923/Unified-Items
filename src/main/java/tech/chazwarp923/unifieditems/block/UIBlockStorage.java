/**
@author Chaz Kerby
*/
package tech.chazwarp923.unifieditems.block;

import tech.chazwarp923.unifieditems.lib.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.IIcon;

public class UIBlockStorage extends UIBlock {
	
	private String matName;
	private IIcon texture;
	
	public UIBlockStorage(String matName, float hardness, String unlocalizedName, int harvestLevel, int hexColor) {
		super(Material.iron, hardness, Block.soundTypeMetal, unlocalizedName, HarvestType.PICKAXE, harvestLevel);
		this.matName = matName;
		setUnlocalizedName(Reference.TEXTURE_LOC + "_" + unlocalizedName + "block");
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
