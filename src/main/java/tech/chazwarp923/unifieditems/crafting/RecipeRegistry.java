/**
@author Chazwarp923
*/
package tech.chazwarp923.unifieditems.crafting;

import java.util.ArrayList;
import java.util.List;

import tech.chazwarp923.unifieditems.crafting.IRecipe.MortarAndPestleRecipe;

public class RecipeRegistry {

	protected static List<MortarAndPestleRecipe> mortarAndPestleRecipes = new ArrayList<MortarAndPestleRecipe>();
	
	public static void addMortarAndPestleRecipe(MortarAndPestleRecipe recipe) {
		if(!mortarAndPestleRecipes.contains(recipe)) {
			mortarAndPestleRecipes.add(recipe);
		}
	}
	
	public static List<MortarAndPestleRecipe> getMortarAndPestleRecipes() {
		List<MortarAndPestleRecipe> tempList = mortarAndPestleRecipes;
		return tempList;
	}
}
