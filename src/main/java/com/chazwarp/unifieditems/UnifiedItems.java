package com.chazwarp.unifieditems;

import java.io.File;

import com.chazwarp.unifieditems.blocks.ModBlocks;
import com.chazwarp.unifieditems.compat.ModExistence;
import com.chazwarp.unifieditems.config.ConfigHandler;
import com.chazwarp.unifieditems.items.ModItems;
import com.chazwarp.unifieditems.lib.Reference;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = "com.chazwarp.unifieditems.config.ConfigGuiFactory")

public class UnifiedItems {

	public static File configFile;
	
        // The instance of your mod that Forge uses.
        @Instance(Reference.MOD_ID)
        public static UnifiedItems instance;
       
        // Says where the client and server 'proxy' code is loaded.
        @SidedProxy(clientSide="com.chazwarp.unifieditems.client.ClientProxy", serverSide="com.chazwarp.unifieditems.CommonProxy")
        public static CommonProxy proxy;
       
        @EventHandler
        public void preInit(FMLPreInitializationEvent event) {
        	
        //Does Config Things
        	ConfigHandler.init(event.getSuggestedConfigurationFile());
        	configFile = event.getSuggestedConfigurationFile();
        	
        //Registers The Blocks And Items
        	ModBlocks.initBlocks();
        	ModItems.initItems();

        //Registers World Gen
        	//new WorldGenHandler();
        	
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
        
        @SubscribeEvent
    	public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent eventArgs) {
    	 	if(eventArgs.modID.equals(Reference.MOD_ID))
    	 		ConfigHandler.init(this.configFile);
    		}
       
        @EventHandler
        public void Init(FMLInitializationEvent event) {

        //Registers Names For Blocks And Items
        	ModBlocks.addNames();
        	ModItems.addNames();
        	
        //Registers things with the Ore Dictionary
        	//OreDict.registerAll();
        	
        //Does Things So We Can Edit The Config In Game
        	FMLCommonHandler.instance().bus().register(instance);
        }
       
        @EventHandler
        public void postInit(FMLPostInitializationEvent event) {
        
        //Adds additional ores per vein if other mods are installed
        	ModExistence.Compat();
        }
}
