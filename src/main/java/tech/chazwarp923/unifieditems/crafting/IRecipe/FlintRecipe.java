package tech.chazwarp923.unifieditems.crafting.IRecipe;

import mcjty.lib.compat.CompatIRecipe;
import mcjty.lib.tools.ItemStackList;
import mcjty.lib.tools.ItemStackTools;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import tech.chazwarp923.unifieditems.item.UIItems;

public class FlintRecipe implements CompatIRecipe {

	protected ItemStack input = new ItemStack(Blocks.GRAVEL);
	protected ItemStack output = new ItemStack(Items.FLINT, 1);
	
	@Override
	public boolean matches(InventoryCrafting inv, World worldIn) {
		int invSize = inv.getSizeInventory();
		for(int i = 0; i < invSize; i++) {
			if(ItemStackTools.isValid(inv.getStackInSlot(i))) {
				if(inv.getStackInSlot(i).getItem().equals(UIItems.mortarAndPestle)) {
					for(int j = 0; j < invSize; j++) {
						if(ItemStackTools.isValid(inv.getStackInSlot(j))) {
							if(inv.getStackInSlot(j).getItem().equals(input.getItem())) {
								return true;
							}
						}
					}
				}
			}
		}
		return false;
	}

	@Override
	public ItemStack getCraftingResult(InventoryCrafting inv) {
		return output.copy();
	}

	@Override
	public int getRecipeSize() {
		return 2;
	}

	@Override
	public ItemStack getRecipeOutput() {
		return output;
	}

	@Override
	public ItemStackList getRemainingItemsCompat(InventoryCrafting inv) {
		ItemStackList grid = ItemStackList.create(inv.getSizeInventory());

        for (int i = 0; i < grid.size(); i++) {
            ItemStack itemstack = inv.getStackInSlot(i);
            
            if (ItemStackTools.isValid(itemstack) && itemstack.getItem().equals(UIItems.mortarAndPestle)) {
            	itemstack = new ItemStack(UIItems.mortarAndPestle, 1, itemstack.getItemDamage() + 1);
                if(itemstack.getItemDamage() == itemstack.getMaxDamage())
                	itemstack = ItemStackTools.getEmptyStack();
                grid.set(i, itemstack);
            }
        }
        return grid;
	}
}
