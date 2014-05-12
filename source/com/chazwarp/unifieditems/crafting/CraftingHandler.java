package com.chazwarp.unifieditems.crafting;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.ICraftingHandler;

public class CraftingHandler implements ICraftingHandler{

	@Override
	public void onCrafting(EntityPlayer player, ItemStack item, IInventory inv) 
	{
	  	for(int i=0; i < inv.getSizeInventory(); i++)
		{        	
	    	if(inv.getStackInSlot(i) != null)
	    	{
	    		ItemStack j = inv.getStackInSlot(i);
	    		if(j.getItem() != null && j.getItem() == Item.flintAndSteel)
	    		{
	    			ItemStack k = new ItemStack(Item.flintAndSteel, 2, (j.getItemDamage() + 1));
	    			inv.setInventorySlotContents(i, k);
	    		}
	    	}  
		}
	}

	@Override
	public void onSmelting(EntityPlayer player, ItemStack item) {
		
	}

}
