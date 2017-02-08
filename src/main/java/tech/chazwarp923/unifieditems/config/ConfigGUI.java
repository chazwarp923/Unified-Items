/**
@author Chazwarp923
 */
package tech.chazwarp923.unifieditems.config;

import java.util.ArrayList;
import java.util.List;

import tech.chazwarp923.unifieditems.Reference;
import tech.chazwarp923.unifieditems.UnifiedItems;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.IConfigElement;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;

public class ConfigGUI extends GuiConfig {

	public ConfigGUI(GuiScreen parent) {
		super(parent, getConfigElements(), Reference.MOD_ID, false, false, GuiConfig.getAbridgedConfigPath(UnifiedItems.configFile.toString()));
	}

	public static List<IConfigElement> getConfigElements() {
		List<IConfigElement> list = new ArrayList<IConfigElement>();
		list.add(new ConfigElement(UnifiedItems.config.getCategory(ConfigHandler.CATEGORY_MIN_Y).setLanguageKey("config.miny")));
		list.add(new ConfigElement(UnifiedItems.config.getCategory(ConfigHandler.CATEGORY_MAX_Y).setLanguageKey("config.maxy")));
		list.add(new ConfigElement(UnifiedItems.config.getCategory(ConfigHandler.CATEGORY_VEIN_SIZE_OVERRIDE).setLanguageKey("config.veinsizeoverride")));
		list.add(new ConfigElement(UnifiedItems.config.getCategory(ConfigHandler.CATEGORY_CHUNK_DENSITY).setLanguageKey("config.chunkdensity")));
		list.add(new ConfigElement(UnifiedItems.config.getCategory(ConfigHandler.CATEGORY_MANUAL_OVERRIDE).setLanguageKey("config.manualoverride")));
		
		return list;
	}
}