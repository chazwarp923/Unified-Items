package com.chazwarp.unifieditems.items;

import net.minecraft.item.ItemBlock;

public class ItemLeavesRubber extends ItemBlock {
	
	public ItemLeavesRubber(int id) {
		super(id);
		setHasSubtypes(true);
	}
	
	@Override
	public int getMetadata(int dmg) {
		return dmg;
	}

}