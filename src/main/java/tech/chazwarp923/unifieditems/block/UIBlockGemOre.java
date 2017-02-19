/**
@author Chazwarp923
*/
package tech.chazwarp923.unifieditems.block;

import java.util.Random;

import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import tech.chazwarp923.unifieditems.item.UIItems;
import tech.chazwarp923.unifieditems.material.Material;

public class UIBlockGemOre extends UIBlock {

	private final Material mat;
	
	public UIBlockGemOre(float hardness, String unlocalizedName, HarvestLevel harvestLevel, Material mat) {
		super(net.minecraft.block.material.Material.ROCK, hardness, SoundType.STONE, unlocalizedName, HarvestType.PICKAXE, harvestLevel);
		this.mat = mat;
	}
	
	@Override
    public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune) {
		 if (this.getItemDropped(state, RANDOM, fortune) != Item.getItemFromBlock(this)) {
	            return 1 + RANDOM.nextInt(5);
	     }
		 return 0;
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return UIItems.gems.get(mat);
    }
	
	@Override
	public int quantityDroppedWithBonus(int fortune, Random random) {
        return this.quantityDropped(random) + random.nextInt(fortune + 1);
    }
}
