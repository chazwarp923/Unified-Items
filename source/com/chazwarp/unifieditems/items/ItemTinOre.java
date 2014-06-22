package com.chazwarp.unifieditems.items;

import net.minecraft.item.ItemBlock;

public class ItemTinOre extends ItemBlock {
	
	public ItemTinOre(int id) {
		super(id);
		setHasSubtypes(true);
	}
	
	@Override
	public int getMetadata(int dmg) {
		return dmg;
	}
}