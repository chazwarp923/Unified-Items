package com.chazwarp.unifieditems.items;

import net.minecraft.item.ItemBlock;

public class ItemSaplingRubber extends ItemBlock {
	
	public ItemSaplingRubber(int id) {
		super(id);
		setHasSubtypes(true);
	}
	
	@Override
	public int getMetadata(int dmg) {
		return dmg;
	}

}