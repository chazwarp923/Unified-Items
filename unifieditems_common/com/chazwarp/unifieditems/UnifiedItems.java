package com.chazwarp.unifieditems;


import com.chazwarp.unifieditems.blocks.Blocks;
import com.chazwarp.unifieditems.config.ConfigHandler;
import com.chazwarp.unifieditems.crafting.Shapeless;
import com.chazwarp.unifieditems.crafting.Smelting;
import com.chazwarp.unifieditems.items.Items;
import com.chazwarp.unifieditems.lib.Reference;
import com.chazwarp.unifieditems.network.PacketHandler;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

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
        	Items.initCopper();
        	Items.initTin();
        	Items.initBronze();
        	Items.initRubberRaw();
        	Items.initRubber();
        	Blocks.initCopper();
        	Blocks.initTin();
        	//Blocks.initSapling();
        	Blocks.initLog();
        	//Blocks.initLeaves();
        	Shapeless.addCrafting();
        	Smelting.addSmelting();
        	proxy.registerRenderers();
        }
       
        @EventHandler
        public void Init(FMLInitializationEvent event) {

        	Items.addCopperName();
        	Items.addTinName();
        	Items.addBronzeName();
        	Items.addRubberRawName();
        	Items.addRubberName();
        	Blocks.addCopperName();
        	Blocks.addTinName();
        	//Blocks.addSaplingName();
        	Blocks.addLogName();
        	//Blocks.addLeavesName();
        }
       
        @EventHandler
        public void postInit(FMLPostInitializationEvent event) {
                // Stub Method
        }
}
