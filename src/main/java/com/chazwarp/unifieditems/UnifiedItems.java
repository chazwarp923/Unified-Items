/**
@author Chaz Kerby
 */
package com.chazwarp.unifieditems;

import java.io.File;

import com.chazwarp.unifieditems.blocks.UIBlocks;
import com.chazwarp.unifieditems.config.ConfigHandler;
import com.chazwarp.unifieditems.crafting.Shaped;
import com.chazwarp.unifieditems.crafting.Shapeless;
import com.chazwarp.unifieditems.crafting.Smelting;
import com.chazwarp.unifieditems.event.ItemCraftedEventHandler;
import com.chazwarp.unifieditems.items.UIItems;
import com.chazwarp.unifieditems.lib.Reference;
import com.chazwarp.unifieditems.material.MaterialHandler;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = "com.chazwarp.unifieditems.config.ConfigGuiFactory")
public class UnifiedItems {

	public static File configFile;

	// The instance of your mod that Forge uses.
	@Mod.Instance(Reference.MOD_ID)
	public static UnifiedItems instance;

	// Says where the client and server 'proxy' code is loaded.
	@SidedProxy(clientSide = "com.chazwarp.unifieditems.client.ClientProxy", serverSide = "com.chazwarp.unifieditems.CommonProxy")
	public static CommonProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent preInitEvent) {

		// Does Config Things
		configFile = preInitEvent.getSuggestedConfigurationFile();
		ConfigHandler.init(configFile);
		FMLCommonHandler.instance().bus().register(new ConfigHandler());

		// Does Event Related Things
		FMLCommonHandler.instance().bus().register(new ItemCraftedEventHandler());

		// Registers The Blocks And Items
		ModDetector.preInit();
		MaterialHandler.addBlocksAndItemsForMaterials();
		UIBlocks.registerBlocks();
		UIItems.initItems();

		// Registers World Gen
		//new WorldGenHandler();

		// Registers Things With The Proxy
		proxy.registerRenderers();

		// Hard Codes The Mod Data
		preInitEvent.getModMetadata().credits = "Reika, enderblaze2 & ganymedes01";
		preInitEvent.getModMetadata().description = "A Mod That Unifies Your World Generation";
		preInitEvent.getModMetadata().logoFile = "assets/" + Reference.MOD_ID + "/textures/logo.png";
		preInitEvent.getModMetadata().modId = Reference.MOD_ID;
		preInitEvent.getModMetadata().name = Reference.MOD_NAME;
		preInitEvent.getModMetadata().version = Reference.VERSION;
	}

	@Mod.EventHandler
	public void Init(FMLInitializationEvent initEvent) {
		// Registers Everything To The Ore Dictionary
		//OreDict.registerAll();
		// Adds All The Crafting Related Stuff
		Shaped.addCrafting();
		Shapeless.addCrafting();
		Smelting.addSmelting();
		// Registers The Instance Of The Mod
		FMLCommonHandler.instance().bus().register(instance);
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent postInitEvent) {
		
	}
}
