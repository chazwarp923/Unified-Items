package tech.chazwarp923.unifieditems.crafting.IRecipe;

import net.minecraft.init.Blocks;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.World;
import tech.chazwarp923.unifieditems.block.UIBlocks;
import tech.chazwarp923.unifieditems.item.UIItems;

public class OreToDustRecipe implements IRecipe {

	protected ItemStack input;
	protected ItemStack output;
	
	public OreToDustRecipe(String material) {
		if(!(material.equals("Iron")) && !(material.equals("Gold"))) {
			input = new ItemStack(UIBlocks.ores.get(material));
		}
		else if(material.equals("Iron")) {
			input = new ItemStack(Blocks.IRON_ORE);
		}
		else if(material.equals("Gold")) {
			input = new ItemStack(Blocks.GOLD_ORE);
		}
		output = new ItemStack(UIItems.dusts.get(material), 2);
	}

	@Override
	public boolean matches(InventoryCrafting inv, World worldIn) {
		int invSize = inv.getSizeInventory();
		for(int i = 0; i < invSize; i++) {
			if(inv.getStackInSlot(i) != null) {
				if(inv.getStackInSlot(i).getItem().equals(UIItems.mortarAndPestle)) {
					for(int j = 0; j < invSize; j++) {
						if(inv.getStackInSlot(j) != null) {
							if(inv.getStackInSlot(j).getItem().equals(input.getItem())) {
								return true;
							}
						}
					}
				}
			}
		}
		return false;
	}

	@Override
	public ItemStack getCraftingResult(InventoryCrafting inv) {
		return output.copy();
	}

	@Override
	public int getRecipeSize() {
		return 9;
	}

	@Override
	public ItemStack getRecipeOutput() {
		return output.copy();
	}

	@Override
	public ItemStack[] getRemainingItems(InventoryCrafting inv) {
		ItemStack[] aitemstack = new ItemStack[inv.getSizeInventory()];

        for (int i = 0; i < aitemstack.length; i++) {
            ItemStack itemstack = inv.getStackInSlot(i);

            if(itemstack != null && !(itemstack.getItem().equals(UIItems.mortarAndPestle))) {
            	aitemstack[i] = itemstack;
            	aitemstack[i].stackSize = aitemstack[i].stackSize - 1;
            	if(aitemstack[i].stackSize == 0) {
            		aitemstack[i] = null;
            	}
            }
            else if (itemstack != null && itemstack.getItem().equals(UIItems.mortarAndPestle)) {
                aitemstack[i] = new ItemStack(UIItems.mortarAndPestle, 1, itemstack.getItemDamage() + 1);
                if(aitemstack[i].getItemDamage() == aitemstack[i].getMaxDamage())
                	aitemstack[i] = null;
            }
        }
        return aitemstack;
	}
}
