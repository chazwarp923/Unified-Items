/**
@author Chaz Kerby
*/
package com.chazwarp.unifieditems.item;

public class UIItemGem extends UIItem {

	private int hexColor;
	
	protected UIItemGem(String unlocalizedName, int hexColor) {
		super(unlocalizedName);
		this.hexColor = hexColor;
	}
}
