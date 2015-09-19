/**
@author Chaz Kerby
*/
package com.chazwarp.unifieditems.material;

import java.util.HashMap;
import java.util.Map;

public class MaterialHandler {
	
	protected static Map<MaterialRegistry, Integer> materialUseCount = new HashMap<MaterialRegistry, Integer>();
	
	public static void registerUse(MaterialRegistry mat) {
		if(materialUseCount.containsKey(mat)) {
			materialUseCount.put(mat, materialUseCount.get(mat) + 1);
		}
		else {
			materialUseCount.put(mat, 1);
		}
	}
}
