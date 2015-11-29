/**
@author Chaz Kerby
*/
package com.chazwarp.unifieditems.items;

public class UIItemGem extends UIItem {

	private int hexColor;
	
	protected UIItemGem(String unlocalizedName, int hexColor) {
		super(unlocalizedName);
		this.hexColor = hexColor;
	}
}
