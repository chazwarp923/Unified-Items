/**
@author Chazwarp923
*/
package tech.chazwarp923.unifieditems.crafting.irecipe;

import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import tech.chazwarp923.unifieditems.Reference;
import tech.chazwarp923.unifieditems.item.UIItems;

public class MortarAndPestleRecipe extends UIIRecipe {
	
	public MortarAndPestleRecipe(ItemStack input, ItemStack output) {
		this.input = input;
		this.output = output;
	}
	
	@Override
	public boolean matches(InventoryCrafting inv, World worldIn) {
		int invSize = inv.getSizeInventory();
		for(int i = 0; i < invSize; i++) {
			if(inv.getStackInSlot(i) != ItemStack.EMPTY) {
				if(inv.getStackInSlot(i).getItem().equals(UIItems.mortarAndPestle)) {
					for(int j = 0; j < invSize; j++) {
						if(inv.getStackInSlot(j) != ItemStack.EMPTY) {
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
	public NonNullList<ItemStack> getRemainingItems(InventoryCrafting inv) {
		NonNullList<ItemStack> grid = NonNullList.withSize(inv.getSizeInventory(), ItemStack.EMPTY);

        for (int i = 0; i < grid.size(); i++) {
            ItemStack itemstack = inv.getStackInSlot(i);
            
            if (itemstack != ItemStack.EMPTY && itemstack.getItem().equals(UIItems.mortarAndPestle)) {
            	itemstack = new ItemStack(UIItems.mortarAndPestle, 1, itemstack.getItemDamage() + 1);
                if(itemstack.getItemDamage() == itemstack.getMaxDamage())
                	itemstack = ItemStack.EMPTY;
                grid.set(i, itemstack);
            }
        }
        return grid;
	}

	@Override
	public ItemStack getRecipeOutput() {
		return output;
	}
	
	@Override
	public ItemStack getCraftingResult(InventoryCrafting inv) {
		return output.copy();
	}

	@Override
	public IRecipe setRegistryName(ResourceLocation name) {
		return null;
	}

	@Override
	public ResourceLocation getRegistryName() {
		return new ResourceLocation(Reference.RESOURCE_PREFIX + output.getUnlocalizedName());
	}

	@Override
	public Class<IRecipe> getRegistryType() {
		return null;
		//return IRecipe.class;
	}

	@Override
	public boolean canFit(int width, int height) {
		return width >= 2 && height >= 2;
	}
}
