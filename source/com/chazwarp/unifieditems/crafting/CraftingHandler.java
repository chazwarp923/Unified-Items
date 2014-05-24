package com.chazwarp.unifieditems.crafting;

import com.chazwarp.unifieditems.blocks.Blocks;
import com.chazwarp.unifieditems.items.Items;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.ICraftingHandler;

public class CraftingHandler implements ICraftingHandler{

	@Override
	public void onCrafting(EntityPlayer player, ItemStack item, IInventory inv) 
	{
		//Helps The Torch Recipe
	  	for(int i=0; i < inv.getSizeInventory(); i++)
		{        	
	    	if(inv.getStackInSlot(i) != null)
	    	{
	    		ItemStack j = inv.getStackInSlot(i);
	    		if(j.getItem() != null && j.getItem() == Item.flintAndSteel)
	    		{
	    			ItemStack k = new ItemStack(Item.flintAndSteel, 2, (j.getItemDamage() + 1));
	    			if(k.getItemDamage() == k.getMaxDamage()) {
	    				k = null;
	    			}
	    			inv.setInventorySlotContents(i, k);
	    		}
	    	}  
		}
	  	
	  //Helps The Ore Recipes
	  	for(int i=0; i < inv.getSizeInventory(); i++)
		{        	
	    	if(inv.getStackInSlot(i) != null)
	    	{
	    		ItemStack j = inv.getStackInSlot(i);
	    		if(j.getItem() == Items.mortarAndPestle)
	    		{
	    			ItemStack k = new ItemStack(Items.mortarAndPestle, 2, (j.getItemDamage() + 1));
	    			if(k.getItemDamage() == k.getMaxDamage()) {
	    				k = null;
	    			}
	    			inv.setInventorySlotContents(i, k);
	    		}
	    	}  
		}
	  	
	  	//Helps The Flint Recipe
	  	ItemStack GravelStack = new ItemStack(Block.gravel);
	  	
	  	for(int i=0; i < inv.getSizeInventory(); i++)
		{        	
	    	if(inv.getStackInSlot(i) != null)
	    	{
	    		ItemStack j = inv.getStackInSlot(i);
	    		if(j != null && j == GravelStack)
	    		{
	    			ItemStack k = new ItemStack(Items.mortarAndPestle, 2, (j.getItemDamage() + 1));
	    			inv.setInventorySlotContents(i, k);
	    		}
	    	}  
		}
	}

	@Override
	public void onSmelting(EntityPlayer player, ItemStack item) {
		
	}

}
