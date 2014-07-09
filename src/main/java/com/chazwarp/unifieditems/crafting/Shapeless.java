package com.chazwarp.unifieditems.crafting;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import com.chazwarp.unifieditems.blocks.ModBlocks;
import com.chazwarp.unifieditems.items.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;

public class Shapeless {

	public static void addCrafting() {
		
	//GameRegistry.addShapelessRecipe(new ItemStack(result, amount), Object... recipe);
		
	//Adds the recipe for bronze
	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ingotBronze, 4), new ItemStack(ModItems.ingotCopper),new ItemStack(ModItems.ingotCopper),new ItemStack(ModItems.ingotCopper), new ItemStack(ModItems.ingotTin));
	
	//Adds the recipes for all the storage blocks
	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.blockCopper), new ItemStack(ModItems.ingotCopper),new ItemStack(ModItems.ingotCopper),new ItemStack(ModItems.ingotCopper), new ItemStack(ModItems.ingotCopper),new ItemStack(ModItems.ingotCopper),new ItemStack(ModItems.ingotCopper), new ItemStack(ModItems.ingotCopper),new ItemStack(ModItems.ingotCopper),new ItemStack(ModItems.ingotCopper));
	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.blockTin), new ItemStack(ModItems.ingotTin),new ItemStack(ModItems.ingotTin),new ItemStack(ModItems.ingotTin), new ItemStack(ModItems.ingotTin),new ItemStack(ModItems.ingotTin),new ItemStack(ModItems.ingotTin), new ItemStack(ModItems.ingotTin),new ItemStack(ModItems.ingotTin),new ItemStack(ModItems.ingotTin));
	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.blockBronze), new ItemStack(ModItems.ingotBronze),new ItemStack(ModItems.ingotBronze),new ItemStack(ModItems.ingotBronze), new ItemStack(ModItems.ingotBronze),new ItemStack(ModItems.ingotBronze),new ItemStack(ModItems.ingotBronze), new ItemStack(ModItems.ingotBronze),new ItemStack(ModItems.ingotBronze),new ItemStack(ModItems.ingotBronze));
	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.blockSilver), new ItemStack(ModItems.ingotSilver),new ItemStack(ModItems.ingotSilver),new ItemStack(ModItems.ingotSilver), new ItemStack(ModItems.ingotSilver),new ItemStack(ModItems.ingotSilver),new ItemStack(ModItems.ingotSilver), new ItemStack(ModItems.ingotSilver),new ItemStack(ModItems.ingotSilver),new ItemStack(ModItems.ingotSilver));	
	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.blockLead), new ItemStack(ModItems.ingotLead),new ItemStack(ModItems.ingotLead),new ItemStack(ModItems.ingotLead), new ItemStack(ModItems.ingotLead),new ItemStack(ModItems.ingotLead),new ItemStack(ModItems.ingotLead), new ItemStack(ModItems.ingotLead),new ItemStack(ModItems.ingotLead),new ItemStack(ModItems.ingotLead));
	
	//Adds the recipe for the "Mortar And Pestle"
	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.mortarAndPestle), new ItemStack(Items.bowl), new ItemStack(Blocks.cobblestone));
	
	//Adds a recipe for flint
	GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.flint, 1), new Object[] {"blockGravel", "craftingMortarAndPestle"}));
	
	//Adds The Recipes for Ores to Dusts
	GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.dustIron, 2), new Object[] {"oreIron", "craftingMortarAndPestle"}));
	GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.dustGold, 2), new Object[] {"oreGold", "craftingMortarAndPestle"}));
	GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.dustCopper, 2), new Object[] {"oreCopper", "craftingMortarAndPestle"}));
	GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.dustTin, 2), new Object[] {"oreTin", "craftingMortarAndPestle"}));
	GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.dustSilver, 2), new Object[] {"oreSilver", "craftingMortarAndPestle"}));
	GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.dustLead, 2), new Object[] {"oreLead", "craftingMortarAndPestle"}));
	
	//Miscellaneous Recipes
	GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.torch, 1), new Object[] {"stickWood", "craftingFlintAndSteel"}));
	}
}