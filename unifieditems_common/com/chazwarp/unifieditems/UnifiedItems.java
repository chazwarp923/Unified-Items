package com.chazwarp.unifieditems;

import com.chazwarp.lib.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
//@NetworkMod(channels = { Reference.CHANNEL_NAME }, clientSideRequired = true, serverSideRequired = false, packetHandler = PacketHandler.class)
public class UnifiedItems {

    @Instance(Reference.MOD_ID)
    public static UnifiedItems instance;
    
    /*@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    public static CreativeTabs tabsEE3 = new CreativeTabEE3(CreativeTabs.getNextID(), Reference.MOD_ID);
    */
    @PreInit
    public void preInit(FMLPreInitializationEvent event) {
        
    }
    
    @Init
    public void init(FMLInitializationEvent event) {
        
    }
    
    @PostInit
    public void postInit(FMLPostInitializationEvent event) {
        
    }
}
