/**
@author Chazwarp923
 */
package tech.chazwarp923.unifieditems.config;

import java.util.Set;

import net.minecraftforge.fml.client.IModGuiFactory;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;

public class ConfigGuiFactory implements IModGuiFactory {

	@Override
	public void initialize(Minecraft minecraftInstance) {

	}
	
	@Override
	public boolean hasConfigGui() {
		return true;
	}
	
	@Override
	public GuiScreen createConfigGui(GuiScreen parentScreen) {
		return new ConfigGUI(parentScreen);
	}

	@Override
	public Set<RuntimeOptionCategoryElement> runtimeGuiCategories() {
		return null;
	}
}