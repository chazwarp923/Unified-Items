package com.chazwarp.unifieditems;


import com.chazwarp.unifieditems.blocks.Blocks;
import com.chazwarp.unifieditems.compat.ModExistence;
import com.chazwarp.unifieditems.config.ConfigHandler;
import com.chazwarp.unifieditems.crafting.CraftingHandler;
import com.chazwarp.unifieditems.crafting.Shapeless;
import com.chazwarp.unifieditems.crafting.Smelting;
import com.chazwarp.unifieditems.items.Items;
import com.chazwarp.unifieditems.lib.Reference;
import com.chazwarp.unifieditems.network.PacketHandler;
import com.chazwarp.unifieditems.oredictionary.RegisterDict;
import com.chazwarp.unifieditems.world.WorldGenHandler;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
@NetworkMod(channels = {Reference.CHANNEL}  ,clientSideRequired = true, serverSideRequired = true, packetHandler = PacketHandler.class)
public class UnifiedItems {

        // The instance of your mod that Forge uses.
        @Instance(Reference.MOD_ID)
        public static UnifiedItems instance;
       
        // Says where the client and server 'proxy' code is loaded.
        @SidedProxy(clientSide="com.chazwarp.unifieditems.client.ClientProxy", serverSide="com.chazwarp.unifieditems.CommonProxy")
        public static CommonProxy proxy;
       
        @EventHandler
        public void preInit(FMLPreInitializationEvent event) {
        	
        	ConfigHandler.init(event.getSuggestedConfigurationFile());
        //Registers the items
        	Items.initItems();
        //Registers the blocks
        	Blocks.initBlocks();
       	//Adds Crafting Related Things
        	GameRegistry.registerCraftingHandler(new CraftingHandler());
        	Shapeless.addCrafting();
        	Smelting.addSmelting();
        //Registers World Gen
        	new WorldGenHandler();
        //Registers Things With The Proxy
        	proxy.registerRenderers();
        }
       
        @EventHandler
        public void Init(FMLInitializationEvent event) {

        //Registers names for Blocks
        	Blocks.addNames();
       	//Registers names for Items
        	Items.addNames();
        //Registers things with the Ore Dictionary
        	RegisterDict.addIron();
        	RegisterDict.addGold();
        	RegisterDict.addCopper();
        	RegisterDict.addTin();
        	RegisterDict.addBronze();
        	RegisterDict.addSilver();
        	RegisterDict.addLead();
        	RegisterDict.addRubber();
        	RegisterDict.addSinglePul();
        }
       
        @EventHandler
        public void postInit(FMLPostInitializationEvent event) {
        
        //Adds additional ores per vein if other mods are installed
        	ModExistence.Compat();
        }
}
