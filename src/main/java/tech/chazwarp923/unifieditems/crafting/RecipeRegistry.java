/**
@author Chazwarp923
*/
package tech.chazwarp923.unifieditems.crafting;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.crafting.IRecipe;
import tech.chazwarp923.unifieditems.crafting.irecipe.MortarAndPestleRecipe;

public class RecipeRegistry {

	protected static List<IRecipe> craftingRecipes = new ArrayList<IRecipe>();
	protected static List<MortarAndPestleRecipe> mortarAndPestleRecipes = new ArrayList<MortarAndPestleRecipe>();
	
	public static void addCraftingRecipe(IRecipe recipe) {
		craftingRecipes.add(recipe);
	}
	
	public static void addMortarAndPestleRecipe(MortarAndPestleRecipe recipe) {
		if(!mortarAndPestleRecipes.contains(recipe)) {
			mortarAndPestleRecipes.add(recipe);
		}
	}
	
	public static List<IRecipe> getCraftingRecipes() {
		List<IRecipe> tempList = craftingRecipes;
		return tempList;
	}
	
	public static List<MortarAndPestleRecipe> getMortarAndPestleRecipes() {
		List<MortarAndPestleRecipe> tempList = mortarAndPestleRecipes;
		return tempList;
	}
}
