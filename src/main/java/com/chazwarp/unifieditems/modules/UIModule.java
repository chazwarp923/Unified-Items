/**
@author Chaz Kerby
*/
package com.chazwarp.unifieditems.modules;

import com.chazwarp.unifieditems.material.MaterialHandler;
import com.chazwarp.unifieditems.material.MaterialRegistry;

public class UIModule {

	public void instantiateModule() {}
	
	public static void usesMaterial(MaterialRegistry mat) {
		MaterialHandler.registerUse(mat);
	}
}
