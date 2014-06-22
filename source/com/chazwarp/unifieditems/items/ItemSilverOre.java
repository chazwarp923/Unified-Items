package com.chazwarp.unifieditems.items;

import net.minecraft.item.ItemBlock;

public class ItemSilverOre extends ItemBlock {
	
	public ItemSilverOre(int id) {
		super(id);
		setHasSubtypes(true);
	}
	
	@Override
	public int getMetadata(int dmg) {
		return dmg;
	}
}