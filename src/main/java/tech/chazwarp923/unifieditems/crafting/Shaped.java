package tech.chazwarp923.unifieditems.crafting;

import java.util.Map;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import tech.chazwarp923.unifieditems.item.UIItemIngot;
import tech.chazwarp923.unifieditems.item.UIItems;
import tech.chazwarp923.unifieditems.material.Material;
import tech.chazwarp923.unifieditems.tools.RecipeJsonHelper;

public class Shaped {
	
	public static void init() {

        //Adds the recipe for the "Mortar and Pestle"
		RecipeJsonHelper.addShapedRecipe(new ItemStack(UIItems.mortarAndPestle), new Object[] { "BC", 'B', Items.BOWL, 'C', "cobblestone" });
        RecipeJsonHelper.addShapedRecipe(new ItemStack(UIItems.mortarAndPestle), new Object[] { "BC", 'B', Items.BOWL, 'C', "blockCobblestone" });

		//Adds the recipes for the gears
		for(Map.Entry<Material, UIItemIngot> item : UIItems.ingots.entrySet()) {
			RecipeJsonHelper.addShapedRecipe(new ItemStack(UIItems.gears.get(item.getKey()), 1), new Object[] { "SIS", "I I", "SIS", 'S', "stickWood", 'I', item.getValue() });
		}
        RecipeJsonHelper.addShapedRecipe(new ItemStack(UIItems.gears.get(Material.IRON), 1), new Object[] { "SIS", "I I", "SIS", 'S', "stickWood", 'I', Items.IRON_INGOT });
        RecipeJsonHelper.addShapedRecipe(new ItemStack(UIItems.gears.get(Material.GOLD), 1), new Object[] { "SIS", "I I", "SIS", 'S', "stickWood", 'I', Items.GOLD_INGOT });

        //Adds the recipes for the plates
        for(Map.Entry<Material, UIItemIngot> item : UIItems.ingots.entrySet()) {
            RecipeJsonHelper.addShapedRecipe(new ItemStack(UIItems.plates.get(item.getKey()), 4), new Object[] { "II", "II", 'I', item.getValue() });
        }
        RecipeJsonHelper.addShapedRecipe(new ItemStack(UIItems.plates.get(Material.IRON), 4), new Object[] { "II", "II", 'I', Items.IRON_INGOT });
        RecipeJsonHelper.addShapedRecipe(new ItemStack(UIItems.plates.get(Material.GOLD), 4), new Object[] { "II", "II", 'I', Items.GOLD_INGOT });
	}
}
