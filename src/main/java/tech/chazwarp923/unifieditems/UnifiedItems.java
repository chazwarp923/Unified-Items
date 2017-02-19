/**
@author Chazwarp923
 */
package tech.chazwarp923.unifieditems;

import java.io.File;

import org.apache.logging.log4j.Logger;

import net.minecraft.item.Item;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLMissingMappingsEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import tech.chazwarp923.unifieditems.block.UIBlocks;
import tech.chazwarp923.unifieditems.item.UIItems;
import tech.chazwarp923.unifieditems.material.Material;
import tech.chazwarp923.unifieditems.material.MaterialRegistry;
import tech.chazwarp923.unifieditems.proxy.CommonProxy;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, updateJSON = "http://chazwarp923.tech/UnifiedItems.json", dependencies = "required-after:compatlayer", acceptedMinecraftVersions = "[1.10.2],[1.11],[1.11.2]", guiFactory = "tech.chazwarp923.unifieditems.config.ConfigGuiFactory")
public class UnifiedItems {

	public static File configFile;
	public static Configuration config;

	//The instance of the mod that Forge uses.
	@Mod.Instance(Reference.MOD_ID)
	public static UnifiedItems instance;
	
	public static Logger logger;

	//Says where the client and server 'proxy' code is loaded.
	@SidedProxy(clientSide = "tech.chazwarp923.unifieditems.proxy.ClientProxy", serverSide = "tech.chazwarp923.unifieditems.proxy.CommonProxy")
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
	
	@Mod.EventHandler
    public void onMissingMapping(FMLMissingMappingsEvent event) {

        for (FMLMissingMappingsEvent.MissingMapping mapping : event.get()) {
            String resourcePath = mapping.resourceLocation.getResourcePath().toLowerCase();
            if (mapping.type == GameRegistry.Type.BLOCK) {
            	for(Material material : MaterialRegistry.ores) {
            		if (resourcePath.equals("ore" + material.name.toLowerCase())) {
                        mapping.remap(UIBlocks.metalOres.get(material));
                    }
            	}
            	for(Material material : MaterialRegistry.blocks) {
            		if (resourcePath.equals("block" + material.name.toLowerCase())) {
                        mapping.remap(UIBlocks.blocks.get(material));
                    }
            	}
            }
            
            else if (mapping.type == GameRegistry.Type.ITEM) {
            	if (resourcePath.equals("mortarAndPestle".toLowerCase())) {
                    mapping.remap(UIItems.mortarAndPestle);
                }
            	for(Material material : MaterialRegistry.ores) {
            		if (resourcePath.equals("ore" + material.name.toLowerCase())) {
                        mapping.remap(Item.getItemFromBlock(UIBlocks.metalOres.get(material)));
                    }
            	}
            	for(Material material : MaterialRegistry.blocks) {
            		if (resourcePath.equals("block" + material.name.toLowerCase())) {
                        mapping.remap(Item.getItemFromBlock(UIBlocks.blocks.get(material)));
                    }
            	}
            	for(Material material : MaterialRegistry.dusts) {
            		if (resourcePath.equals("dust" + material.name.toLowerCase())) {
                        mapping.remap(UIItems.dusts.get(material));
                    }
        		}
            	for(Material material : MaterialRegistry.ingots) {
        			if (resourcePath.equals("ingot" + material.name.toLowerCase())) {
                        mapping.remap(UIItems.ingots.get(material));
                    }
        		}
            	for(Material material : MaterialRegistry.nuggets) {
        			if (resourcePath.equals("nugget" + material.name.toLowerCase())) {
                        mapping.remap(UIItems.nuggets.get(material));
                    }
        		}
            	for(Material material : MaterialRegistry.gems) {
        			if (resourcePath.equals("gem" + material.name.toLowerCase())) {
                        mapping.remap(UIItems.gems.get(material));
                    }
        		}
            }
        }
    }
}
