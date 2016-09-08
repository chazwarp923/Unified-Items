/**
@author Chaz Kerby
*/
package tech.chazwarp923.unifieditems.integration.jei;

import java.util.Collections;

import javax.annotation.Nonnull;

import mezz.jei.api.IGuiHelper;
import mezz.jei.api.gui.ICraftingGridHelper;
import mezz.jei.api.gui.IDrawable;
import mezz.jei.api.gui.IGuiItemStackGroup;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.recipe.BlankRecipeCategory;
import mezz.jei.api.recipe.IRecipeWrapper;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import tech.chazwarp923.unifieditems.item.UIItems;
import tech.chazwarp923.unifieditems.lib.Reference;

public class MortarAndPestleCategory extends BlankRecipeCategory<IRecipeWrapper> {

	public static final String UID = Reference.MOD_ID + ".mortarAndPestle";
	
	@Nonnull
	private final IDrawable background;
	@Nonnull
	private final ICraftingGridHelper craftingGridHelper;
	
	public MortarAndPestleCategory(IGuiHelper gui) {
		ResourceLocation location = new ResourceLocation("minecraft", "textures/gui/container/crafting_table.png");
		background = gui.createDrawable(location, 29, 16, 116, 54);
		craftingGridHelper = gui.createCraftingGridHelper(1, 0);
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
	public void setRecipe(@Nonnull IRecipeLayout recipeLayout, @Nonnull IRecipeWrapper recipeWrapper) {
		if(recipeWrapper instanceof MortarAndPestleWrapper) {
			MortarAndPestleWrapper wrapper = (MortarAndPestleWrapper)recipeWrapper;
			
			IGuiItemStackGroup guiItemStacks = recipeLayout.getItemStacks();
			
			guiItemStacks.init(0, false, 0, 0);
			guiItemStacks.setFromRecipe(0, wrapper.getInputs());
			
			guiItemStacks.init(1, false, 18, 0);
			guiItemStacks.setFromRecipe(1, Collections.singletonList(new ItemStack(UIItems.mortarAndPestle)));
			
			guiItemStacks.init(2, true, 94, 18);
			guiItemStacks.setFromRecipe(2, wrapper.getOutputs());
			
		}
	}
}
