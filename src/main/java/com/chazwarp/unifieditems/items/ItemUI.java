/**
@author Chaz Kerby
*/

package com.chazwarp.unifieditems.items;

import net.minecraft.item.Item;

import com.chazwarp.unifieditems.UniTab;

public class ItemUI extends Item {
	
	protected ItemUI(String unlocalizedName) {
		super();		
		setCreativeTab(UniTab.tab);
		setTextureName(unlocalizedName);
		setUnlocalizedName(unlocalizedName);
	}
}