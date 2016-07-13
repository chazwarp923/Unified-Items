package tech.chazwarp923.unifieditems.proxy;

import tech.chazwarp923.unifieditems.UnifiedItems;
import tech.chazwarp923.unifieditems.block.UIBlocks;
import tech.chazwarp923.unifieditems.config.ConfigHandler;
import tech.chazwarp923.unifieditems.crafting.Shaped;
import tech.chazwarp923.unifieditems.crafting.Shapeless;
import tech.chazwarp923.unifieditems.crafting.Smelting;
import tech.chazwarp923.unifieditems.event.ItemCraftedEventHandler;
import tech.chazwarp923.unifieditems.item.UIItems;
import tech.chazwarp923.unifieditems.lib.Reference;
import tech.chazwarp923.unifieditems.material.MaterialHandler;
import tech.chazwarp923.unifieditems.modular.ModDetector;
import tech.chazwarp923.unifieditems.oredictionary.OreDictionaryHelper;
import tech.chazwarp923.unifieditems.world.WorldGenerationHandler;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent preInitEvent) {
		//Does Config Things
		UnifiedItems.configFile = preInitEvent.getSuggestedConfigurationFile();
		ConfigHandler.init(UnifiedItems.configFile);

		//Register Event Handlers
		MinecraftForge.EVENT_BUS.register(new ItemCraftedEventHandler());

		//Registers The Blocks And Items
		ModDetector.preInit();
		MaterialHandler.addBlocksAndItemsForMaterials();
		UIBlocks.preInit();
		UIItems.preInit();
		
		//Hard Codes The Mod Metadata
		preInitEvent.getModMetadata().credits = "Reika, enderblaze2, ganymedes01";
		preInitEvent.getModMetadata().description = "Unify all the world generation!";
		preInitEvent.getModMetadata().logoFile = "assets/" + Reference.TEXTURE_LOC + "/textures/logo.png";
		preInitEvent.getModMetadata().modId = Reference.MOD_ID;
		preInitEvent.getModMetadata().name = Reference.MOD_NAME;
		preInitEvent.getModMetadata().version = Reference.VERSION;
	}
	
	public void init(FMLInitializationEvent initEvent) {
		//Registers The Instance Of The Mod
		MinecraftForge.EVENT_BUS.register(UnifiedItems.instance);
		
		//Registers World Generation
		GameRegistry.registerWorldGenerator(new WorldGenerationHandler(), 0);

		//Adds All The Crafting Related Stuff
		Shaped.preInit();
		Shapeless.preInit();
		Smelting.preInit();
		
		//Does Oredictonary Related Things
		OreDictionaryHelper.init();
	}

	public void postInit(FMLPostInitializationEvent postInitEvent) {
	
	}
}