package com.chazwarp.unifieditems.items;

import net.minecraft.item.ItemBlock;

public class ItemLeadOre extends ItemBlock {
	
	public ItemLeadOre(int id) {
		super(id);
		setHasSubtypes(true);
	}
	
	@Override
	public int getMetadata(int dmg) {
		return dmg;
	}

}