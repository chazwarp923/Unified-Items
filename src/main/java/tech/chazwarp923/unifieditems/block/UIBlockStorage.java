/**
@author Chaz Kerby
*/
package tech.chazwarp923.unifieditems.block;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class UIBlockStorage extends UIBlock {
	
	public UIBlockStorage(float hardness, String unlocalizedName, HarvestLevel harvestLevel) {
		super(Material.IRON, hardness, SoundType.METAL, unlocalizedName, HarvestType.PICKAXE, harvestLevel);
	}
}
