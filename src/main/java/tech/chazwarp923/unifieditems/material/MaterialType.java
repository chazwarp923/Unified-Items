/**
@author Chazwarp923
*/
package tech.chazwarp923.unifieditems.material;

import java.util.ArrayList;

public enum MaterialType {
	GENERIC(true, true, true, true, false, true, true, true),
	ALLOY(false, true, true, true, false, true, true, true),
	GENERIC_GEM(true, true, false, false, true, false, false, true),
	DUST(false, true, false, false, false, false, false, false),
	INGOT(false, false, true, false, false, false, false, false),
	NUGGET(false, false, false, true, false, false, false, false),
	GEM(false, false, false, false, true, false, false, false),
	PLATE(false, false, false, false, false, true, false, false),
	GEAR(false, false, false, false, false, false, true, false),
	BLOCK(false, false, false, false, false, false, false, true);
	
	ArrayList<String> types;
	
	MaterialType(boolean ore, boolean dust, boolean ingot, boolean nugget, boolean gem, boolean plate, boolean gear, boolean block) {
		ArrayList<String> temp = new ArrayList<String>();
		if(ore) {
			temp.add("ore");
		}
		if(dust) {
			temp.add("dust");
		}
		if(ingot) {
			temp.add("ingot");
		}
		if(nugget) {
			temp.add("nugget");
		}
		if(gem) {
			temp.add("gem");
		}
		if(plate) {
			temp.add("plate");
		}
		if(gear) {
			temp.add("gear");
		}
		if(block) {
			temp.add("block");
		}
		types = temp;
	}
}