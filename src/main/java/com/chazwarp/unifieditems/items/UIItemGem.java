/**
@author Chaz Kerby
*/
package com.chazwarp.unifieditems.items;

import com.chazwarp.unifieditems.lib.Reference;

public class UIItemGem extends UIItem {

	protected UIItemGem(String unlocalizedName, int hexColor) {
		super(unlocalizedName);
		setTextureName(Reference.RESOURCE_PREFIX + "gem");
	}
}
