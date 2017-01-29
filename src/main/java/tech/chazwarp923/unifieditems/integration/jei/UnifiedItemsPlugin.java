/**
@author Chaz Kerby
*/
package tech.chazwarp923.unifieditems.integration.jei;

import javax.annotation.Nonnull;

import mezz.jei.api.BlankModPlugin;
import mezz.jei.api.IJeiHelpers;
import mezz.jei.api.IModRegistry;
import mezz.jei.api.JEIPlugin;
import net.minecraft.item.ItemStack;
import tech.chazwarp923.unifieditems.crafting.RecipeRegistry;
import tech.chazwarp923.unifieditems.item.UIItems;

@JEIPlugin
public class UnifiedItemsPlugin extends BlankModPlugin {
	
		@Override
		public void register(@Nonnull IModRegistry registry) {
			IJeiHelpers helpers = registry.getJeiHelpers();
			
			registry.addRecipeCategories(new MortarAndPestleCategory(helpers.getGuiHelper()));
			registry.addRecipeHandlers(new MortarAndPestleHandler(MortarAndPestleCategory.UID));
			registry.addRecipeCategoryCraftingItem(new ItemStack(UIItems.mortarAndPestle), MortarAndPestleCategory.UID);
			registry.addRecipes(RecipeRegistry.getOreToDustRecipes());
		}
}
