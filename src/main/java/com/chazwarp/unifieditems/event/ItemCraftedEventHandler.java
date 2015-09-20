/**
@author Chaz Kerby
 */

package com.chazwarp.unifieditems.event;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.chazwarp.unifieditems.items.UIItems;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;

public class ItemCraftedEventHandler {

	@SubscribeEvent
	public void itemCrafted(ItemCraftedEvent event) {

		// Helps The Torch Recipe
		for (int i = 0; i < event.craftMatrix.getSizeInventory(); i++) {
			if (event.craftMatrix.getStackInSlot(i) != null) {
				ItemStack j = event.craftMatrix.getStackInSlot(i);
				if (j.getItem() != null && j.getItem() == Items.flint_and_steel) {
					ItemStack k = new ItemStack(Items.flint_and_steel, 2,
							(j.getItemDamage() + 1));
					if (k.getItemDamage() == k.getMaxDamage()) {
						k = null;
					}
					event.craftMatrix.setInventorySlotContents(i, k);
				}
			}
		}

		// Helps The Ore Recipes
		for (int i = 0; i < event.craftMatrix.getSizeInventory(); i++) {
			if (event.craftMatrix.getStackInSlot(i) != null) {
				ItemStack j = event.craftMatrix.getStackInSlot(i);
				if (j.getItem() == UIItems.mortarAndPestle) {
					ItemStack k = new ItemStack(UIItems.mortarAndPestle, 2,
							(j.getItemDamage() + 1));
					if (k.getItemDamage() == k.getMaxDamage()) {
						k = null;
					}
					event.craftMatrix.setInventorySlotContents(i, k);
				}
			}
		}

		// Helps The Flint Recipe
		ItemStack GravelStack = new ItemStack(Blocks.gravel);

		for (int i = 0; i < event.craftMatrix.getSizeInventory(); i++) {
			if (event.craftMatrix.getStackInSlot(i) != null) {
				ItemStack j = event.craftMatrix.getStackInSlot(i);
				if (j != null && j == GravelStack) {
					ItemStack k = new ItemStack(UIItems.mortarAndPestle, 2,
							(j.getItemDamage() + 1));
					event.craftMatrix.setInventorySlotContents(i, k);
				}
			}
		}
	}
}
