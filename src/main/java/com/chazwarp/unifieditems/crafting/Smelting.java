package com.chazwarp.unifieditems.crafting;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.chazwarp.unifieditems.blocks.ModBlocks;
import com.chazwarp.unifieditems.items.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;

public class Smelting {

	public static void addSmelting() {

		// Smelting recipes for the Ores
		GameRegistry.addSmelting(ModBlocks.oreCopper, new ItemStack(
				ModItems.ingotCopper), 0.5f);
		GameRegistry.addSmelting(ModBlocks.oreTin, new ItemStack(
				ModItems.ingotTin), 0.5f);
		GameRegistry.addSmelting(ModBlocks.oreSilver, new ItemStack(
				ModItems.ingotSilver), 1.0f);
		GameRegistry.addSmelting(ModBlocks.oreLead, new ItemStack(
				ModItems.ingotLead), 1.0f);

		// Smelting recipes for the Dusts
		GameRegistry.addSmelting(ModItems.dustIron, new ItemStack(
				Items.iron_ingot), 0.25f);
		GameRegistry.addSmelting(ModItems.dustGold, new ItemStack(
				Items.gold_ingot), 0.25f);
		GameRegistry.addSmelting(ModItems.dustCopper, new ItemStack(
				ModItems.ingotCopper), 0.25f);
		GameRegistry.addSmelting(ModItems.dustTin, new ItemStack(
				ModItems.ingotTin), 0.25f);
		GameRegistry.addSmelting(ModItems.dustBronze, new ItemStack(
				ModItems.ingotBronze), 0.25f);
		GameRegistry.addSmelting(ModItems.dustSilver, new ItemStack(
				ModItems.ingotSilver), 0.5f);
		GameRegistry.addSmelting(ModItems.dustLead, new ItemStack(
				ModItems.ingotLead), 0.5f);

		// Smelting recipe for Rubber from "Raw Rubber"
		GameRegistry.addSmelting(ModItems.rawRubber, new ItemStack(
				ModItems.ingotRubber), 0.7f);
	}
}