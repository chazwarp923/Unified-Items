package com.chazwarp.unifieditems.crafting;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

import com.chazwarp.unifieditems.items.Items;
import com.chazwarp.unifieditems.lib.BlockInfo;
import com.chazwarp.unifieditems.lib.ItemInfo;

import cpw.mods.fml.common.registry.GameRegistry;

public class Smelting {

	public static void addSmelting() {
	
//GameRegistry.addSmelting(inputItemID,new ItemStack(result), 0.1f);
		
	//Smelting recipe for Copper
	GameRegistry.addSmelting(BlockInfo.COPPER_ORE_ID, new ItemStack(Items.ingotCopper), 0.5f);
	
	//Smelting recipe for Tin
	GameRegistry.addSmelting(BlockInfo.TIN_ORE_ID, new ItemStack(Items.ingotTin), 0.5f);
	
	//Smelting recipe for Silver
	GameRegistry.addSmelting(BlockInfo.SILVER_ORE_ID, new ItemStack(Items.ingotSilver), 1.0f);
	
	//Smelting recipe for Lead
	GameRegistry.addSmelting(BlockInfo.LEAD_ORE_ID, new ItemStack(Items.ingotLead), 1.0f);
	
	//Smelting recipe for Rubber from logs
	GameRegistry.addSmelting(BlockInfo.RUBBER_WOOD_ID, new ItemStack(Items.ingotRubber), 0.7f);

	//Smelting recipe for Iron from dust
	GameRegistry.addSmelting(ItemInfo.DUST_IRON_ID + 256, new ItemStack(Item.ingotIron), 0.25f);
	
	//Smelting recipe for Gold from dust
	GameRegistry.addSmelting(ItemInfo.DUST_GOLD_ID + 256, new ItemStack(Item.ingotGold), 0.25f);
	
	//Smelting recipe for Copper from dust
	GameRegistry.addSmelting(ItemInfo.DUST_COPPER_ID + 256, new ItemStack(Items.ingotCopper), 0.25f);
	
	//Smelting recipe for Tin from dust
	GameRegistry.addSmelting(ItemInfo.DUST_TIN_ID + 256, new ItemStack(Items.ingotTin), 0.25f);
	
	//Smelting recipe for Silver from dust
	GameRegistry.addSmelting(ItemInfo.DUST_SILVER_ID + 256, new ItemStack(Items.ingotSilver), 0.5f);
	
	//Smelting recipe for Lead from dust
	GameRegistry.addSmelting(ItemInfo.DUST_LEAD_ID + 256, new ItemStack(Items.ingotLead), 0.5f);
	
	//Smelting recipe for Rubber from "Raw Rubber"
	GameRegistry.addSmelting(ItemInfo.RAW_RUBBER_ID + 256, new ItemStack(Items.ingotRubber), 0.7f);
	
	}

}