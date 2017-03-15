package tech.chazwarp923.unifieditems.crafting;

import java.util.Map;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import tech.chazwarp923.unifieditems.item.UIItemIngot;
import tech.chazwarp923.unifieditems.item.UIItems;
import tech.chazwarp923.unifieditems.material.Material;

public class Shaped {

	public static void init() {
		for(Map.Entry<Material, UIItemIngot> item : UIItems.ingots.entrySet()) {
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UIItems.gears.get(item.getKey()), 1), new Object[] { "SIS", "I I", "SIS", 'S', "stickWood", 'I', item.getValue() }));
		}
	}
}
