/**
@author Chazwarp923
 */
package tech.chazwarp923.unifieditems.crafting.IRecipe;

import net.minecraft.item.ItemStack;
import tech.chazwarp923.unifieditems.block.UIBlocks;
import tech.chazwarp923.unifieditems.item.UIItems;
import tech.chazwarp923.unifieditems.material.Material;

public class OreToDustRecipe extends MortarAndPestleRecipe {
	
	public OreToDustRecipe(ItemStack ore, ItemStack dust) {
		super(ore, dust);
	}
	
	public OreToDustRecipe(Material material) {
		super(new ItemStack(UIBlocks.metalOres.get(material), 1), new ItemStack(UIItems.dusts.get(material), 2));
	}
}
