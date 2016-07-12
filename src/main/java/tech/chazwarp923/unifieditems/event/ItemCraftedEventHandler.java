/**
@author Chaz Kerby
 */

package tech.chazwarp923.unifieditems.event;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;

import tech.chazwarp923.unifieditems.item.UIItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ItemCraftedEventHandler {

	@SubscribeEvent
	public void itemCrafted(ItemCraftedEvent event) {

		//Helps The Torch Recipe
		for (int i = 0; i < event.craftMatrix.getSizeInventory(); i++) {
			if (event.craftMatrix.getStackInSlot(i) != null) {
				ItemStack j = event.craftMatrix.getStackInSlot(i);
				if (j.getItem() != null && j.getItem() == Items.FLINT_AND_STEEL) {
					ItemStack k = new ItemStack(Items.FLINT_AND_STEEL, 2,
							(j.getItemDamage() + 1));
					if (k.getItemDamage() == k.getMaxDamage()) {
						k = null;
					}
					event.craftMatrix.setInventorySlotContents(i, k);
				}
			}
		}

		//Helps The Ore Recipes
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
		ItemStack GravelStack = new ItemStack(Blocks.GRAVEL);

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
