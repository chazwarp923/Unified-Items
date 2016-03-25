package tech.chazwarp923.unifieditems.proxy;

import tech.chazwarp923.unifieditems.config.ConfigHandler;
import tech.chazwarp923.unifieditems.render.RubberTapRenderer;
import tech.chazwarp923.unifieditems.tileentity.TileEntityRubberTap;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void preInit(FMLPreInitializationEvent preInitEvent) {
		super.preInit(preInitEvent);
		MinecraftForge.EVENT_BUS.register(new ConfigHandler());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityRubberTap.class, new RubberTapRenderer());
	}
}