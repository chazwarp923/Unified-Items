/**
@author Chazwarp923
*/
package tech.chazwarp923.unifieditems.block;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class UIBlockMetalOre extends UIBlock {
	
	public UIBlockMetalOre(float hardness, String unlocalizedName, HarvestLevel harvestLevel) {
		super(Material.ROCK, hardness, SoundType.STONE, unlocalizedName, HarvestType.PICKAXE, harvestLevel);
	}
}
