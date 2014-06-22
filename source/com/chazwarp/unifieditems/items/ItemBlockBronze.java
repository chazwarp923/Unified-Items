package com.chazwarp.unifieditems.items;

import net.minecraft.item.ItemBlock;

public class ItemBlockBronze extends ItemBlock {
	
	public ItemBlockBronze(int id) {
		super(id);
		setHasSubtypes(true);
	}
	
	@Override
	public int getMetadata(int dmg) {
		return dmg;
	}
}