/**
@author Chaz Kerby
 */
package com.chazwarp.unifieditems;

import java.io.File;

import org.apache.logging.log4j.Logger;

import com.chazwarp.unifieditems.lib.Reference;
import com.chazwarp.unifieditems.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, acceptedMinecraftVersions = "[1.8,1.8.9]", guiFactory = "com.chazwarp.unifieditems.config.ConfigGuiFactory")
public class UnifiedItems {

	public static File configFile;

	//The instance of your mod that Forge uses.
	@Mod.Instance(Reference.MOD_ID)
	public static UnifiedItems instance;
	
	public static Logger logger;

	//Says where the client and server 'proxy' code is loaded.
	@SidedProxy(clientSide = "com.chazwarp.unifieditems.proxy.ClientProxy", serverSide = "com.chazwarp.unifieditems.proxy.CommonProxy")
	public static CommonProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent preInitEvent) {
		logger = preInitEvent.getModLog();
		proxy.preInit(preInitEvent);
	}

	@Mod.EventHandler
	public void Init(FMLInitializationEvent initEvent) {
		proxy.init(initEvent);
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent postInitEvent) {
		proxy.postInit(postInitEvent);
	}
}
