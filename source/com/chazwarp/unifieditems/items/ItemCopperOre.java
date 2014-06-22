package com.chazwarp.unifieditems.items;

import net.minecraft.item.ItemBlock;

public class ItemCopperOre extends ItemBlock {
	
	public ItemCopperOre(int id) {
		super(id);
		setHasSubtypes(true);
	}
	
	@Override
	public int getMetadata(int dmg) {
		return dmg;
	}
}