package com.chazwarp.unifieditems.oredictionary;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import com.chazwarp.unifieditems.blocks.Blocks;
import com.chazwarp.unifieditems.items.Items;

public class RegisterDict {
	
public static Block oreCopper;
	
//OreDictionary.registerOre("ingotCopper", new ItemStack(ingotCopper));
	public static void addCopper() {
	OreDictionary.registerOre("oreCopper", new ItemStack(Blocks.oreCopper));
	OreDictionary.registerOre("ingotCopper", new ItemStack(Items.ingotCopper));
	}
	
public static Block oreTin;

	public static void addTin() {
		OreDictionary.registerOre("oreTin", new ItemStack(Blocks.oreTin));
		OreDictionary.registerOre("ingotTin", new ItemStack(Items.ingotTin));
	}
	
public static Item ingotBronze;

	public static void addBronze() {
		OreDictionary.registerOre("ingotBronze", new ItemStack(Items.ingotBronze));
	}
	
public static Item ingotSilver;

	public static void addSilver() {
		OreDictionary.registerOre("oreSilver", new ItemStack(Blocks.oreSilver));
		OreDictionary.registerOre("ingotSilver", new ItemStack(Items.ingotSilver));
	}	
	
public static Item ingotLead;

	public static void addLead() {
		OreDictionary.registerOre("oreLead", new ItemStack(Blocks.oreLead));
		OreDictionary.registerOre("ingotLead", new ItemStack(Items.ingotLead));
	}
	
public static Item itemRubber;

	public static void addRubber() {
		OreDictionary.registerOre("itemRubber", new ItemStack(Items.rubber));
	}
	
}
