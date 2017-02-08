/**
@author Chazwarp923
 */
package tech.chazwarp923.unifieditems.proxy;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import tech.chazwarp923.unifieditems.block.UIBlocks;
import tech.chazwarp923.unifieditems.event.OnConfigChangedEventHandler;
import tech.chazwarp923.unifieditems.item.UIItems;

public class ClientProxy extends CommonProxy {
	
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