/**
@author Chaz Kerby
*/
package com.chazwarp.unifieditems.items;

import com.chazwarp.unifieditems.lib.Reference;

public class UIItemIngot extends UIItem {
	
	protected UIItemIngot(String unlocalizedName, int hexColor) {
		super(unlocalizedName);
		setTextureName(Reference.RESOURCE_PREFIX + "ingot");
	}
}
