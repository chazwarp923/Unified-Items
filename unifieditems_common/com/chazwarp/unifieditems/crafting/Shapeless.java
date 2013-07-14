package com.chazwarp.unifieditems.crafting;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

import com.chazwarp.unifieditems.blocks.Blocks;
import com.chazwarp.unifieditems.items.Items;

import cpw.mods.fml.common.registry.GameRegistry;

public class Shapeless {
	
	public static void addCrafting() {
		
//GameRegistry.addShapelessRecipe(new ItemStack(result, amount), Object... recipe);
		
	//Adds the recipe for bronze
	GameRegistry.addShapelessRecipe(new ItemStack(Items.ingotBronze, 4), new ItemStack(Items.ingotCopper),new ItemStack(Items.ingotCopper),new ItemStack(Items.ingotCopper), new ItemStack(Items.ingotTin));
	
	//Adds the recipe for jungle wood planks from rubber wood
	GameRegistry.addShapelessRecipe(new ItemStack(Block.planks, 4), new ItemStack(Blocks.woodRubber));
		
	}

}
