/**
@author Chaz Kerby
 */
package tech.chazwarp923.unifieditems;

import tech.chazwarp923.unifieditems.item.UIItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class UniTab extends CreativeTabs {
	public static UniTab tab = new UniTab();

	public UniTab() {
		super("uniTab");
	}

	@Override
	public ItemStack getIconItemStack() {
		return UIItems.getStackForCreativeTab();
	}

	@Override
	public Item getTabIconItem() {
		return Items.APPLE;
	}
}