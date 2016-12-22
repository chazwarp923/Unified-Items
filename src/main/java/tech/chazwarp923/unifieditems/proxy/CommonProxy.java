package tech.chazwarp923.unifieditems.proxy;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.RecipeSorter;
import tech.chazwarp923.unifieditems.Reference;
import tech.chazwarp923.unifieditems.UnifiedItems;
import tech.chazwarp923.unifieditems.block.UIBlocks;
import tech.chazwarp923.unifieditems.config.ConfigHandler;
import tech.chazwarp923.unifieditems.crafting.Shaped;
import tech.chazwarp923.unifieditems.crafting.Shapeless;
import tech.chazwarp923.unifieditems.crafting.Smelting;
import tech.chazwarp923.unifieditems.crafting.IRecipe.FlintRecipe;
import tech.chazwarp923.unifieditems.crafting.IRecipe.OreToDustRecipe;
import tech.chazwarp923.unifieditems.crafting.IRecipe.TorchRecipe;
import tech.chazwarp923.unifieditems.item.UIItems;
import tech.chazwarp923.unifieditems.material.MaterialHandler;
import tech.chazwarp923.unifieditems.material.MaterialRegistry;
import tech.chazwarp923.unifieditems.modular.ModDetector;
import tech.chazwarp923.unifieditems.modular.ModuleRegistry;
import tech.chazwarp923.unifieditems.world.WorldGenerationHandler;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent preInitEvent) {
		
		//Registers the blocks And items
		MaterialRegistry.populate();
		ModDetector.preInit();
		
			//Gets the suggested config location then initilizes the config
			UnifiedItems.configFile = preInitEvent.getSuggestedConfigurationFile();
			UnifiedItems.config = ConfigHandler.preInit(UnifiedItems.configFile);
		
		MaterialRegistry.setEnabled();
		MaterialHandler.addBlocksAndItemsForMaterials();
		UIBlocks.preInit();
		UIItems.preInit();
		ModuleRegistry.preInit();
		
		//Hardcodes the mcmod.info
		preInitEvent.getModMetadata().credits = "Reika, enderblaze2, ganymedes01, mezz, LexManos, CyanideX";
		preInitEvent.getModMetadata().description = "Unify all the world generation!";
		preInitEvent.getModMetadata().logoFile = "assets/" + Reference.MOD_ID + "/textures/logo.png";
		preInitEvent.getModMetadata().modId = Reference.MOD_ID;
		preInitEvent.getModMetadata().name = Reference.MOD_NAME;
		preInitEvent.getModMetadata().version = Reference.VERSION;
	}
	
	public void init(FMLInitializationEvent initEvent) {
		//Registers the instance of the mod
		MinecraftForge.EVENT_BUS.register(UnifiedItems.instance);
		
		//Registers world generation
		GameRegistry.registerWorldGenerator(new WorldGenerationHandler(), -1);
		
		//Adds all the crafting related stuff
		RecipeSorter.register(Reference.RESOURCE_PREFIX + "oreToDust", OreToDustRecipe.class, RecipeSorter.Category.SHAPELESS, "after:minecraft:shapeless");
		RecipeSorter.register(Reference.RESOURCE_PREFIX + "flint", FlintRecipe.class, RecipeSorter.Category.SHAPELESS, "after:minecraft:shapeless");
		RecipeSorter.register(Reference.RESOURCE_PREFIX + "torch", TorchRecipe.class, RecipeSorter.Category.SHAPELESS, "after:minecraft:shapeless");
		Shaped.init();
		Shapeless.init();
		Smelting.init();
		ModuleRegistry.init();
	}

	public void postInit(FMLPostInitializationEvent postInitEvent) {
		if(UnifiedItems.config.hasChanged()) {
			UnifiedItems.config.save();
		}
		ModuleRegistry.postInit();
	}
}