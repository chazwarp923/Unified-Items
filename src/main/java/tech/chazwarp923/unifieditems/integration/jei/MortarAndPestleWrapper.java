/**
@author Chaz Kerby
*/
package tech.chazwarp923.unifieditems.integration.jei;

import java.util.Collections;
import java.util.List;

import mezz.jei.api.recipe.wrapper.ICraftingRecipeWrapper;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;
import tech.chazwarp923.unifieditems.crafting.IRecipe.OreToDustRecipe;

public class MortarAndPestleWrapper implements ICraftingRecipeWrapper {

	private final ItemStack input;
	private final ItemStack output;
	
	public MortarAndPestleWrapper(OreToDustRecipe recipe) {
		input = recipe.getRecipeInput();
		output = recipe.getRecipeOutput();
	}
	
	@Override
	public List<ItemStack> getInputs() {
		return Collections.singletonList(input);
	}

	@Override
	public List<ItemStack> getOutputs() {
		return Collections.singletonList(output);
	}

	@Override
	public List<FluidStack> getFluidInputs() {
		return Collections.emptyList();
	}

	@Override
	public List<FluidStack> getFluidOutputs() {
		return Collections.emptyList();
	}

	@Override
	public void drawInfo(Minecraft minecraft, int recipeWidth, int recipeHeight, int mouseX, int mouseY) {	
	}

	@Override
	public void drawAnimations(Minecraft minecraft, int recipeWidth, int recipeHeight) {	
	}

	@Override
	public List<String> getTooltipStrings(int mouseX, int mouseY) {
		return Collections.emptyList();
	}

	@Override
	public boolean handleClick(Minecraft minecraft, int mouseX, int mouseY, int mouseButton) {
		return false;
	}
}
