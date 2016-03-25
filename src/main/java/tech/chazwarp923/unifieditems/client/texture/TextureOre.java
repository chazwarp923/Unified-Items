/**
@author Chaz Kerby
*/
package tech.chazwarp923.unifieditems.client.texture;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;

import tech.chazwarp923.unifieditems.lib.Reference;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.resources.IResource;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.resources.data.AnimationMetadataSection;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class TextureOre extends TextureAtlasSprite {

	private String backgroundTex;
	private int hexColor;
	
	public TextureOre(String unlocalizedName, String background, int hexColor) {
		super(Reference.RESOURCE_PREFIX + unlocalizedName);
		this.backgroundTex = background;
		this.hexColor = hexColor;
	}
	
	@Override
	public boolean hasCustomLoader(IResourceManager manager, ResourceLocation location) {
        return true;
    }
	
	@Override
	public boolean load(IResourceManager manager, ResourceLocation location) {
		int mp = Minecraft.getMinecraft().gameSettings.mipmapLevels;
		
		BufferedImage[] oreImage = new BufferedImage[1 + mp];
		BufferedImage stoneImage;
		int width;
		
		AnimationMetadataSection animation;
		
		try {
			IResource overlay = manager.getResource(new ResourceLocation(Reference.TEXTURE_LOC, "textures/blocks/oreOverlay.png"));
			IResource background = manager.getResource(new ResourceLocation("minecraft", "textures/blocks/" + backgroundTex + ".png"));
			
			oreImage[0] = ImageIO.read(overlay.getInputStream());
			animation = (AnimationMetadataSection) overlay.getMetadata("animation");
			stoneImage = ImageIO.read(background.getInputStream());
			
			width = oreImage[0].getWidth();
			
			if(stoneImage.getWidth() != width) {
				List<?> resourcePacks = manager.getAllResources(new ResourceLocation("minecraft", backgroundTex));
				for (int i = resourcePacks.size() - 1; i >= 0; --i) {
                    IResource resource = (IResource) resourcePacks.get(i);
                    stoneImage = ImageIO.read(resource.getInputStream());

                    if (stoneImage.getWidth() == width)
                        break;
                }
			}
		} 
		catch (IOException e) {
			e.printStackTrace();
			return true;
		}
		
		if(stoneImage.getWidth() != width) {
			return true;
		}
		
		int height = oreImage[0].getHeight();
		
		
		Color cwoa = new Color(hexColor);
		Color colorWithAlpha = new Color(cwoa.getRed(), cwoa.getGreen(), cwoa.getBlue(), 128);
		oreImage[0] = ColorizingHelper.colorizeImage(oreImage[0], colorWithAlpha);
		
		BufferedImage finishedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		
		Graphics g = finishedImage.getGraphics();
		g.drawImage(stoneImage, 0, 0, null);
		g.drawImage(oreImage[0], 0, 0, null);
		
		oreImage[0] = finishedImage;
		
		try {
			ImageIO.write(oreImage[0], "PNG", new File("C:\\Users\\Chazk\\Downloads\\test\\" + Integer.toHexString(hexColor) + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		//TODO Fix
		/**try {
			this.loadSprite(oreImage, animation);
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		
		return false;	
	}
}
