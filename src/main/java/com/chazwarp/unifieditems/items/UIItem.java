/**
@author Chaz Kerby
 */

package com.chazwarp.unifieditems.items;

import com.chazwarp.unifieditems.UniTab;
import com.chazwarp.unifieditems.lib.Reference;

import net.minecraft.item.Item;

public class UIItem extends Item {

	protected UIItem(String unlocalizedName) {
		super();
		setCreativeTab(UniTab.tab);
		setUnlocalizedName(unlocalizedName);
		setTextureName(Reference.RESOURCE_PREFIX + unlocalizedName);
	}
}