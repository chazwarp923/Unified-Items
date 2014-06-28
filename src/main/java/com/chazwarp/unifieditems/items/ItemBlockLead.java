package com.chazwarp.unifieditems.items;

import net.minecraft.item.ItemBlock;

public class ItemBlockLead extends ItemBlock {
	
	public ItemBlockLead(int id) {
		super(id);
		setHasSubtypes(true);
	}
	
	@Override
	public int getMetadata(int dmg) {
		return dmg;
	}
}