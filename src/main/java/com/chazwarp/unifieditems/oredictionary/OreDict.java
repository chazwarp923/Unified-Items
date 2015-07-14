package com.chazwarp.unifieditems.oredictionary;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import com.chazwarp.unifieditems.blocks.ModBlocks;
import com.chazwarp.unifieditems.items.ModItems;

public class OreDict {

	public static void addIron() {
		OreDictionary.registerOre("dustIron", new ItemStack(ModItems.dustIron));
	}

	public static void addGold() {
		OreDictionary.registerOre("dustGold", new ItemStack(ModItems.dustGold));
	}

	public static void addCopper() {
		OreDictionary.registerOre("oreCopper", new ItemStack(
				ModBlocks.oreCopper));
		OreDictionary.registerOre("ingotCopper", new ItemStack(
				ModItems.ingotCopper));
		OreDictionary.registerOre("dustCopper", new ItemStack(
				ModItems.dustCopper));
		OreDictionary.registerOre("blockCopper", new ItemStack(
				ModBlocks.blockCopper));
	}

	public static void addTin() {
		OreDictionary.registerOre("oreTin", new ItemStack(ModBlocks.oreTin));
		OreDictionary.registerOre("ingotTin", new ItemStack(ModItems.ingotTin));
		OreDictionary.registerOre("dustTin", new ItemStack(ModItems.dustTin));
		OreDictionary
				.registerOre("blockTin", new ItemStack(ModBlocks.blockTin));
	}

	public static void addBronze() {
		OreDictionary.registerOre("ingotBronze", new ItemStack(
				ModItems.ingotBronze));
		OreDictionary.registerOre("dustBronze", new ItemStack(
				ModItems.dustBronze));
		OreDictionary.registerOre("blockBronze", new ItemStack(
				ModBlocks.blockBronze));
	}

	public static void addSilver() {
		OreDictionary.registerOre("oreSilver", new ItemStack(
				ModBlocks.oreSilver));
		OreDictionary.registerOre("ingotSilver", new ItemStack(
				ModItems.ingotSilver));
		OreDictionary.registerOre("dustSilver", new ItemStack(
				ModItems.dustSilver));
		OreDictionary.registerOre("blockSilver", new ItemStack(
				ModBlocks.blockSilver));
	}

	public static void addLead() {
		OreDictionary.registerOre("oreLead", new ItemStack(ModBlocks.oreLead));
		OreDictionary.registerOre("ingotLead",
				new ItemStack(ModItems.ingotLead));
		OreDictionary.registerOre("dustLead", new ItemStack(ModItems.dustLead));
		OreDictionary.registerOre("blockLead", new ItemStack(
				ModBlocks.blockLead));
	}

	public static void addRawRubber() {
		OreDictionary.registerOre("itemRawRubber", new ItemStack(
				ModItems.rawRubber));
	}

	public static void addRubber() {
		OreDictionary.registerOre("itemRubber", new ItemStack(
				ModItems.ingotRubber));
		OreDictionary.registerOre("ingotRubber", new ItemStack(
				ModItems.ingotRubber));
	}

	public static void addMortarAndPestle() {
		OreDictionary.registerOre("craftingMortarAndPestle", new ItemStack(
				ModItems.mortarAndPestle, 1, 0));
		OreDictionary.registerOre("craftingMortarAndPestle", new ItemStack(
				ModItems.mortarAndPestle, 1, 1));
		OreDictionary.registerOre("craftingMortarAndPestle", new ItemStack(
				ModItems.mortarAndPestle, 1, 2));
		OreDictionary.registerOre("craftingMortarAndPestle", new ItemStack(
				ModItems.mortarAndPestle, 1, 3));
		OreDictionary.registerOre("blockGravel", new ItemStack(Blocks.gravel));
	}

	public static void addFlintAndSteel() {
		for (int i = 0; i < new ItemStack(Items.flint_and_steel).getMaxDamage(); i++)
			OreDictionary.registerOre("craftingFlintAndSteel", new ItemStack(
					Items.flint_and_steel, 1, i));
	}

	public static void registerAll() {
		addIron();
		addGold();
		addCopper();
		addTin();
		addBronze();
		addSilver();
		addLead();
		addRawRubber();
		addRubber();
		addMortarAndPestle();
		addFlintAndSteel();
	}
}