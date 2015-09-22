/**
@author Chaz Kerby
 */
package com.chazwarp.unifieditems;

import com.chazwarp.unifieditems.items.UIItems;

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
		return Items.apple;
	}
}