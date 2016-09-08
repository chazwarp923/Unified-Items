/**
@author Chaz Kerby
*/
package tech.chazwarp923.unifieditems.crafting;

import java.util.ArrayList;
import java.util.List;

import tech.chazwarp923.unifieditems.crafting.IRecipe.OreToDustRecipe;

public class RecipeRegistry {

	protected static List<OreToDustRecipe> oreToDustRecipes = new ArrayList<OreToDustRecipe>();
	
	public static void addOreToDustRecipe(OreToDustRecipe recipe) {
		for(OreToDustRecipe listRecipe : oreToDustRecipes) {
			if(listRecipe.equals(recipe)) {
				return;
			}
			else {
				oreToDustRecipes.add(recipe);
			}
		}
	}
	
	public static List<OreToDustRecipe> getOreToDustRecipes() {
		List<OreToDustRecipe> tempList = oreToDustRecipes;
		return tempList;
	}
}
