package com.chazwarp.unifieditems.items;

import net.minecraft.item.ItemBlock;

public class ItemBlockTin extends ItemBlock {
	
	public ItemBlockTin(int id) {
		super(id);
		setHasSubtypes(true);
	}
	
	@Override
	public int getMetadata(int dmg) {
		return dmg;
	}
}