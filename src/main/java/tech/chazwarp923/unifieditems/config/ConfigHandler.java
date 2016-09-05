package tech.chazwarp923.unifieditems.config;

import java.io.File;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import tech.chazwarp923.unifieditems.lib.Reference;

public class ConfigHandler {

	private static Configuration config;
	
	public static String PER_VEIN = "Ores Per Vein";
	public static String PER_CHUNK = "Veins Per Chunk";

	public static Configuration preInit(File file) {
		config = new Configuration(file);

		syncConfig(true, false);

		return config;
	}
	
	/**
	 * Synchconize the three copies of the config, if both booleans are false it will load defaults
	 * @param loadConfigFromFile whether or not we load the config from file
	 * @param loadConfigFromGUI whether or not we load the config from the config GUI
	 */
	private static void syncConfig(boolean loadConfigFromFile, boolean loadConfigFromGUI) {
		if(loadConfigFromFile == true) {
			config.load();
		}
		//TODO redo all this for the new system
		config.addCustomCategoryComment(PER_VEIN, "This Is How Many Ore Blocks There Will Be In A Vein Of Ore");
		config.addCustomCategoryComment(PER_CHUNK, "This Is How Many Veins Of Ore There Will Be Per Chunk");
		config.setCategoryRequiresWorldRestart(PER_VEIN, true);
		config.setCategoryRequiresWorldRestart(PER_CHUNK, true);

		config.save();
	}

	@SubscribeEvent
	public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent configChangedEvent) {
		if (configChangedEvent.getModID().equals(Reference.MOD_ID))
			ConfigHandler.syncConfig(false, true);
	}
}