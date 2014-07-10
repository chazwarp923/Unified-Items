/**
@author Chaz Kerby
*/

package com.chazwarp.unifieditems.items;

import net.minecraft.item.Item;

import com.chazwarp.unifieditems.UniTab;
import com.chazwarp.unifieditems.lib.Reference;

public class ItemUI extends Item {
	
	protected ItemUI(String unlocalizedName) {
		super();		
		setCreativeTab(UniTab.tab);
		setTextureName(Reference.RESOURCE_PREFIX + unlocalizedName);
		setUnlocalizedName(unlocalizedName);
	}
}