package tech.chazwarp923.unifieditems.crafting;

import java.util.Map;

import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.oredict.ShapedOreRecipe;
import tech.chazwarp923.unifieditems.Reference;
import tech.chazwarp923.unifieditems.item.UIItemIngot;
import tech.chazwarp923.unifieditems.item.UIItems;
import tech.chazwarp923.unifieditems.material.Material;

public class Shaped {
	
	public static void init() {
		for(Map.Entry<Material, UIItemIngot> item : UIItems.ingots.entrySet()) {
			//GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UIItems.gears.get(item.getKey()), 1), new Object[] { "SIS", "I I", "SIS", 'S', "stickWood", 'I', item.getValue() }));
			//ForgeRegistries.RECIPES.register(new ShapedOreRecipe(new ResourceLocation(Reference.RESOURCE_PREFIX + item.toString()), new ItemStack(UIItems.gears.get(item.getKey()), 1), new Object[] { "SIS", "I I", "SIS", 'S', "stickWood", 'I', item.getValue() }).setRegistryName(new ResourceLocation(Reference.RESOURCE_PREFIX + item.toString())));
			RecipeRegistry.addCraftingRecipe(new ShapedOreRecipe(new ResourceLocation(Reference.RESOURCE_PREFIX + item.toString()), new ItemStack(UIItems.gears.get(item.getKey()), 1), new Object[] { "SIS", "I I", "SIS", 'S', "stickWood", 'I', item.getValue() }).setRegistryName(new ResourceLocation(Reference.RESOURCE_PREFIX + item.toString())));
		}
	}
}
