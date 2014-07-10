package com.chazwarp.unifieditems;

import java.io.File;

import com.chazwarp.unifieditems.blocks.ModBlocks;
import com.chazwarp.unifieditems.compat.ModExistence;
import com.chazwarp.unifieditems.config.ConfigHandler;
import com.chazwarp.unifieditems.crafting.Shaped;
import com.chazwarp.unifieditems.crafting.Shapeless;
import com.chazwarp.unifieditems.crafting.Smelting;
import com.chazwarp.unifieditems.items.ModItems;
import com.chazwarp.unifieditems.lib.Reference;
import com.chazwarp.unifieditems.oredictionary.OreDict;
import com.chazwarp.unifieditems.world.WorldGenHandler;

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
        @SidedProxy(clientSide="com.chazwarp.unifieditems.client.ClientProxy", serverSide="com.chazwarp.unifieditems.CommonProxy")
        public static CommonProxy proxy;
       
        @Mod.EventHandler
        public void preInit(FMLPreInitializationEvent event) {
        	
        //Does Config Things
        	configFile = event.getSuggestedConfigurationFile();
        	ConfigHandler.init(configFile);
        	FMLCommonHandler.instance().bus().register(new ConfigHandler());
        	
        //Registers The Blocks And Items
        	ModBlocks.initBlocks();
        	ModItems.initItems();

        //Registers World Gen
        	new WorldGenHandler();
        	
        //Registers Things With The Proxy
        	proxy.registerRenderers();
        	
        //Hard Codes The Mod Data
        	event.getModMetadata().authorList.add("chazwarp923");
        	event.getModMetadata().credits = "Reika & enderblaze2";
        	event.getModMetadata().description = "A Mod That Unifies Your World Generation";
        	event.getModMetadata().logoFile = "assets/" + Reference.MOD_ID +"/textures/logo.png";
        	event.getModMetadata().modId = Reference.MOD_ID;
        	event.getModMetadata().name = Reference.MOD_NAME;
        	event.getModMetadata().version = Reference.VERSION;       	
        }
       
        @Mod.EventHandler
        public void Init(FMLInitializationEvent event) {
        	//Registers Everything TO The Ore Dictionary
        		OreDict.registerAll();
        	//Adds All The Crafting Related Stuff
        		Shaped.addCrafting();
        		Shapeless.addCrafting();
        		Smelting.addSmelting(); 
        	//Registers The Instance Of The Mod
        		FMLCommonHandler.instance().bus().register(instance);
        }
       
        @Mod.EventHandler
        public void postInit(FMLPostInitializationEvent event) {        
        //Adds additional ores per vein if other mods are installed
        	ModExistence.Compat();
        }
}
