package com.chazwarp.unifieditems.crafting;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import com.chazwarp.unifieditems.blocks.Blocks;
import com.chazwarp.unifieditems.items.Items;

import cpw.mods.fml.common.registry.GameRegistry;

public class Shapeless {

	public static void addCrafting() {
		
	//GameRegistry.addShapelessRecipe(new ItemStack(result, amount), Object... recipe);
		
	//Adds the recipe for bronze
	GameRegistry.addShapelessRecipe(new ItemStack(Items.ingotBronze, 4), new ItemStack(Items.ingotCopper),new ItemStack(Items.ingotCopper),new ItemStack(Items.ingotCopper), new ItemStack(Items.ingotTin));
	
	//Adds the recipes for all the storage blocks
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.blockCopper), new ItemStack(Items.ingotCopper),new ItemStack(Items.ingotCopper),new ItemStack(Items.ingotCopper), new ItemStack(Items.ingotCopper),new ItemStack(Items.ingotCopper),new ItemStack(Items.ingotCopper), new ItemStack(Items.ingotCopper),new ItemStack(Items.ingotCopper),new ItemStack(Items.ingotCopper));
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.blockTin), new ItemStack(Items.ingotTin),new ItemStack(Items.ingotTin),new ItemStack(Items.ingotTin), new ItemStack(Items.ingotTin),new ItemStack(Items.ingotTin),new ItemStack(Items.ingotTin), new ItemStack(Items.ingotTin),new ItemStack(Items.ingotTin),new ItemStack(Items.ingotTin));
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.blockBronze), new ItemStack(Items.ingotBronze),new ItemStack(Items.ingotBronze),new ItemStack(Items.ingotBronze), new ItemStack(Items.ingotBronze),new ItemStack(Items.ingotBronze),new ItemStack(Items.ingotBronze), new ItemStack(Items.ingotBronze),new ItemStack(Items.ingotBronze),new ItemStack(Items.ingotBronze));
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.blockSilver), new ItemStack(Items.ingotSilver),new ItemStack(Items.ingotSilver),new ItemStack(Items.ingotSilver), new ItemStack(Items.ingotSilver),new ItemStack(Items.ingotSilver),new ItemStack(Items.ingotSilver), new ItemStack(Items.ingotSilver),new ItemStack(Items.ingotSilver),new ItemStack(Items.ingotSilver));	
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.blockLead), new ItemStack(Items.ingotLead),new ItemStack(Items.ingotLead),new ItemStack(Items.ingotLead), new ItemStack(Items.ingotLead),new ItemStack(Items.ingotLead),new ItemStack(Items.ingotLead), new ItemStack(Items.ingotLead),new ItemStack(Items.ingotLead),new ItemStack(Items.ingotLead));
	
	//Adds the recipe for the "Mortar And Pestle"
	GameRegistry.addShapelessRecipe(new ItemStack(Items.mortarAndPestle), new ItemStack(Item.bowlEmpty), new ItemStack(Block.cobblestone));
	
	//Adds a recipe for flint
	GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Item.flint, 1), new Object[] {"blockGravel", "craftingMortarAndPestle"}));
	
	//Adds The Recipes for Ores to Dusts
	GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.dustIron, 2), new Object[] {"oreIron", "craftingMortarAndPestle"}));
	GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.dustGold, 2), new Object[] {"oreGold", "craftingMortarAndPestle"}));
	GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.dustCopper, 2), new Object[] {"oreCopper", "craftingMortarAndPestle"}));
	GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.dustTin, 2), new Object[] {"oreTin", "craftingMortarAndPestle"}));
	GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.dustSilver, 2), new Object[] {"oreSilver", "craftingMortarAndPestle"}));
	GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.dustLead, 2), new Object[] {"oreLead", "craftingMortarAndPestle"}));
	
	//Miscellaneous Recipes
	GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Block.torchWood, 1), new Object[] {"stickWood", "craftingFlintAndSteel"}));
	}
}