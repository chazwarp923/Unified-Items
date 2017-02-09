/**
@author Chazwarp923
*/
package tech.chazwarp923.unifieditems.integration.jei;

import mcjty.lib.jei.CompatRecipeHandler;
import mezz.jei.api.recipe.IRecipeWrapper;
import tech.chazwarp923.unifieditems.crafting.IRecipe.MortarAndPestleRecipe;

public class MortarAndPestleHandler extends CompatRecipeHandler<MortarAndPestleRecipe> {

	public MortarAndPestleHandler(String id) {
		super(id);
	}

	@Override
	public Class<MortarAndPestleRecipe> getRecipeClass() {
		return MortarAndPestleRecipe.class;
	}

	@Override
	public IRecipeWrapper getRecipeWrapper(MortarAndPestleRecipe recipe) {
		return new MortarAndPestleWrapper(recipe);
	}
	/**
	@Override
	public String getRecipeCategoryUid(OreToDustRecipe recipe) {
		return MortarAndPestleCategory.UID;
	}
	*/
}
