/**
@author Chazwarp923
*/
package tech.chazwarp923.unifieditems.crafting.irecipe;

import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import tech.chazwarp923.unifieditems.Reference;

public class UIIRecipe implements IRecipe {

	ItemStack input = ItemStack.EMPTY;
	ItemStack output = ItemStack.EMPTY;

	@Override
	public boolean matches(InventoryCrafting inv, World worldIn) {
		return false;
	}
	
	public ItemStack getRecipeInput() {
		return input;
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
	public ResourceLocation getRegistryName() {
		return new ResourceLocation(Reference.RESOURCE_PREFIX + output.getUnlocalizedName());
	}
	
	@Override
	public IRecipe setRegistryName(ResourceLocation name) {
		return null;
	}

	@Override
	public Class<IRecipe> getRegistryType() {
		return null;
	}

	@Override
	public boolean canFit(int width, int height) {
		return false;
	}
}
