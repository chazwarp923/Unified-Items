/**
@author Chazwarp923
*/
package tech.chazwarp923.unifieditems.material;

import java.util.ArrayList;

public enum MaterialType {
	GENERIC(true, true, true, true, false, true),
	ALLOY(false, true, true, true, false, true),
	GENERIC_GEM(true, true, false, false, true, true),
	DUST(false, true, false, false, false, false),
	INGOT(false, false, true, false, false, false),
	NUGGET(false, false, false, true, false, false),
	GEM(false, false, false, false, true, false),
	BLOCK(false, false, false, false, false, true);
	
	ArrayList<String> types;
	
	MaterialType(boolean ore, boolean dust, boolean ingot, boolean nugget, boolean gem, boolean block) {
		ArrayList<String> temp = new ArrayList<String>();
		if(ore == true) {
			temp.add("ore");
		}
		if(dust == true) {
			temp.add("dust");
		}
		if(ingot == true) {
			temp.add("ingot");
		}
		if(nugget == true) {
			temp.add("nugget");
		}
		if(gem == true) {
			temp.add("gem");
		}
		if(block == true) {
			temp.add("block");
		}
		types = temp;
	}
}