package com.chazwarp.unifieditems.config;

import java.io.File;

import com.chazwarp.unifieditems.UnifiedItems;
import com.chazwarp.unifieditems.lib.OreGen;
import com.chazwarp.unifieditems.lib.Reference;

import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

public class ConfigHandler {

	public static String PER_VEIN = "Ores Per Vein";
	public static String PER_CHUNK = "Veins Per Chunk";

	public static Configuration init(File file) {
		Configuration config = new Configuration(file);

		config.load();

		config.addCustomCategoryComment(PER_VEIN, "This Is How Many Ore Blocks There Will Be In A Vein Of Ore");
		config.addCustomCategoryComment(PER_CHUNK, "This Is How Many Veins Of Ore There Will Be Per Chunk");
		config.setCategoryRequiresWorldRestart(PER_VEIN, true);
		config.setCategoryRequiresWorldRestart(PER_CHUNK, true);

		OreGen.COPPER_VEIN = config.getInt("Copper", PER_VEIN, 8, 0, 16, "");
		OreGen.TIN_VEIN = config.getInt("Tin", PER_VEIN, 8, 0, 16, "");
		OreGen.SILVER_VEIN = config.getInt("Silver", PER_VEIN, 8, 0, 16, "");
		OreGen.LEAD_VEIN = config.getInt("Lead", PER_VEIN, 8, 0, 16, "");

		OreGen.COPPER_CHUNK = config.getInt("Copper", PER_CHUNK, 8, 0, 16, "");
		OreGen.TIN_CHUNK = config.getInt("Tin", PER_CHUNK, 6, 0, 12, "");
		OreGen.SILVER_CHUNK = config.getInt("Silver", PER_CHUNK, 3, 0, 6, "");
		OreGen.LEAD_CHUNK = config.getInt("Lead", PER_CHUNK, 4, 0, 8, "");

		config.save();

		return config;
	}

	@SubscribeEvent
	public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent eventArgs) {
		if (eventArgs.modID.equals(Reference.MOD_ID))
			ConfigHandler.init(UnifiedItems.configFile);
	}
}