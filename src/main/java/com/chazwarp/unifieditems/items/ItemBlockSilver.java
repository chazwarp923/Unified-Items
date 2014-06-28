package com.chazwarp.unifieditems.items;

import net.minecraft.item.ItemBlock;

public class ItemBlockSilver extends ItemBlock {
	
	public ItemBlockSilver(int id) {
		super(id);
		setHasSubtypes(true);
	}
	
	@Override
	public int getMetadata(int dmg) {
		return dmg;
	}
}