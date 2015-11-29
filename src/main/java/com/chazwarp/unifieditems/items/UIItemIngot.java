/**
@author Chaz Kerby
*/
package com.chazwarp.unifieditems.items;

public class UIItemIngot extends UIItem {
	
	private int hexColor;
	
	protected UIItemIngot(String unlocalizedName, int hexColor) {
		super(unlocalizedName);
		this.hexColor = hexColor;
	}
}
