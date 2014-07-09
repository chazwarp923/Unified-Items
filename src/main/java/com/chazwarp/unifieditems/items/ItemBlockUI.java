/**
@author Chaz Kerby
*/

package com.chazwarp.unifieditems.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

public class ItemBlockUI extends ItemBlock{

	public ItemBlockUI(Block block) {
		super(block);
		setHasSubtypes(true);
	}
	
	@Override
	public int getMetadata(int dmg) {
		return dmg;
	}
}