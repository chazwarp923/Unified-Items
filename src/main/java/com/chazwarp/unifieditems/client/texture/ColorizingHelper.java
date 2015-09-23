/**
@author Chaz Kerby
*/
package com.chazwarp.unifieditems.client.texture;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class ColorizingHelper {

	public static BufferedImage colorizeImage(BufferedImage rawImage, Color hexColor) {
		BufferedImage tempImage = new BufferedImage(rawImage.getWidth(), rawImage.getHeight(), BufferedImage.TYPE_INT_ARGB);
		Graphics2D g = tempImage.createGraphics();
		g.drawImage(rawImage, 0, 0, null);
		g.setComposite(AlphaComposite.SrcAtop);
		g.setColor(hexColor);
		g.fillRect(0, 0, rawImage.getWidth(), rawImage.getHeight());
		g.dispose();
		
		return tempImage;
	}
}
