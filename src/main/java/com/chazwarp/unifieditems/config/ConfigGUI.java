package com.chazwarp.unifieditems.config;

import java.util.ArrayList;
import java.util.List;

import com.chazwarp.unifieditems.UnifiedItems;
import com.chazwarp.unifieditems.lib.Reference;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigCategory;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.client.config.DummyConfigElement;
import cpw.mods.fml.client.config.GuiConfig;
import cpw.mods.fml.client.config.GuiConfigEntries.CategoryEntry;
import cpw.mods.fml.client.config.IConfigElement;

public class ConfigGUI extends GuiConfig{

	public ConfigGUI(GuiScreen parent) {
		super(parent, getConfigElements(), Reference.MOD_ID, false, false, GuiConfig.getAbridgedConfigPath(ConfigHandler.init(UnifiedItems.configFile).toString()));
	}
	public static List<IConfigElement> getConfigElements() {
		List<IConfigElement> list = new ArrayList<IConfigElement>();
		list.add(new ConfigElement(ConfigHandler.init(UnifiedItems.configFile).getCategory(ConfigHandler.PER_VEIN.toLowerCase())));
		list.add(new ConfigElement(ConfigHandler.init(UnifiedItems.configFile).getCategory(ConfigHandler.PER_CHUNK.toLowerCase())));
		
		return list;
	}
}