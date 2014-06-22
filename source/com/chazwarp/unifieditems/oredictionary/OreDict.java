package com.chazwarp.unifieditems.oredictionary;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import com.chazwarp.unifieditems.blocks.Blocks;
import com.chazwarp.unifieditems.items.Items;

public class OreDict {
		
		public static void addIron() {
			OreDictionary.registerOre("dustIron", new ItemStack(Items.dustIron));
		}
		
		public static void addGold() {
			OreDictionary.registerOre("dustGold", new ItemStack(Items.dustGold));
		}
		
		public static void addCopper() {
			OreDictionary.registerOre("oreCopper", new ItemStack(Blocks.oreCopper));
			OreDictionary.registerOre("ingotCopper", new ItemStack(Items.ingotCopper));
			OreDictionary.registerOre("dustCopper", new ItemStack(Items.dustCopper));
			OreDictionary.registerOre("blockCopper", new ItemStack(Blocks.blockCopper));
		}
	
		public static void addTin() {
			OreDictionary.registerOre("oreTin", new ItemStack(Blocks.oreTin));
			OreDictionary.registerOre("ingotTin", new ItemStack(Items.ingotTin));
			OreDictionary.registerOre("dustTin", new ItemStack(Items.dustTin));
			OreDictionary.registerOre("blockTin", new ItemStack(Blocks.blockTin));
		}
	
		public static void addBronze() {
			OreDictionary.registerOre("ingotBronze", new ItemStack(Items.ingotBronze));
			OreDictionary.registerOre("blockBronze", new ItemStack(Blocks.blockBronze));
		}
	
		public static void addSilver() {
			OreDictionary.registerOre("oreSilver", new ItemStack(Blocks.oreSilver));
			OreDictionary.registerOre("ingotSilver", new ItemStack(Items.ingotSilver));
			OreDictionary.registerOre("dustSilver", new ItemStack(Items.dustSilver));
			OreDictionary.registerOre("blockSilver", new ItemStack(Blocks.blockSilver));
		}	
	
		public static void addLead() {
			OreDictionary.registerOre("oreLead", new ItemStack(Blocks.oreLead));
			OreDictionary.registerOre("ingotLead", new ItemStack(Items.ingotLead));
			OreDictionary.registerOre("dustLead", new ItemStack(Items.dustLead));
			OreDictionary.registerOre("blockLead", new ItemStack(Blocks.blockLead));
		}
	
		public static void addRawRubber() {
			OreDictionary.registerOre("itemRawRubber", new ItemStack(Items.rawRubber));
		}	
		
	
		public static void addRubber() {
			OreDictionary.registerOre("itemRubber", new ItemStack(Items.ingotRubber));
			OreDictionary.registerOre("ingotRubber", new ItemStack(Items.ingotRubber));
		}
	
		public static void addMortarAndPestle() {
			OreDictionary.registerOre("craftingMortarAndPestle", new ItemStack(Items.mortarAndPestle.itemID, 1, 0));
			OreDictionary.registerOre("craftingMortarAndPestle", new ItemStack(Items.mortarAndPestle.itemID, 1, 1));
			OreDictionary.registerOre("craftingMortarAndPestle", new ItemStack(Items.mortarAndPestle.itemID, 1, 2));
			OreDictionary.registerOre("craftingMortarAndPestle", new ItemStack(Items.mortarAndPestle.itemID, 1, 3));
			OreDictionary.registerOre("blockGravel", new ItemStack(Block.gravel));
		}	
		
		public static void addFlintAndSteel() {
			for(int i=0; i < new ItemStack(Item.flintAndSteel).getMaxDamage(); i++)
			OreDictionary.registerOre("craftingFlintAndSteel", new ItemStack(Item.flintAndSteel.itemID, 1, i));
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