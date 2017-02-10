/**
@author Chazwarp923
 */
package tech.chazwarp923.unifieditems.proxy;

import java.util.HashMap;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.fml.client.config.GuiConfigEntries;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import tech.chazwarp923.unifieditems.block.UIBlocks;
import tech.chazwarp923.unifieditems.event.OnConfigChangedEventHandler;
import tech.chazwarp923.unifieditems.item.UIItems;
import tech.chazwarp923.unifieditems.material.Material;
import tech.chazwarp923.unifieditems.material.MaterialRegistry;

public class ClientProxy extends CommonProxy {
	
	public static void configLoad(HashMap<Material, Property> minYProperties, HashMap<Material, Property> maxYProperties, HashMap<Material, Property> veinSizeOverrideProperties, HashMap<Material, Property> chunkDensityProperties, HashMap<Material, Property> manualOverrideProperties) {
		for(Material material : MaterialRegistry.ores) {
			minYProperties.get(material).setConfigEntryClass(GuiConfigEntries.NumberSliderEntry.class).setMinValue(0).setMaxValue(255);
			maxYProperties.get(material).setConfigEntryClass(GuiConfigEntries.NumberSliderEntry.class).setMinValue(0).setMaxValue(255);
			veinSizeOverrideProperties.get(material).setConfigEntryClass(GuiConfigEntries.NumberSliderEntry.class).setMinValue(-1).setMaxValue(64);
			chunkDensityProperties.get(material).setConfigEntryClass(GuiConfigEntries.NumberSliderEntry.class).setMinValue(0).setMaxValue(64);
		}
		
		for(Material material : MaterialRegistry.enabledMaterials.keySet()) {
			manualOverrideProperties.get(material).setConfigEntryClass(GuiConfigEntries.NumberSliderEntry.class).setMinValue(-1).setMaxValue(1);
		}
	}
	
	@Override
	public void preInit(FMLPreInitializationEvent preInitEvent) {
		super.preInit(preInitEvent);
		
		//Registers event handlers
		MinecraftForge.EVENT_BUS.register(new OnConfigChangedEventHandler());
		
		//Registers the models for the blocks and items
		UIBlocks.preInitClient();
		UIItems.preInitClient();
	}
	
	
}