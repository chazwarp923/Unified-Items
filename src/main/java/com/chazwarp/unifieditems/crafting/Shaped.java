package com.chazwarp.unifieditems.crafting;

import com.chazwarp.unifieditems.items.UIItems;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;

public class Shaped {

	public static void addCrafting() {

	}

	@SubscribeEvent
	public void itemCrafted(ItemCraftedEvent eventArgs) {
		@SuppressWarnings("unused")
		EntityPlayer player = eventArgs.player;
		@SuppressWarnings("unused")
		ItemStack stack = eventArgs.crafting;
		IInventory inv = eventArgs.craftMatrix;

		// Helps The Torch Recipe
		for (int i = 0; i < inv.getSizeInventory(); i++) {
			if (inv.getStackInSlot(i) != null) {
				ItemStack j = inv.getStackInSlot(i);
				if (j.getItem() != null && j.getItem() == Items.flint_and_steel) {
					ItemStack k = new ItemStack(Items.flint_and_steel, 2,
							(j.getItemDamage() + 1));
					if (k.getItemDamage() == k.getMaxDamage()) {
						k = null;
					}
					inv.setInventorySlotContents(i, k);
				}
			}
		}

		// Helps The Ore Recipes
		for (int i = 0; i < inv.getSizeInventory(); i++) {
			if (inv.getStackInSlot(i) != null) {
				ItemStack j = inv.getStackInSlot(i);
				if (j.getItem() == UIItems.mortarAndPestle) {
					ItemStack k = new ItemStack(UIItems.mortarAndPestle, 2,
							(j.getItemDamage() + 1));
					if (k.getItemDamage() == k.getMaxDamage()) {
						k = null;
					}
					inv.setInventorySlotContents(i, k);
				}
			}
		}

		// Helps The Flint Recipe
		ItemStack GravelStack = new ItemStack(Blocks.gravel);

		for (int i = 0; i < inv.getSizeInventory(); i++) {
			if (inv.getStackInSlot(i) != null) {
				ItemStack j = inv.getStackInSlot(i);
				if (j != null && j == GravelStack) {
					ItemStack k = new ItemStack(UIItems.mortarAndPestle, 2,
							(j.getItemDamage() + 1));
					inv.setInventorySlotContents(i, k);
				}
			}
		}
	}
}
