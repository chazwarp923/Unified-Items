/**
@author Chazwarp923
*/
package tech.chazwarp923.unifieditems.integration.jei;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;

import mezz.jei.api.IJeiHelpers;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.IModRegistry;
import mezz.jei.api.JEIPlugin;
import mezz.jei.api.recipe.IRecipeCategoryRegistration;
import net.minecraft.item.ItemStack;
import tech.chazwarp923.unifieditems.crafting.RecipeRegistry;
import tech.chazwarp923.unifieditems.crafting.IRecipe.MortarAndPestleRecipe;
import tech.chazwarp923.unifieditems.item.UIItems;

@JEIPlugin
public class UnifiedItemsPlugin implements IModPlugin {
	
		@Override
		public void register(@Nonnull IModRegistry registry) {
			List<MortarAndPestleRecipeWrapper> wrappers = new ArrayList<MortarAndPestleRecipeWrapper>();
			for(MortarAndPestleRecipe recipe : RecipeRegistry.getMortarAndPestleRecipes()) {
				wrappers.add(new MortarAndPestleRecipeWrapper(recipe));
			}	
			registry.addRecipes(wrappers, MortarAndPestleCategory.UID);
			registry.addRecipeCatalyst(new ItemStack(UIItems.mortarAndPestle), MortarAndPestleCategory.UID);
		}
		
		@Override
		public void registerCategories(IRecipeCategoryRegistration registry) {
			IJeiHelpers helpers = registry.getJeiHelpers();
			registry.addRecipeCategories(new MortarAndPestleCategory(helpers.getGuiHelper()));
		}
}
