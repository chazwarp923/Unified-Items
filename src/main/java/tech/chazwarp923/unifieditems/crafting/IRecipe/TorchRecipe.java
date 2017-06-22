/**
@author Chazwarp923
 */
package tech.chazwarp923.unifieditems.crafting.IRecipe;

import java.util.ArrayList;

import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.IRecipeWrapper;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import tech.chazwarp923.unifieditems.Reference;

public class TorchRecipe implements IRecipe, IRecipeWrapper {

	protected ItemStack input = new ItemStack(Items.STICK);
	protected ItemStack output = new ItemStack(Blocks.TORCH, 2);
	
	@Override
	public boolean matches(InventoryCrafting inv, World worldIn) {
		int invSize = inv.getSizeInventory();
		for(int i = 0; i < invSize; i++) {
			if(inv.getStackInSlot(i) != ItemStack.EMPTY) {
				if(inv.getStackInSlot(i).getItem().equals(Items.FLINT_AND_STEEL)) {
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
	public ItemStack getCraftingResult(InventoryCrafting inv) {
		return output.copy();
	}

	@Override
	public ItemStack getRecipeOutput() {
		return output;
	}

	@Override
	public NonNullList<ItemStack> getRemainingItems(InventoryCrafting inv) {
		NonNullList<ItemStack> grid = NonNullList.withSize(inv.getSizeInventory(), ItemStack.EMPTY);

        for (int i = 0; i < grid.size(); i++) {
            ItemStack itemstack = inv.getStackInSlot(i);
            
            if (itemstack != ItemStack.EMPTY && itemstack.getItem().equals(Items.FLINT_AND_STEEL)) {
            	itemstack = new ItemStack(Items.FLINT_AND_STEEL, 1, itemstack.getItemDamage() + 1);
                if(itemstack.getItemDamage() == itemstack.getMaxDamage())
                	itemstack = ItemStack.EMPTY;
                grid.set(i, itemstack);;
            }
        }
        return grid;
	}

	@Override
	public IRecipe setRegistryName(ResourceLocation name) {
		return null;
	}

	@Override
	public ResourceLocation getRegistryName() {
		return new ResourceLocation(Reference.RESOURCE_PREFIX + "TorchCrafting");
	}

	@Override
	public Class<IRecipe> getRegistryType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean canFit(int width, int height) {
		return width >= 1 && height >= 2;
	}

	@Override
	public void getIngredients(IIngredients ingredients) {
		ingredients.setInputs(ItemStack.class, new ArrayList<ItemStack>() {{add(input); add(new ItemStack(Items.FLINT_AND_STEEL));}});
		ingredients.setOutput(ItemStack.class, output);
	}
}
