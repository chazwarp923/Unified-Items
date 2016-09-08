/**
@author Chaz Kerby
*/
package tech.chazwarp923.unifieditems.integration.jei;

import mezz.jei.api.recipe.IRecipeHandler;
import mezz.jei.api.recipe.IRecipeWrapper;
import tech.chazwarp923.unifieditems.crafting.IRecipe.OreToDustRecipe;

public class MortarAndPestleHandler implements IRecipeHandler<OreToDustRecipe> {

	@Override
	public Class<OreToDustRecipe> getRecipeClass() {
		return OreToDustRecipe.class;
	}

	@Override
	public String getRecipeCategoryUid() {
		return MortarAndPestleCategory.UID;
	}

	@Override
	public String getRecipeCategoryUid(OreToDustRecipe recipe) {
		return getRecipeCategoryUid();
	}

	@Override
	public IRecipeWrapper getRecipeWrapper(OreToDustRecipe recipe) {
		return new MortarAndPestleWrapper(recipe);
	}

	@Override
	public boolean isRecipeValid(OreToDustRecipe recipe) {
		return true;
	}
}
