/**
@author Chaz Kerby
*/
package tech.chazwarp923.unifieditems.block;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import tech.chazwarp923.unifieditems.lib.Reference;

public class UIBlockStorage extends UIBlock {
	
	private String matName;
	//private IIcon texture;
	
	public UIBlockStorage(String matName, float hardness, String unlocalizedName, HarvestLevel harvestLevel, int hexColor) {
		super(Material.IRON, hardness, SoundType.METAL, unlocalizedName, HarvestType.PICKAXE, harvestLevel);
		this.setUnlocalizedName(unlocalizedName);
		this.matName = matName;
	}
	
	//TODO Reimplement
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
