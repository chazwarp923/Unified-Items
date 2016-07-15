/**
@author Chaz Kerby
 */

package tech.chazwarp923.unifieditems.event;

import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;
import tech.chazwarp923.unifieditems.item.ItemMortarAndPestle;
import tech.chazwarp923.unifieditems.item.UIItems;

public class ItemCraftedEventHandler {

	@SubscribeEvent
	public void itemCrafted(ItemCraftedEvent event) {
		
		IInventory craftingGrid = event.craftMatrix;
		
		//Helps the torch recipe
		for (int i = 0; i < craftingGrid.getSizeInventory(); i++) {
			if (craftingGrid.getStackInSlot(i) != null) {
				if(craftingGrid.getStackInSlot(i).getItem() == Items.FLINT_AND_STEEL) {
					ItemStack oldStack = craftingGrid.getStackInSlot(i);
					ItemStack newStack = new ItemStack(Items.FLINT_AND_STEEL, 2, oldStack.getItemDamage() + 1);
					if(newStack.getItemDamage() == newStack.getMaxDamage()) {
						newStack = null;
						//Everything inside this for loop fixes a duplication bug introduced somehwere between mc1.8 and 1.10, very important do not remove if copying
						for(int j = 0; j < craftingGrid.getSizeInventory(); j++) {
							if(craftingGrid.getStackInSlot(j) != null) {
								if(!(craftingGrid.getStackInSlot(j).getItem() instanceof ItemMortarAndPestle)) {
									ItemStack oldSticks = craftingGrid.getStackInSlot(j);
									ItemStack newSticks = new ItemStack(oldSticks.getItem(), ((int)oldSticks.stackSize / 2));
									if(newSticks.stackSize == 0) {
										newSticks = null;
									}
									craftingGrid.setInventorySlotContents(j, newSticks);
								}
							}
						}
					}
					craftingGrid.setInventorySlotContents(i, newStack);
				}
			}
		}

		//Helps the ore and flint recipes
		for (int i = 0; i < craftingGrid.getSizeInventory(); i++) {
			if(craftingGrid.getStackInSlot(i) != null) {
				if(craftingGrid.getStackInSlot(i).getItem() instanceof ItemMortarAndPestle) {
					ItemStack oldStack = craftingGrid.getStackInSlot(i);
					ItemStack newStack = new ItemStack(UIItems.mortarAndPestle, 2, oldStack.getItemDamage() + 1);
					if(newStack.getItemDamage() == newStack.getMaxDamage()) {
						newStack = null;
						//Everything inside this for loop fixes a duplication bug introduced somehwere between mc1.8 and 1.10, very important do not remove if copying
						for(int j = 0; j < craftingGrid.getSizeInventory(); j++) {
							if(craftingGrid.getStackInSlot(j) != null) {
								if(!(craftingGrid.getStackInSlot(j).getItem() instanceof ItemMortarAndPestle)) {
									ItemStack oldOre = craftingGrid.getStackInSlot(j);
									ItemStack newOre = new ItemStack(oldOre.getItem(), ((int)oldOre.stackSize / 2) + 1);
									if(newOre.stackSize == 1) {
										newOre = null;
									}
									craftingGrid.setInventorySlotContents(j, newOre);
								}
							}
						}
					}
					craftingGrid.setInventorySlotContents(i, newStack);
				}
			}
		}
	}
}
