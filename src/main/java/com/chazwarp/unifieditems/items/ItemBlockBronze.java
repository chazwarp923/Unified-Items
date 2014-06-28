package com.chazwarp.unifieditems.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

public class ItemBlockBronze extends ItemBlock {
	
	public ItemBlockBronze(Block block) {
		super(block);
		setHasSubtypes(true);
	}
	
	@Override
	public int getMetadata(int dmg) {
		return dmg;
	}
}