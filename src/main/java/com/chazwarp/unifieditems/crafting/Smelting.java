package com.chazwarp.unifieditems.crafting;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.chazwarp.unifieditems.blocks.ModBlocks;
import com.chazwarp.unifieditems.items.ModItems;
import com.chazwarp.unifieditems.lib.BlockInfo;
import com.chazwarp.unifieditems.lib.ItemInfo;

import cpw.mods.fml.common.registry.GameRegistry;

public class Smelting {

	public static void addSmelting() {
	
//GameRegistry.addSmelting(inputItemID,new ItemStack(result), 0.1f);
		
	//Smelting recipe for Copper
	GameRegistry.addSmelting(ModBlocks.oreCopper, new ItemStack(ModItems.ingotCopper), 0.5f);
	
	//Smelting recipe for Tin
	GameRegistry.addSmelting(ModBlocks.oreTin, new ItemStack(ModItems.ingotTin), 0.5f);
	
	//Smelting recipe for Silver
	GameRegistry.addSmelting(ModBlocks.oreSilver, new ItemStack(ModItems.ingotSilver), 1.0f);
	
	//Smelting recipe for Lead
	GameRegistry.addSmelting(ModBlocks.oreLead, new ItemStack(ModItems.ingotLead), 1.0f);

	//Smelting recipe for Iron from dust
	GameRegistry.addSmelting(ModItems.dustIron, new ItemStack(Items.iron_ingot), 0.25f);
	
	//Smelting recipe for Gold from dust
	GameRegistry.addSmelting(ModItems.dustGold, new ItemStack(Items.gold_ingot), 0.25f);
	
	//Smelting recipe for Copper from dust
	GameRegistry.addSmelting(ModItems.dustCopper, new ItemStack(ModItems.ingotCopper), 0.25f);
	
	//Smelting recipe for Tin from dust
	GameRegistry.addSmelting(ModItems.dustTin, new ItemStack(ModItems.ingotTin), 0.25f);
	
	//Smelting recipe for Silver from dust
	GameRegistry.addSmelting(ModItems.dustSilver, new ItemStack(ModItems.ingotSilver), 0.5f);
	
	//Smelting recipe for Lead from dust
	GameRegistry.addSmelting(ModItems.dustLead, new ItemStack(ModItems.ingotLead), 0.5f);
	
	//Smelting recipe for Rubber from "Raw Rubber"
	GameRegistry.addSmelting(ModItems.rawRubber, new ItemStack(ModItems.ingotRubber), 0.7f);	
	}
}