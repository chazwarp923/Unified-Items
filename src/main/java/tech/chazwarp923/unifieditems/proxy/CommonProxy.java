/**
@author Chazwarp923
 */
package tech.chazwarp923.unifieditems.proxy;

import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInterModComms;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import tech.chazwarp923.unifieditems.Reference;
import tech.chazwarp923.unifieditems.UnifiedItems;
import tech.chazwarp923.unifieditems.block.UIBlockGemOre;
import tech.chazwarp923.unifieditems.block.UIBlockMetalOre;
import tech.chazwarp923.unifieditems.block.UIBlocks;
import tech.chazwarp923.unifieditems.config.ConfigHandler;
import tech.chazwarp923.unifieditems.crafting.Shaped;
import tech.chazwarp923.unifieditems.crafting.Shapeless;
import tech.chazwarp923.unifieditems.crafting.Smelting;
import tech.chazwarp923.unifieditems.item.UIItems;
import tech.chazwarp923.unifieditems.material.Material;
import tech.chazwarp923.unifieditems.material.MaterialHandler;
import tech.chazwarp923.unifieditems.material.MaterialRegistry;
import tech.chazwarp923.unifieditems.modular.MaterialDetector;
import tech.chazwarp923.unifieditems.world.WorldGenerationHandler;

import java.util.Map;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent preInitEvent) {		
		MaterialRegistry.populate();//This Must be run before the config is loaded ALWAYS
		
		//Gets the suggested config location then initializes the config
		UnifiedItems.configFile = preInitEvent.getSuggestedConfigurationFile();
		UnifiedItems.config = ConfigHandler.preInit(UnifiedItems.configFile);
		
		MaterialDetector.preInit(preInitEvent);
		MaterialRegistry.setEnabled(MaterialDetector.readKnownMaterials());
		MaterialHandler.addBlocksAndItemsForMaterials();
		UIBlocks.preInit();
		UIItems.preInit();
		
		//Hardcodes the mcmod.info
		preInitEvent.getModMetadata().credits = "Reika, enderblaze2, ganymedes01, mezz, LexManos, CyanideX, Katur";
		preInitEvent.getModMetadata().description = "Unify all the world generation!";
		preInitEvent.getModMetadata().logoFile = "assets/" + Reference.MOD_ID + "/textures/logo.png";
		preInitEvent.getModMetadata().modId = Reference.MOD_ID;
		preInitEvent.getModMetadata().name = Reference.MOD_NAME;
		preInitEvent.getModMetadata().version = Reference.VERSION;
	}
	
	public void init(FMLInitializationEvent initEvent) {
		MaterialDetector.init();
		
		//Registers the instance of the mod
		MinecraftForge.EVENT_BUS.register(UnifiedItems.instance);
		
		//Registers world generation
		GameRegistry.registerWorldGenerator(new WorldGenerationHandler(), -1);
		
		//Adds all the crafting related stuff
		//RecipeSorter.register(Reference.RESOURCE_PREFIX + "mortarAndPestle", MortarAndPestleRecipe.class, RecipeSorter.Category.SHAPELESS, "after:minecraft:shapeless");
		//RecipeSorter.register(Reference.RESOURCE_PREFIX + "oreToDust", OreToDustRecipe.class, RecipeSorter.Category.SHAPELESS, "after:" + Reference.MOD_ID + ":mortarAndPestle");
		//RecipeSorter.register(Reference.RESOURCE_PREFIX + "torch", TorchRecipe.class, RecipeSorter.Category.SHAPELESS, "after:minecraft:shapeless");
		Shaped.init();
		Shapeless.init();
		Smelting.init();
		
		for(Map.Entry<Material, UIBlockMetalOre> oreBlock : UIBlocks.metalOres.entrySet()) {
			FMLInterModComms.sendMessage("denseores", "addDenseOreStone", new ItemStack(oreBlock.getValue()));
		}
		for(Map.Entry<Material, UIBlockGemOre> oreBlock : UIBlocks.gemOres.entrySet()) {
			FMLInterModComms.sendMessage("denseores", "addDenseOreStone", new ItemStack(oreBlock.getValue()));
		}
	}

	public void postInit(FMLPostInitializationEvent postInitEvent) {
		if(UnifiedItems.config.hasChanged()) {
			UnifiedItems.config.save();
		}
	}
}