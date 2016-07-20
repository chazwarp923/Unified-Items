package tech.chazwarp923.unifieditems.crafting;

import java.util.Map;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import tech.chazwarp923.unifieditems.block.UIBlockOre;
import tech.chazwarp923.unifieditems.block.UIBlocks;
import tech.chazwarp923.unifieditems.crafting.IRecipe.FlintRecipe;
import tech.chazwarp923.unifieditems.crafting.IRecipe.OreToDustRecipe;
import tech.chazwarp923.unifieditems.crafting.IRecipe.TorchRecipe;
import tech.chazwarp923.unifieditems.item.UIItemIngot;
import tech.chazwarp923.unifieditems.item.UIItems;

public class Shapeless {

	public static void init() {
		
		//Adds the recipes for Ores to Dusts
		GameRegistry.addRecipe(new OreToDustRecipe("Iron"));
		GameRegistry.addRecipe(new OreToDustRecipe("Gold"));
		for(Map.Entry<String, UIBlockOre> block : UIBlocks.ores.entrySet()) {
			GameRegistry.addRecipe(new OreToDustRecipe(block.getKey()));
		}
		
		//Adds the recipe for bronze
		GameRegistry.addShapelessRecipe(new ItemStack(UIItems.dusts.get("Bronze"), 4), new ItemStack(UIItems.dusts.get("Copper")), new ItemStack(UIItems.dusts.get("Copper")), new ItemStack(UIItems.dusts.get("Copper")), new ItemStack(UIItems.dusts.get("Tin")));

		//Adds the recipes for all the storage blocks
		for(Map.Entry<String, UIItemIngot> item : UIItems.ingots.entrySet()) {
			GameRegistry.addShapelessRecipe(new ItemStack(UIBlocks.blocks.get(item.getKey())), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()));
		}

		//Adds the recipe for the Mortar and Pestle
		GameRegistry.addShapelessRecipe(new ItemStack(UIItems.mortarAndPestle), new ItemStack(Items.BOWL), new ItemStack(Blocks.COBBLESTONE));

		//Adds a recipe for flint
		GameRegistry.addRecipe(new FlintRecipe());
		
		//Miscellaneous recipes
		GameRegistry.addRecipe(new TorchRecipe());
	}
}