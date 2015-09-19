package com.chazwarp.unifieditems.oredictionary;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import com.chazwarp.unifieditems.blocks.ModBlocks;
import com.chazwarp.unifieditems.items.ModItems;

public class OreDict {



	public static void addCopper() {
		OreDictionary.registerOre("oreCopper", new ItemStack(
				ModBlocks.oreCopper));

		OreDictionary.registerOre("blockCopper", new ItemStack(
				ModBlocks.blockCopper));
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
		addRawRubber();
		addRubber();
		addMortarAndPestle();
		addFlintAndSteel();
	}
}