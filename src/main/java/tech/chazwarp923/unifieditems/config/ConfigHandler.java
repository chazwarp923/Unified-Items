package tech.chazwarp923.unifieditems.config;

import java.io.File;
import java.util.HashMap;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import tech.chazwarp923.unifieditems.Reference;
import tech.chazwarp923.unifieditems.material.MaterialHandler;
import tech.chazwarp923.unifieditems.material.MaterialRegistry;
import tech.chazwarp923.unifieditems.material.MaterialType;

public class ConfigHandler {

	protected static Configuration config;
	
	public static String CATEGORY_MIN_Y = "minY";
	public static String CATEGORY_MAX_Y = "maxY";
	public static String CATEGORY_VEIN_SIZE_OVERRIDE = "veinSizeOverride";
	public static String CATEGORY_CHUNK_DENSITY = "chunkDensity";
	
	public static HashMap<MaterialRegistry, Integer> minY = new HashMap<MaterialRegistry, Integer>();
	public static HashMap<MaterialRegistry, Integer> maxY = new HashMap<MaterialRegistry, Integer>();
	public static HashMap<MaterialRegistry, Integer> veinSizeOverride = new HashMap<MaterialRegistry, Integer>();
	public static HashMap<MaterialRegistry, Integer> chunkDensity = new HashMap<MaterialRegistry, Integer>();

	public static Configuration preInit(File file) {
		config = new Configuration(file);

		syncConfig(true, false);

		return config;
	}
	
	/**
	 * Synchronize the three copies of the config, if both booleans are false it will load defaults
	 * @param loadConfigFromFile whether or not we load the config from file
	 * @param loadConfigFromGUI whether or not we load the config from the config GUI
	 */
	private static void syncConfig(boolean loadConfigFromFile, boolean loadConfigFromGUI) {
		if(loadConfigFromFile == true)
			config.load();
		
		config.defaultEncoding = "UTF-8";
		
		readConfigValues();
		
		config.addCustomCategoryComment(CATEGORY_MIN_Y, "Minimum Y Level");
		config.addCustomCategoryComment(CATEGORY_MAX_Y, "Maximum Y Level");
		config.addCustomCategoryComment(CATEGORY_VEIN_SIZE_OVERRIDE, "For overriding the precalculated amount of ores per vein, -1 to disable and use precalculated values");
		config.addCustomCategoryComment(CATEGORY_CHUNK_DENSITY, "How many veins are generated per chunk");
		
		config.setCategoryRequiresWorldRestart(CATEGORY_MIN_Y, true);
		config.setCategoryRequiresWorldRestart(CATEGORY_MAX_Y, true);
		config.setCategoryRequiresWorldRestart(CATEGORY_VEIN_SIZE_OVERRIDE, true);
		config.setCategoryRequiresWorldRestart(CATEGORY_CHUNK_DENSITY, true);
		
		if(config.hasChanged())
			config.save();
	}
	
	private static void readConfigValues() {
		for(MaterialRegistry material : MaterialHandler.getMaterials().keySet()) {
			if(material.type.equals(MaterialType.GENERIC) || material.type.equals(MaterialType.GENERIC_GEM)) {
				minY.put(material, config.getInt(material.name, CATEGORY_MIN_Y, material.minY, 0, 255, ""));
				maxY.put(material, config.getInt(material.name, CATEGORY_MAX_Y, material.maxY, 0, 255, ""));
				veinSizeOverride.put(material, config.getInt(material.name, CATEGORY_VEIN_SIZE_OVERRIDE, -1, 0, 64, ""));
				chunkDensity.put(material, config.getInt(material.name, CATEGORY_CHUNK_DENSITY, material.chunkDensity, 0, 64, ""));
			}
		}
	}

	@SubscribeEvent
	public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent configChangedEvent) {
		if (configChangedEvent.getModID().equals(Reference.MOD_ID))
			ConfigHandler.syncConfig(false, true);
	}
}