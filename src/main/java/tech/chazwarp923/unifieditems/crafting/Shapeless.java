package tech.chazwarp923.unifieditems.crafting;

import java.util.Map;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import tech.chazwarp923.unifieditems.block.UIBlockOre;
import tech.chazwarp923.unifieditems.block.UIBlocks;
import tech.chazwarp923.unifieditems.item.UIItemIngot;
import tech.chazwarp923.unifieditems.item.UIItems;

public class Shapeless {

	public static void init() {

		//TODO Fix #2
		/*
		// Adds The Recipes for Ores to Dusts
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UIItems.dusts.get("Iron"), 2), new Object[] { "craftingMortarAndPestle", "oreIron" }));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UIItems.dusts.get("Gold"), 2), new Object[] { "craftingMortarAndPestle", "oreGold" }));
		for(Map.Entry<String, UIBlockOre> block : UIBlocks.ores.entrySet()) {
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UIItems.dusts.get(block.getKey()), 2), new Object[] { "craftingMortarAndPestle","ore" + block.getKey() }));
		}*/
		
		// Adds the recipe for bronze
		GameRegistry.addShapelessRecipe(new ItemStack(UIItems.dusts.get("Bronze"), 4), new ItemStack(UIItems.dusts.get("Copper")), new ItemStack(UIItems.dusts.get("Copper")), new ItemStack(UIItems.dusts.get("Copper")), new ItemStack(UIItems.dusts.get("Tin")));

		// Adds the recipes for all the storage blocks
		for(Map.Entry<String, UIItemIngot> item : UIItems.ingots.entrySet()) {
			GameRegistry.addShapelessRecipe(new ItemStack(UIBlocks.blocks.get(item.getKey())), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()));
		}

		// Adds the recipe for the "Mortar And Pestle"
		GameRegistry.addShapelessRecipe(new ItemStack(UIItems.mortarAndPestle), new ItemStack(Items.BOWL), new ItemStack(Blocks.COBBLESTONE));

		// Adds a recipe for flint
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.FLINT, 1), new Object[] { "blockGravel","craftingMortarAndPestle" }));

		// Miscellaneous Recipes
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.TORCH, 2), new Object[] { "stickWood","craftingFlintAndSteel" }));
	}
}