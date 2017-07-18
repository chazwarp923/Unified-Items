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
		
		RecipeJsonHelper.addShapedRecipe(new ItemStack(UIItems.mortarAndPestle), new Object[] { "BC", 'B', Items.BOWL, 'C', "blockCobblestone" });
		
		for(Map.Entry<Material, UIItemIngot> item : UIItems.ingots.entrySet()) {
			RecipeJsonHelper.addShapedRecipe(new ItemStack(UIItems.gears.get(item.getKey()), 1), new Object[] { "SIS", "I I", "SIS", 'S', "stickWood", 'I', item.getValue() });
		}
	}
}
