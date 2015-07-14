package com.chazwarp.unifieditems.config;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;

import com.chazwarp.unifieditems.UnifiedItems;
import com.chazwarp.unifieditems.lib.Reference;

import cpw.mods.fml.client.config.GuiConfig;
import cpw.mods.fml.client.config.IConfigElement;

public class ConfigGUI extends GuiConfig {

	public ConfigGUI(GuiScreen parent) {
		super(parent, getConfigElements(), Reference.MOD_ID, false, false,
				GuiConfig.getAbridgedConfigPath(ConfigHandler.init(
						UnifiedItems.configFile).toString()));
	}

	@SuppressWarnings("rawtypes")
	public static List<IConfigElement> getConfigElements() {
		List<IConfigElement> list = new ArrayList<IConfigElement>();
		list.add(new ConfigElement(ConfigHandler.init(UnifiedItems.configFile)
				.getCategory(ConfigHandler.PER_VEIN.toLowerCase())));
		list.add(new ConfigElement(ConfigHandler.init(UnifiedItems.configFile)
				.getCategory(ConfigHandler.PER_CHUNK.toLowerCase())));

		return list;
	}
}