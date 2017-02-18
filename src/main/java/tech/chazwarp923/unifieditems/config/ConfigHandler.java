/**
@author Chazwarp923
 */
package tech.chazwarp923.unifieditems.config;

import java.io.File;
import java.util.HashMap;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import tech.chazwarp923.unifieditems.material.Material;
import tech.chazwarp923.unifieditems.material.MaterialRegistry;
import tech.chazwarp923.unifieditems.proxy.ClientProxy;

public class ConfigHandler {

	private static Configuration cfg;
	
	public static String CATEGORY_GENERAL = "general";
	public static String CATEGORY_MIN_Y = "miny";
	public static String CATEGORY_MAX_Y = "maxy";
	public static String CATEGORY_VEIN_SIZE_OVERRIDE = "veinsizeoverride";
	public static String CATEGORY_CHUNK_DENSITY = "chunkdensity";
	public static String CATEGORY_MANUAL_OVERRIDE = "manualoverride";
	
	public static HashMap<String, Boolean> general = new HashMap<String, Boolean>();
	public static HashMap<Material, Integer> minY = new HashMap<Material, Integer>();
	public static HashMap<Material, Integer> maxY = new HashMap<Material, Integer>();
	public static HashMap<Material, Integer> veinSizeOverride = new HashMap<Material, Integer>();
	public static HashMap<Material, Integer> chunkDensity = new HashMap<Material, Integer>();
	public static HashMap<Material, Integer> manualOverride = new HashMap<Material, Integer>();
	
	private static HashMap<String, Property> generalProperties = new HashMap<String, Property>();
	private static HashMap<Material, Property> minYProperties = new HashMap<Material, Property>();
	private static HashMap<Material, Property> maxYProperties = new HashMap<Material, Property>();
	private static HashMap<Material, Property> veinSizeOverrideProperties = new HashMap<Material, Property>();
	private static HashMap<Material, Property> chunkDensityProperties = new HashMap<Material, Property>();
	private static HashMap<Material, Property> manualOverrideProperties = new HashMap<Material, Property>();

	public static Configuration preInit(File file) {
		cfg = new Configuration(file);
		loadValuesFromDisk();
		
		if(FMLCommonHandler.instance().getSide().equals(Side.CLIENT)) {
			ClientProxy.configLoad(minYProperties, maxYProperties, veinSizeOverrideProperties, chunkDensityProperties, manualOverrideProperties);
		}
		
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
		
		cfg.addCustomCategoryComment(CATEGORY_GENERAL, "General options");
		cfg.addCustomCategoryComment(CATEGORY_MIN_Y, "Minimum Y Level");
		cfg.addCustomCategoryComment(CATEGORY_MAX_Y, "Maximum Y Level");
		cfg.addCustomCategoryComment(CATEGORY_VEIN_SIZE_OVERRIDE, "For overriding the precalculated amount of ores per vein, -1 to disable and use precalculated values");
		cfg.addCustomCategoryComment(CATEGORY_CHUNK_DENSITY, "How many veins are generated per chunk");
		cfg.addCustomCategoryComment(CATEGORY_MANUAL_OVERRIDE, "Whether or not a material is force enabled/disabled, 0 = inactive, 1 = force enabled, -1 = force disabled");
		
		cfg.setCategoryRequiresMcRestart(CATEGORY_GENERAL, true);
		cfg.setCategoryRequiresWorldRestart(CATEGORY_MIN_Y, true);
		cfg.setCategoryRequiresWorldRestart(CATEGORY_MAX_Y, true);
		cfg.setCategoryRequiresWorldRestart(CATEGORY_VEIN_SIZE_OVERRIDE, true);
		cfg.setCategoryRequiresWorldRestart(CATEGORY_CHUNK_DENSITY, true);
		cfg.setCategoryRequiresMcRestart(CATEGORY_MANUAL_OVERRIDE, true);
		
		if (readFieldsFromConfig) {
			readConfigValues();
		}
		
		writeConfigValues();
	}
	
	private static void loadConfigProperties() {
		
		generalProperties.put("furnaceConvert", cfg.get(CATEGORY_GENERAL, "Furnace Conversion Recipes", true));
		
		for(Material material : MaterialRegistry.ores) {
			minYProperties.put(material, cfg.get(CATEGORY_MIN_Y, material.name, material.minY, "", 0, 255));
			maxYProperties.put(material, cfg.get(CATEGORY_MAX_Y, material.name, material.maxY, "", 0, 255));
			veinSizeOverrideProperties.put(material, cfg.get(CATEGORY_VEIN_SIZE_OVERRIDE, material.name, -1, "", -1, 64));
			chunkDensityProperties.put(material, cfg.get(CATEGORY_CHUNK_DENSITY, material.name, material.chunkDensity, "", 0, 64));
		}
		
		for(Material material : MaterialRegistry.enabledMaterials.keySet()) {
			manualOverrideProperties.put(material, cfg.get(CATEGORY_MANUAL_OVERRIDE, material.name, 0, "", -1, 1));
		}
	}
	
	private static void readConfigValues() {
		
		general.put("furnaceConvert", generalProperties.get("furnaceConvert").getBoolean());
		
		for(Material material : MaterialRegistry.ores) {
			minY.put(material, minYProperties.get(material).getInt());
			maxY.put(material, maxYProperties.get(material).getInt());
			veinSizeOverride.put(material, veinSizeOverrideProperties.get(material).getInt());
			chunkDensity.put(material, chunkDensityProperties.get(material).getInt());
		}
		
		for(Material material : MaterialRegistry.enabledMaterials.keySet()) {
			manualOverride.put(material, manualOverrideProperties.get(material).getInt());
		}
	}
	
	private static void writeConfigValues() {
		
		generalProperties.get("furnaceConvert").set(general.get("furnaceConvert"));
		
		for(Material material : MaterialRegistry.ores) {
			minYProperties.get(material).set(minY.get(material));
			maxYProperties.get(material).set(maxY.get(material));
			veinSizeOverrideProperties.get(material).set(veinSizeOverride.get(material));
			chunkDensityProperties.get(material).set(chunkDensity.get(material));
		}
		
		for(Material material : MaterialRegistry.enabledMaterials.keySet()) {
			manualOverrideProperties.get(material).set(manualOverride.get(material));
		}
		
		if(cfg.hasChanged()) {
			cfg.save();
		}
	}
}