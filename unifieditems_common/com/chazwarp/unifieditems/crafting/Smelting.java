package com.chazwarp.unifieditems.crafting;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.chazwarp.unifieditems.items.Items;
import com.chazwarp.unifieditems.lib.BlockInfo;
import com.chazwarp.unifieditems.lib.ItemInfo;

import cpw.mods.fml.common.registry.GameRegistry;

public class Smelting {

	public static void addSmelting() {
	
//GameRegistry.addSmelting(inputItemID,new ItemStack(result), 0.1f);
		
	//Smelting recipe forCcopper
	GameRegistry.addSmelting(BlockInfo.COPPER_ORE_ID, new ItemStack(Items.ingotCopper), 0.1f);
	
	//Smelting recipe for Tin
	GameRegistry.addSmelting(BlockInfo.TIN_ORE_ID, new ItemStack(Items.ingotTin), 0.1f);
	
	//Smelting recipe for Silver
	GameRegistry.addSmelting(BlockInfo.SILVER_ORE_ID, new ItemStack(Items.ingotSilver), 0.1f);
	
	//Smelting recipe for Lead
	GameRegistry.addSmelting(BlockInfo.LEAD_ORE_ID, new ItemStack(Items.ingotLead), 0.1f);
	
	//Smelting recipe for Rubber from logs
	GameRegistry.addSmelting(BlockInfo.RUBBER_WOOD_ID, new ItemStack(Items.ingotRubber), 0.2f);

	//Smelting recipe for Rubber from rawrubber
	GameRegistry.addSmelting(ItemInfo.RAW_RUBBER_ID, new ItemStack(Items.ingotRubber), 0.2f);
	}

}