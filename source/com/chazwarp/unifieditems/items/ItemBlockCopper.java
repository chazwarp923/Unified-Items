package com.chazwarp.unifieditems.items;

import net.minecraft.item.ItemBlock;

public class ItemBlockCopper extends ItemBlock {
	
	public ItemBlockCopper(int id) {
		super(id);
		setHasSubtypes(true);
	}
	
	@Override
	public int getMetadata(int dmg) {
		return dmg;
	}
}