/**
@author Chaz Kerby
*/
package tech.chazwarp923.unifieditems.integration.jei;

import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.BlankRecipeWrapper;
import mezz.jei.api.recipe.wrapper.ICraftingRecipeWrapper;
import net.minecraft.item.ItemStack;
import tech.chazwarp923.unifieditems.crafting.IRecipe.OreToDustRecipe;

public class MortarAndPestleWrapper extends BlankRecipeWrapper implements ICraftingRecipeWrapper {

	private final OreToDustRecipe recipe;
	
	public MortarAndPestleWrapper(OreToDustRecipe recipe) {
		this.recipe = recipe;
	}
	
	@Override
	public void getIngredients(IIngredients ingredients) {
		ingredients.setInput(ItemStack.class, recipe.getRecipeInput());
		ingredients.setOutput(ItemStack.class, recipe.getRecipeOutput());
	}
}
