package com.chazwarp.unifieditems.proxy;

import com.chazwarp.unifieditems.ModDetector;
import com.chazwarp.unifieditems.UnifiedItems;
import com.chazwarp.unifieditems.blocks.UIBlocks;
import com.chazwarp.unifieditems.config.ConfigHandler;
import com.chazwarp.unifieditems.crafting.Shaped;
import com.chazwarp.unifieditems.crafting.Shapeless;
import com.chazwarp.unifieditems.crafting.Smelting;
import com.chazwarp.unifieditems.event.ItemCraftedEventHandler;
import com.chazwarp.unifieditems.items.UIItems;
import com.chazwarp.unifieditems.lib.Reference;
import com.chazwarp.unifieditems.material.MaterialHandler;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent preInitEvent) {
		//Does Config Things
		UnifiedItems.configFile = preInitEvent.getSuggestedConfigurationFile();
		ConfigHandler.init(UnifiedItems.configFile);
		MinecraftForge.EVENT_BUS.register(new ConfigHandler());

		//Register Event Handlers
		MinecraftForge.EVENT_BUS.register(new ItemCraftedEventHandler());

		//Registers The Blocks And Items
		ModDetector.preInit();
		MaterialHandler.addBlocksAndItemsForMaterials();
		UIBlocks.init();
		UIItems.init();

		//Registers World Gen
		//new WorldGenHandler();

		//Adds All The Crafting Related Stuff
		Shaped.init();
		Shapeless.init();
		Smelting.init();
		
		//Hard Codes The Mod Data
		preInitEvent.getModMetadata().credits = "Reika, enderblaze2 & ganymedes01";
		preInitEvent.getModMetadata().description = "A Mod That Unifies Your World Generation";
		preInitEvent.getModMetadata().logoFile = "assets/" + Reference.TEXTURE_LOC + "/textures/logo.png";
		preInitEvent.getModMetadata().modId = Reference.MOD_ID;
		preInitEvent.getModMetadata().name = Reference.MOD_NAME;
		preInitEvent.getModMetadata().version = Reference.VERSION;
	}
	
	public void init(FMLInitializationEvent initEvent) {
		//Registers The Instance Of The Mod
		MinecraftForge.EVENT_BUS.register(UnifiedItems.instance);
	}

	public void postInit(FMLPostInitializationEvent postInitEvent) {
	
	}
}