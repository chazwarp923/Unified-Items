/**
@author Chazwarp923
*/
package tech.chazwarp923.unifieditems.integration.jei;

import javax.annotation.Nonnull;

import mezz.jei.api.IJeiHelpers;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.IModRegistry;
import mezz.jei.api.JEIPlugin;
import mezz.jei.api.recipe.IRecipeCategoryRegistration;
import net.minecraft.item.ItemStack;
import tech.chazwarp923.unifieditems.crafting.RecipeRegistry;
import tech.chazwarp923.unifieditems.item.UIItems;

@JEIPlugin
public class UnifiedItemsPlugin implements IModPlugin {
	
		@Override
		public void register(@Nonnull IModRegistry registry) {
			registry.addRecipes(RecipeRegistry.getMortarAndPestleRecipes(), MortarAndPestleCategory.UID);
			registry.addRecipeCatalyst(new ItemStack(UIItems.mortarAndPestle), MortarAndPestleCategory.UID);
		}
		
		@Override
		public void registerCategories(IRecipeCategoryRegistration registry) {
			IJeiHelpers helpers = registry.getJeiHelpers();
			registry.addRecipeCategories(new MortarAndPestleCategory(helpers.getGuiHelper()));
		}
}
