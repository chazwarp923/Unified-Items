/**
@author Chazwarp923
*/
package tech.chazwarp923.unifieditems.integration.jei;

import java.util.Arrays;

import javax.annotation.Nonnull;

import mezz.jei.api.IGuiHelper;
import mezz.jei.api.gui.IDrawable;
import mezz.jei.api.gui.IGuiItemStackGroup;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.IRecipeCategory;
import mezz.jei.api.recipe.IRecipeWrapper;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import tech.chazwarp923.unifieditems.Reference;
import tech.chazwarp923.unifieditems.item.UIItems;

public class MortarAndPestleCategory implements IRecipeCategory<IRecipeWrapper> {

	public static final String UID = Reference.MOD_ID + ".mortarAndPestle";
	
	@Nonnull
	private final IDrawable background;
	
	public MortarAndPestleCategory(IGuiHelper gui) {
		ResourceLocation location = new ResourceLocation("minecraft", "textures/gui/container/crafting_table.png");
		background = gui.createDrawable(location, 29, 16, 116, 54);
	}
	
	@Override
	public String getUid() {
		return UID;
	}

	@Override
	public String getTitle() {
		return "Mortar and Pestle";
	}

	@Override
	public IDrawable getBackground() {
		return background;
	}

	@Override
	public void setRecipe(IRecipeLayout recipeLayout, IRecipeWrapper recipeWrapper, IIngredients ingredients) {
		if(recipeWrapper instanceof UIIRecipeWrapper) {			
			IGuiItemStackGroup guiItemStacks = recipeLayout.getItemStacks();
			
			guiItemStacks.init(0, true, 0, 0);
			guiItemStacks.set(0, ingredients.getInputs(ItemStack.class).get(0).get(0));
			
			guiItemStacks.init(1, true, 18, 0);
			guiItemStacks.set(1, Arrays.asList(new ItemStack(UIItems.mortarAndPestle), new ItemStack(UIItems.mortarAndPestle, 1, 1), new ItemStack(UIItems.mortarAndPestle, 1, 2), new ItemStack(UIItems.mortarAndPestle, 1, 3)));
			
			guiItemStacks.init(2, false, 94, 18);
			guiItemStacks.set(2, ingredients.getOutputs(ItemStack.class).get(0));
		}
	}

	@Override
	public String getModName() {
		return Reference.MOD_NAME;
	}
}
