package com.chazwarp.unifieditems.oredictionary;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import com.chazwarp.unifieditems.blocks.Blocks;
import com.chazwarp.unifieditems.items.Items;

public class RegisterDict {
	
public static Item dustIron;
	
	public static void addIron() {
	OreDictionary.registerOre("dustIron", new ItemStack(Items.dustIron));
	}
	
public static Item dustGold;
	
	public static void addGold() {
	OreDictionary.registerOre("dustGold", new ItemStack(Items.dustGold));
	}
	
public static Block oreCopper;
	
	public static void addCopper() {
	OreDictionary.registerOre("oreCopper", new ItemStack(Blocks.oreCopper));
	OreDictionary.registerOre("ingotCopper", new ItemStack(Items.ingotCopper));
	OreDictionary.registerOre("dustCopper", new ItemStack(Items.dustCopper));
	OreDictionary.registerOre("blockCopper", new ItemStack(Blocks.blockCopper));
	}
	
public static Block oreTin;

	public static void addTin() {
		OreDictionary.registerOre("oreTin", new ItemStack(Blocks.oreTin));
		OreDictionary.registerOre("ingotTin", new ItemStack(Items.ingotTin));
		OreDictionary.registerOre("dustTin", new ItemStack(Items.dustTin));
		OreDictionary.registerOre("blockTin", new ItemStack(Blocks.blockTin));
	}
	
public static Item ingotBronze;

	public static void addBronze() {
		OreDictionary.registerOre("ingotBronze", new ItemStack(Items.ingotBronze));
		OreDictionary.registerOre("blockBronze", new ItemStack(Blocks.blockBronze));
	}
	
public static Item ingotSilver;

	public static void addSilver() {
		OreDictionary.registerOre("oreSilver", new ItemStack(Blocks.oreSilver));
		OreDictionary.registerOre("ingotSilver", new ItemStack(Items.ingotSilver));
		OreDictionary.registerOre("dustSilver", new ItemStack(Items.dustSilver));
		OreDictionary.registerOre("blockSilver", new ItemStack(Blocks.blockSilver));
	}	
	
public static Item ingotLead;

	public static void addLead() {
		OreDictionary.registerOre("oreLead", new ItemStack(Blocks.oreLead));
		OreDictionary.registerOre("ingotLead", new ItemStack(Items.ingotLead));
		OreDictionary.registerOre("dustLead", new ItemStack(Items.dustLead));
		OreDictionary.registerOre("blockLead", new ItemStack(Blocks.blockLead));
	}
	
public static Item itemRubber;

	public static void addRubber() {
		OreDictionary.registerOre("itemRubber", new ItemStack(Items.ingotRubber));
	}
	
public static Item itemSinglePul;

	public static void addSinglePul() {
		OreDictionary.registerOre("craftingSinglePul", new ItemStack(Items.singlePul));
	}
	
}