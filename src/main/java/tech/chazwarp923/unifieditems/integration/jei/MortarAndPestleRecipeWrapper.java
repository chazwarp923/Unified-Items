/**
@author Chazwarp923
*/
package tech.chazwarp923.unifieditems.integration.jei;

import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.IRecipeWrapper;
import net.minecraft.item.ItemStack;
import tech.chazwarp923.unifieditems.crafting.IRecipe.MortarAndPestleRecipe;

public class MortarAndPestleRecipeWrapper implements IRecipeWrapper {

	final ItemStack input;
	final ItemStack output;
	
	public MortarAndPestleRecipeWrapper(MortarAndPestleRecipe recipe) {
		this.input = recipe.getRecipeInput();
		this.output = recipe.getRecipeOutput();
	}
	
	@Override
	public void getIngredients(IIngredients ingredients) {
		ingredients.setInput(ItemStack.class, input);
		ingredients.setOutput(ItemStack.class, output);
	}
}
