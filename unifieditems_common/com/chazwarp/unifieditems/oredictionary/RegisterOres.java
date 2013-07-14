package com.chazwarp.unifieditems.oredictionary;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import com.chazwarp.unifieditems.blocks.Blocks;
import com.chazwarp.unifieditems.items.Items;

public class RegisterOres {
	
public static Block oreCopper;
	
//OreDictionary.registerOre("ingotCopper", new ItemStack(ingotCopper));
	public static void addDictCopper() {
	OreDictionary.registerOre("oreCopper", new ItemStack(Blocks.oreCopper));
	OreDictionary.registerOre("ingotCopper", new ItemStack(Items.ingotCopper));
	}
	
public static Block oreTin;

	public static void addDictTin() {
		OreDictionary.registerOre("oreTin", new ItemStack(Blocks.oreTin));
		OreDictionary.registerOre("ingotTin", new ItemStack(Items.ingotTin));
	}
	
public static Item ingotbronze;

	public static void addDictBronze() {
		OreDictionary.registerOre("ingotBronze", new ItemStack(Items.ingotBronze));
	}
	
public static Item itemRubber;

	public static void addDictRubber() {
		OreDictionary.registerOre("itemRubber", new ItemStack(Items.rubber));
	}
	
}
