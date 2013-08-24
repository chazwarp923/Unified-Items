package com.chazwarp.unifieditems.crafting;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
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
	
	//Adds the recipe for jungle wood planks from rubber wood
	GameRegistry.addShapelessRecipe(new ItemStack(Block.planks, 4, 3), new ItemStack(Blocks.woodRubber));
	
	//Adds The Recipes for Ores to Dusts
	GameRegistry.addRecipe(new ShapedOreRecipe(Items.dustCopper, true, new Object[]{"AB", Character.valueOf('A'), "singlePul", Character.valueOf('B'), "oreCopper"}));
	
	}

}
