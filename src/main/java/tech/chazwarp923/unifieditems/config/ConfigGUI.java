package tech.chazwarp923.unifieditems.config;

import java.util.ArrayList;
import java.util.List;

import tech.chazwarp923.unifieditems.UnifiedItems;
import tech.chazwarp923.unifieditems.lib.Reference;

import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.IConfigElement;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;

public class ConfigGUI extends GuiConfig {

	public ConfigGUI(GuiScreen parent) {
		super(parent, getConfigElements(), Reference.MOD_ID, false, false, GuiConfig.getAbridgedConfigPath(ConfigHandler.preInit(UnifiedItems.configFile).toString()));
	}

	public static List<IConfigElement> getConfigElements() {
		List<IConfigElement> list = new ArrayList<IConfigElement>();
		list.add(new ConfigElement(ConfigHandler.preInit(UnifiedItems.configFile).getCategory(ConfigHandler.PER_VEIN.toLowerCase())));
		list.add(new ConfigElement(ConfigHandler.preInit(UnifiedItems.configFile).getCategory(ConfigHandler.PER_CHUNK.toLowerCase())));

		return list;
	}
}