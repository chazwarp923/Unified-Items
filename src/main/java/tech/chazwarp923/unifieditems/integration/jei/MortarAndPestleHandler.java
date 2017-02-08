/**
@author Chazwarp923
*/
package tech.chazwarp923.unifieditems.integration.jei;

import mcjty.lib.jei.CompatRecipeHandler;
import mezz.jei.api.recipe.IRecipeWrapper;
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
	public IRecipeWrapper getRecipeWrapper(OreToDustRecipe recipe) {
		return new MortarAndPestleWrapper(recipe);
	}
	/**
	@Override
	public String getRecipeCategoryUid(OreToDustRecipe recipe) {
		return MortarAndPestleCategory.UID;
	}
	*/
}
