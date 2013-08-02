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
		BlockInfo.SILVER_ORE_ID = config.getBlock(BlockInfo.SILVER_ORE_KEY, BlockInfo.SILVER_ORE_DEFAULT).getInt();
		BlockInfo.LEAD_ORE_ID = config.getBlock(BlockInfo.LEAD_ORE_KEY, BlockInfo.LEAD_ORE_DEFAULT).getInt();
		BlockInfo.COPPER_ID = config.getBlock(BlockInfo.COPPER_KEY, BlockInfo.COPPER_DEFAULT).getInt();
		BlockInfo.TIN_ID = config.getBlock(BlockInfo.TIN_KEY, BlockInfo.TIN_DEFAULT).getInt();
		BlockInfo.BRONZE_ID = config.getBlock(BlockInfo.BRONZE_KEY, BlockInfo.BRONZE_DEFAULT).getInt();
		BlockInfo.SILVER_ID = config.getBlock(BlockInfo.SILVER_KEY, BlockInfo.SILVER_DEFAULT).getInt();
		BlockInfo.LEAD_ID = config.getBlock(BlockInfo.LEAD_KEY, BlockInfo.LEAD_DEFAULT).getInt();
		BlockInfo.RUBBER_SAPLING_ID = config.getBlock(BlockInfo.RUBBER_SAPLING_KEY, BlockInfo.RUBBER_SAPLING_DEFAULT).getInt();
		BlockInfo.RUBBER_WOOD_ID = config.getBlock(BlockInfo.RUBBER_WOOD_KEY, BlockInfo.RUBBER_WOOD_DEFAULT).getInt();
		BlockInfo.RUBBER_LEAVES_ID = config.getBlock(BlockInfo.RUBBER_LEAVES_KEY, BlockInfo.RUBBER_LEAVES_DEFAULT).getInt();
		
		ItemInfo.INGOT_COPPER_ID = config.getItem(ItemInfo.INGOT_COPPER_KEY, ItemInfo.INGOT_COPPER_DEFAULT).getInt() - 256;
		ItemInfo.INGOT_TIN_ID = config.getItem(ItemInfo.INGOT_TIN_KEY, ItemInfo.INGOT_TIN_DEFAULT).getInt() - 256;
		ItemInfo.INGOT_BRONZE_ID = config.getItem(ItemInfo.INGOT_BRONZE_KEY, ItemInfo.INGOT_BRONZE_DEFAULT).getInt() - 256;
		ItemInfo.INGOT_SILVER_ID = config.getItem(ItemInfo.INGOT_SILVER_KEY, ItemInfo.INGOT_SILVER_DEFAULT).getInt() - 256;
		ItemInfo.INGOT_LEAD_ID = config.getItem(ItemInfo.INGOT_LEAD_KEY, ItemInfo.INGOT_LEAD_DEFAULT).getInt() - 256;
		ItemInfo.RAW_RUBBER_ID = config.getItem(ItemInfo.RAW_RUBBER_KEY, ItemInfo.RAW_RUBBER_DEFAULT).getInt() - 256;
		ItemInfo.INGOT_RUBBER_ID = config.getItem(ItemInfo.INGOT_RUBBER_KEY, ItemInfo.INGOT_RUBBER_DEFAULT).getInt() - 256;
		
		config.save();
		
	}
}
