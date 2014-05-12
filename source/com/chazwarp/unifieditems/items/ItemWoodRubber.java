package com.chazwarp.unifieditems.items;

import net.minecraft.item.ItemBlock;

public class ItemWoodRubber extends ItemBlock {
	
	public ItemWoodRubber(int id) {
		super(id);
		setHasSubtypes(true);
	}
	
	@Override
	public int getMetadata(int dmg) {
		return dmg;
	}

}