/**
@author Chaz Kerby
*/
package com.chazwarp.unifieditems.client.texture;

import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.LookupOp;
import java.awt.image.LookupTable;
import java.awt.image.ShortLookupTable;

public class ColorizingHelper {

	public static BufferedImage colorizeImage(BufferedImage rawImage, short R1, short G1, short B1) {
		BufferedImageOp colorizingFilter = createColorizeOp(R1,G1,B1);
		BufferedImage tempImage = new BufferedImage(rawImage.getWidth(), rawImage.getHeight(), BufferedImage.TYPE_INT_ARGB);
		tempImage.createGraphics().drawImage(rawImage, 0, 0, null);
		
		return colorizingFilter.filter(tempImage, null);
	}
	
	protected static LookupOp createColorizeOp(short R1, short G1, short B1) {
	    short[] alpha = new short[256];
	    short[] red = new short[256];
	    short[] green = new short[256];
	    short[] blue = new short[256];

	    for (short i = 0; i < 256; i++) {
	        alpha[i] = i;
	        red[i] = (short) ((R1 + i*.3)/2);
	        green[i] = (short) ((G1 + i*.59)/2);
	        blue[i] = (short) ((B1 + i*.11)/2);
	    }

	    short[][] data = new short[][] {
	            red, green, blue, alpha
	    };

	    LookupTable lookupTable = new ShortLookupTable(0, data);
	    return new LookupOp(lookupTable, null);
	}
}
