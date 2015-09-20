/**
@author Chaz Kerby
*/
package com.chazwarp.unifieditems.items;

import com.chazwarp.unifieditems.lib.Reference;

public class UIItemDust extends UIItem {
	
	public UIItemDust(String unlocalizedName, int hexColor) {
		super(unlocalizedName);
		setTextureName(Reference.RESOURCE_PREFIX + "dust");
	}
}
