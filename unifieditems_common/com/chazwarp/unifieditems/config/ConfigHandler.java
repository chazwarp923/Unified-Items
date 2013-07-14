package com.chazwarp.unifieditems.config;

import java.io.File;

import net.minecraftforge.common.Configuration;

import com.chazwarp.unifieditems.lib.BlockInfo;
import com.chazwarp.unifieditems.lib.ItemInfo;

public class ConfigHandler {

	
	public static void init(File file) {
		Configuration config = new Configuration(file);
		
		config.load();
		
		BlockInfo.COPPER_ORE_ID = config.getBlock(BlockInfo.COPPER_ORE_KEY, BlockInfo.COPPER_ORE_DEFAULT).getInt();
		BlockInfo.TIN_ORE_ID = config.getBlock(BlockInfo.TIN_ORE_KEY, BlockInfo.TIN_ORE_DEFAULT).getInt();
		BlockInfo.RUBBER_SAPLING_ID = config.getBlock(BlockInfo.RUBBER_SAPLING_KEY, BlockInfo.RUBBER_SAPLING_DEFAULT).getInt();
		BlockInfo.RUBBER_WOOD_ID = config.getBlock(BlockInfo.RUBBER_WOOD_KEY, BlockInfo.RUBBER_WOOD_DEFAULT).getInt();
		BlockInfo.RUBBER_LEAVES_ID = config.getBlock(BlockInfo.RUBBER_LEAVES_KEY, BlockInfo.RUBBER_LEAVES_DEFAULT).getInt();
		
		ItemInfo.INGOT_COPPER_ID = config.getItem(ItemInfo.INGOT_COPPER_KEY, ItemInfo.INGOT_COPPER_DEFAULT).getInt() - 256;
		ItemInfo.INGOT_TIN_ID = config.getItem(ItemInfo.INGOT_TIN_KEY, ItemInfo.INGOT_TIN_DEFAULT).getInt() - 256;
		ItemInfo.INGOT_BRONZE_ID = config.getItem(ItemInfo.INGOT_BRONZE_KEY, ItemInfo.INGOT_BRONZE_DEFAULT).getInt() - 256;
		ItemInfo.RUBBER_RAW_ID = config.getItem(ItemInfo.RUBBER_RAW_KEY, ItemInfo.RUBBER_RAW_DEFAULT).getInt() - 256;
		ItemInfo.RUBBER_ID = config.getItem(ItemInfo.RUBBER_KEY, ItemInfo.RUBBER_DEFAULT).getInt() - 256;
		
		config.save();
		
	}
}
