/**
@author Chaz Kerby
 */

package com.chazwarp.unifieditems.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

public class UIItemBlock extends ItemBlock {

	public UIItemBlock(Block block) {
		super(block);
		setHasSubtypes(true);
	}
}