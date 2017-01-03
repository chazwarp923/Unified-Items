/**
@author Chaz Kerby
 */
package tech.chazwarp923.unifieditems;

import java.io.File;
import java.util.Map;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLMissingMappingsEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import tech.chazwarp923.unifieditems.block.UIBlockOre;
import tech.chazwarp923.unifieditems.block.UIBlockStorage;
import tech.chazwarp923.unifieditems.block.UIBlocks;
import tech.chazwarp923.unifieditems.item.UIItemDust;
import tech.chazwarp923.unifieditems.item.UIItemGem;
import tech.chazwarp923.unifieditems.item.UIItemIngot;
import tech.chazwarp923.unifieditems.item.UIItemNugget;
import tech.chazwarp923.unifieditems.item.UIItems;
import tech.chazwarp923.unifieditems.material.Material;
import tech.chazwarp923.unifieditems.proxy.CommonProxy;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, updateJSON = "http://chazwarp923.tech/UnifiedItems.json", acceptedMinecraftVersions = "[1.10.2],[1.11],[1.11.2]", guiFactory = "tech.chazwarp923.unifieditems.config.ConfigGuiFactory")
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
            String resourcePath = mapping.resourceLocation.getResourcePath();
            if (mapping.type == GameRegistry.Type.BLOCK) {
            	for(Map.Entry<Material, UIBlockOre> block : UIBlocks.ores.entrySet()) {
            		if (resourcePath.equals("ore" + block.getKey().name.toLowerCase())) {
                        mapping.remap(block.getValue());
                    }
            	}
            	for(Map.Entry<Material, UIBlockStorage> block : UIBlocks.blocks.entrySet()) {
            		if (resourcePath.equals("block" + block.getKey().name.toLowerCase())) {
                        mapping.remap(block.getValue());
                    }
            	}
            }
            
            else if (mapping.type == GameRegistry.Type.ITEM) {
            	if (resourcePath.equals("mortarAndPestle".toLowerCase())) {
                    mapping.remap(UIItems.mortarAndPestle);
                }
            	for(Map.Entry<Material, UIBlockOre> block : UIBlocks.ores.entrySet()) {
            		if (resourcePath.equals("ore" + block.getKey().name.toLowerCase())) {
                        mapping.remap(Item.getItemFromBlock(block.getValue()));
                    }
            	}
            	for(Map.Entry<Material, UIBlockStorage> block : UIBlocks.blocks.entrySet()) {
            		if (resourcePath.equals("block" + block.getKey().name.toLowerCase())) {
                        mapping.remap(Item.getItemFromBlock(block.getValue()));
                    }
            	}
            	for(Map.Entry<Material, UIItemDust> item : UIItems.dusts.entrySet()) {
            		if (resourcePath.equals("dust" + item.getKey().name.toLowerCase())) {
                        mapping.remap(item.getValue());
                    }
        		}
        		for(Map.Entry<Material, UIItemIngot> item : UIItems.ingots.entrySet()) {
        			if (resourcePath.equals("ingot" + item.getKey().name.toLowerCase())) {
                        mapping.remap(item.getValue());
                    }
        		}
        		for(Map.Entry<Material, UIItemNugget> item : UIItems.nuggets.entrySet()) {
        			if (resourcePath.equals("nugget" + item.getKey().name.toLowerCase())) {
                        mapping.remap(item.getValue());
                    }
        		}
        		for(Map.Entry<Material, UIItemGem> item : UIItems.gems.entrySet()) {
        			if (resourcePath.equals(resourcePath.equals("gem" + item.getKey().name.toLowerCase()))) {
                        mapping.remap(item.getValue());
                    }
        		}
            }
        }
    }
}
