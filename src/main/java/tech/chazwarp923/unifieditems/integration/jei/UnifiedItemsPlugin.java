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
import mezz.jei.api.recipe.VanillaRecipeCategoryUid;
import net.minecraft.item.ItemStack;
import tech.chazwarp923.unifieditems.crafting.RecipeRegistry;
import tech.chazwarp923.unifieditems.crafting.irecipe.MortarAndPestleRecipe;
import tech.chazwarp923.unifieditems.crafting.irecipe.TorchRecipe;
import tech.chazwarp923.unifieditems.item.UIItems;

@JEIPlugin
public class UnifiedItemsPlugin implements IModPlugin {
	
		@Override
		public void register(@Nonnull IModRegistry registry) {
			List<UIIRecipeWrapper> mortarAndPestleWrappers = new ArrayList<UIIRecipeWrapper>();
			List<UIIRecipeWrapper> torchWrapper = new ArrayList<UIIRecipeWrapper>();
			torchWrapper.add(new UIIRecipeWrapper(new TorchRecipe()));
			for(MortarAndPestleRecipe recipe : RecipeRegistry.getMortarAndPestleRecipes()) {
				mortarAndPestleWrappers.add(new UIIRecipeWrapper(recipe));
			}	
			registry.addRecipes(mortarAndPestleWrappers, MortarAndPestleCategory.UID);
			registry.addRecipes(torchWrapper, VanillaRecipeCategoryUid.CRAFTING);
			registry.addRecipeCatalyst(new ItemStack(UIItems.mortarAndPestle), MortarAndPestleCategory.UID);
		}
		
		@Override
		public void registerCategories(IRecipeCategoryRegistration registry) {
			IJeiHelpers helpers = registry.getJeiHelpers();
			registry.addRecipeCategories(new MortarAndPestleCategory(helpers.getGuiHelper()));
		}
}
