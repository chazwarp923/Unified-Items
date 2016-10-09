package tech.chazwarp923.unifieditems.config;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import tech.chazwarp923.unifieditems.block.UIBlockOre;
import tech.chazwarp923.unifieditems.block.UIBlocks;
import tech.chazwarp923.unifieditems.material.MaterialRegistry;

public class ConfigHandler {

	private static Configuration cfg;
	
	public static String CATEGORY_MIN_Y = "miny";
	public static String CATEGORY_MAX_Y = "maxy";
	public static String CATEGORY_VEIN_SIZE_OVERRIDE = "veinsizeoverride";
	public static String CATEGORY_CHUNK_DENSITY = "chunkdensity";
	
	public static HashMap<MaterialRegistry, Integer> minY = new HashMap<MaterialRegistry, Integer>();
	public static HashMap<MaterialRegistry, Integer> maxY = new HashMap<MaterialRegistry, Integer>();
	public static HashMap<MaterialRegistry, Integer> veinSizeOverride = new HashMap<MaterialRegistry, Integer>();
	public static HashMap<MaterialRegistry, Integer> chunkDensity = new HashMap<MaterialRegistry, Integer>();
	
	public static HashMap<MaterialRegistry, Property> minYProperties = new HashMap<MaterialRegistry, Property>();
	public static HashMap<MaterialRegistry, Property> maxYProperties = new HashMap<MaterialRegistry, Property>();
	public static HashMap<MaterialRegistry, Property> veinSizeOverrideProperties = new HashMap<MaterialRegistry, Property>();
	public static HashMap<MaterialRegistry, Property> chunkDensityProperties = new HashMap<MaterialRegistry, Property>();

	public static Configuration preInit(File file) {
		cfg = new Configuration(file);
		loadValuesFromDisk();
		return cfg;
	}
	
	public static void loadValuesFromDisk() {
		syncConfig(true, true);
	}

	public static void saveGUIValuesToDisk() {
		syncConfig(false, true);
	}

	public static void saveConfigToDisk() {
		syncConfig(false, false);
}
	
	private static void syncConfig(boolean loadConfigFromFile, boolean readFieldsFromConfig) {
		if(loadConfigFromFile) {
			cfg.load();
		}
		
		loadConfigProperties();
		
		cfg.addCustomCategoryComment(CATEGORY_MIN_Y, "Minimum Y Level");
		cfg.addCustomCategoryComment(CATEGORY_MAX_Y, "Maximum Y Level");
		cfg.addCustomCategoryComment(CATEGORY_VEIN_SIZE_OVERRIDE, "For overriding the precalculated amount of ores per vein, -1 to disable and use precalculated values");
		cfg.addCustomCategoryComment(CATEGORY_CHUNK_DENSITY, "How many veins are generated per chunk");
		
		cfg.setCategoryRequiresWorldRestart(CATEGORY_MIN_Y, true);
		cfg.setCategoryRequiresWorldRestart(CATEGORY_MAX_Y, true);
		cfg.setCategoryRequiresWorldRestart(CATEGORY_VEIN_SIZE_OVERRIDE, true);
		cfg.setCategoryRequiresWorldRestart(CATEGORY_CHUNK_DENSITY, true);
		
		if (readFieldsFromConfig) {
			readConfigValues();
		}
		
		writeConfigValues();
	}
	
	private static void loadConfigProperties() {
		for(Map.Entry<MaterialRegistry, UIBlockOre> ore : UIBlocks.ores.entrySet()) {
			MaterialRegistry material = ore.getKey();
			minYProperties.put(material, cfg.get(CATEGORY_MIN_Y, material.name, material.minY, "", 0, 255));
			maxYProperties.put(material, cfg.get(CATEGORY_MAX_Y, material.name, material.maxY, "", 0, 255));
			veinSizeOverrideProperties.put(material, cfg.get(CATEGORY_VEIN_SIZE_OVERRIDE, material.name, -1, "", -1, 64));
			chunkDensityProperties.put(material, cfg.get(CATEGORY_CHUNK_DENSITY, material.name, material.chunkDensity, "", 0, 64));
		}
	}
	
	private static void readConfigValues() {
		for(Map.Entry<MaterialRegistry, UIBlockOre> ore : UIBlocks.ores.entrySet()) {
			MaterialRegistry material = ore.getKey();
			minY.put(material, minYProperties.get(material).getInt());
			maxY.put(material, maxYProperties.get(material).getInt());
			veinSizeOverride.put(material, veinSizeOverrideProperties.get(material).getInt());
			chunkDensity.put(material, chunkDensityProperties.get(material).getInt());
		}
	}
	
	private static void writeConfigValues() {
		for(Map.Entry<MaterialRegistry, UIBlockOre> ore : UIBlocks.ores.entrySet()) {
			MaterialRegistry material = ore.getKey();
			minYProperties.get(material).set(minY.get(material));
			maxYProperties.get(material).set(maxY.get(material));
			veinSizeOverrideProperties.get(material).set(veinSizeOverride.get(material));
			chunkDensityProperties.get(material).set(chunkDensity.get(material));
		}
		
		if(cfg.hasChanged()) {
			cfg.save();
		}
	}
}