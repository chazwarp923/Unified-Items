package tech.chazwarp923.unifieditems.crafting.IRecipe;

import net.minecraft.init.Blocks;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.World;
import tech.chazwarp923.unifieditems.block.UIBlocks;
import tech.chazwarp923.unifieditems.item.ItemMortarAndPestle;
import tech.chazwarp923.unifieditems.item.UIItems;
import tech.chazwarp923.unifieditems.material.MaterialRegistry;

public class OreToDustRecipe implements IRecipe {

	protected ItemStack input;
	protected ItemStack output;
	
	public OreToDustRecipe(MaterialRegistry material, String ore) {
		if(ore == null) {
			input = new ItemStack(UIBlocks.ores.get(material), 1);
		}
		else if(ore.equals("Iron")) {
			input = new ItemStack(Blocks.IRON_ORE, 1);
			material = MaterialRegistry.IRON;
		}
		else if(ore.equals("Gold")) {
			input = new ItemStack(Blocks.GOLD_ORE, 1);
			material = MaterialRegistry.GOLD;
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
		return 2;
	}

	@Override
	public ItemStack getRecipeOutput() {
		return output;
	}

	@Override
	public ItemStack[] getRemainingItems(InventoryCrafting inv) {
		ItemStack[] grid = new ItemStack[inv.getSizeInventory()];

        for (int i = 0; i < grid.length; i++) {
            ItemStack itemstack = inv.getStackInSlot(i);
            
            if (itemstack != null && itemstack.getItem() instanceof ItemMortarAndPestle) {
            	itemstack = new ItemStack(UIItems.mortarAndPestle, 1, itemstack.getItemDamage() + 1);
                if(itemstack.getItemDamage() == itemstack.getMaxDamage())
                	itemstack = null;
                grid[i] = itemstack;
            }
        }
        return grid;
	}
}
