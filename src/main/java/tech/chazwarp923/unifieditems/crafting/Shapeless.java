package tech.chazwarp923.unifieditems.crafting;

import java.util.Map;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import tech.chazwarp923.unifieditems.block.UIBlockOre;
import tech.chazwarp923.unifieditems.block.UIBlockStorage;
import tech.chazwarp923.unifieditems.block.UIBlocks;
import tech.chazwarp923.unifieditems.crafting.IRecipe.FlintRecipe;
import tech.chazwarp923.unifieditems.crafting.IRecipe.OreToDustRecipe;
import tech.chazwarp923.unifieditems.crafting.IRecipe.TorchRecipe;
import tech.chazwarp923.unifieditems.item.UIItemIngot;
import tech.chazwarp923.unifieditems.item.UIItemNugget;
import tech.chazwarp923.unifieditems.item.UIItems;
import tech.chazwarp923.unifieditems.material.MaterialRegistry;

public class Shapeless {

	public static void init() {
		
		//Adds the recipes for ores to dusts
		GameRegistry.addRecipe(new OreToDustRecipe(null, "Iron"));
		GameRegistry.addRecipe(new OreToDustRecipe(null, "Gold"));
		for(Map.Entry<MaterialRegistry, UIBlockOre> block : UIBlocks.ores.entrySet()) {
			GameRegistry.addRecipe(new OreToDustRecipe(block.getKey(), null));
		}
		
		//Adds the recipe for bronze dust
		GameRegistry.addShapelessRecipe(new ItemStack(UIItems.dusts.get(MaterialRegistry.BRONZE), 4), new ItemStack(UIItems.dusts.get(MaterialRegistry.COPPER)), new ItemStack(UIItems.dusts.get(MaterialRegistry.COPPER)), new ItemStack(UIItems.dusts.get(MaterialRegistry.COPPER)), new ItemStack(UIItems.dusts.get(MaterialRegistry.TIN)));

		//Adds the recipes for ingots to nuggets
		for(Map.Entry<MaterialRegistry, UIItemIngot> item : UIItems.ingots.entrySet()) {
			GameRegistry.addShapelessRecipe(new ItemStack(UIItems.nuggets.get(item.getKey()), 9), new ItemStack(item.getValue()));
		}
		
		//Adds the recipes for ingots to nuggets
		for(Map.Entry<MaterialRegistry, UIItemNugget> item : UIItems.nuggets.entrySet()) {
			GameRegistry.addShapelessRecipe(new ItemStack(UIItems.ingots.get(item.getKey())), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()));
		}
		
		//Adds the recipes for ingots to blocks
		for(Map.Entry<MaterialRegistry, UIItemIngot> item : UIItems.ingots.entrySet()) {
			GameRegistry.addShapelessRecipe(new ItemStack(UIBlocks.blocks.get(item.getKey())), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()));
		}
		
		//Adds the recipes for blocks to ingots
		for(Map.Entry<MaterialRegistry, UIBlockStorage> item : UIBlocks.blocks.entrySet()) {
			GameRegistry.addShapelessRecipe(new ItemStack(UIItems.ingots.get(item.getKey()), 9), new ItemStack(item.getValue()));
		}

		//Adds the recipe for the "Mortar and Pestle"
		GameRegistry.addShapelessRecipe(new ItemStack(UIItems.mortarAndPestle), new ItemStack(Items.BOWL), new ItemStack(Blocks.COBBLESTONE));

		//Adds a recipe for flint
		GameRegistry.addRecipe(new FlintRecipe());
		
		//Miscellaneous recipes
		GameRegistry.addRecipe(new TorchRecipe());
	}
}