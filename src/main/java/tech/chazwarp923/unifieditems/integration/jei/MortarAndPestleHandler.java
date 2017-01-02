/**
@author Chaz Kerby
*/
package tech.chazwarp923.unifieditems.integration.jei;

import mezz.jei.api.recipe.IRecipeWrapper;
import mcjty.lib.jei.CompatRecipeHandler;
import tech.chazwarp923.unifieditems.crafting.IRecipe.OreToDustRecipe;

public class MortarAndPestleHandler extends CompatRecipeHandler<OreToDustRecipe> {

	public MortarAndPestleHandler(String id) {
		super(id);
	}

	@Override
	public Class<OreToDustRecipe> getRecipeClass() {
		return OreToDustRecipe.class;
	}

	@Override
	public String getRecipeCategoryUid(OreToDustRecipe recipe) {
		return MortarAndPestleCategory.UID;
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
