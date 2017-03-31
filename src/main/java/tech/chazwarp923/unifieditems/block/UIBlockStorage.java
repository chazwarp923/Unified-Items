/**
@author Chazwarp923
*/
package tech.chazwarp923.unifieditems.block;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class UIBlockStorage extends UIBlock {
	
	public UIBlockStorage(float hardness, String unlocalizedName, HarvestLevel harvestLevel) {
		super(Material.IRON, hardness, SoundType.METAL, unlocalizedName, HarvestType.PICKAXE, harvestLevel);
	}
	
	public boolean isBeaconBase(IBlockAccess worldObj, BlockPos pos, BlockPos beacon) {
		return true;
	}
}
