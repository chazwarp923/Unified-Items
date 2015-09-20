/**
@author Chaz Kerby
*/
package com.chazwarp.unifieditems.modular;

import com.chazwarp.unifieditems.material.MaterialHandler;
import com.chazwarp.unifieditems.material.MaterialRegistry;

public class UIModule {
	
	public static void usesMaterial(MaterialRegistry mat) {
		MaterialHandler.registerUse(mat);
	}
}
