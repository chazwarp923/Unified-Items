/**
@author Chazwarp923
*/
package tech.chazwarp923.unifieditems.integration.jei;

import java.util.ArrayList;
import java.util.List;

import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.IRecipeWrapper;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import tech.chazwarp923.unifieditems.crafting.IRecipe.UIIRecipe;

public class UIIRecipeWrapper implements IRecipeWrapper {

	final ItemStack input;
	final ItemStack output;
	
	public UIIRecipeWrapper(UIIRecipe recipe) {
		this.input = recipe.getRecipeInput();
		this.output = recipe.getRecipeOutput();
	}
	
	@Override
	public void getIngredients(IIngredients ingredients) {
		if(input.getItem().equals(Items.STICK)) {
			List<ItemStack> inputs = new ArrayList<ItemStack>();
			inputs.add(input);
			inputs.add(new ItemStack(Items.FLINT_AND_STEEL));
			ingredients.setInputs(ItemStack.class, inputs);
		}
		else {
			ingredients.setInput(ItemStack.class, input);
		}
		ingredients.setOutput(ItemStack.class, output);
	}
}
