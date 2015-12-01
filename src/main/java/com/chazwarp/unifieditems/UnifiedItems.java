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

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

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
		MinecraftForge.EVENT_BUS.register(new ConfigHandler());

		// Does Event Related Things
		MinecraftForge.EVENT_BUS.register(new ItemCraftedEventHandler());

		// Registers The Blocks And Items
		ModDetector.preInit();
		MaterialHandler.addBlocksAndItemsForMaterials();
		UIBlocks.registerBlocks();
		UIItems.registerItems();

		// Registers World Gen
		//new WorldGenHandler();

		// Registers Things With The Proxy
		proxy.registerRenderers();

		// Hard Codes The Mod Data
		preInitEvent.getModMetadata().credits = "Reika, enderblaze2 & ganymedes01";
		preInitEvent.getModMetadata().description = "A Mod That Unifies Your World Generation";
		preInitEvent.getModMetadata().logoFile = "assets/" + Reference.TEXTURE_LOC + "/textures/logo.png";
		preInitEvent.getModMetadata().modId = Reference.MOD_ID;
		preInitEvent.getModMetadata().name = Reference.MOD_NAME;
		preInitEvent.getModMetadata().version = Reference.VERSION;
	}

	@Mod.EventHandler
	public void Init(FMLInitializationEvent initEvent) {
		// Adds All The Crafting Related Stuff
		Shaped.addCrafting();
		Shapeless.addCrafting();
		Smelting.addSmelting();
		// Registers The Instance Of The Mod
		MinecraftForge.EVENT_BUS.register(instance);
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent postInitEvent) {
		
	}
}
