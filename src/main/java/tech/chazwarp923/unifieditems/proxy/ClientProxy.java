package tech.chazwarp923.unifieditems.proxy;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import tech.chazwarp923.unifieditems.block.UIBlocks;
import tech.chazwarp923.unifieditems.config.ConfigHandler;
import tech.chazwarp923.unifieditems.item.UIItems;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void preInit(FMLPreInitializationEvent preInitEvent) {
		super.preInit(preInitEvent);
		//Registers the config handler
		MinecraftForge.EVENT_BUS.register(new ConfigHandler());
		//Registers the models for the blocks and items
		UIBlocks.preInitClient();
		UIItems.preInitClient();
	}
}