/**
@author Chaz Kerby
*/
package tech.chazwarp923.unifieditems.item;

public class UIItemGem extends UIItem {

	private int hexColor;
	
	protected UIItemGem(String unlocalizedName, int hexColor) {
		super(unlocalizedName);
		this.hexColor = hexColor;
	}
}
