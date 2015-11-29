package com.chazwarp.unifieditems.client;

import com.chazwarp.unifieditems.CommonProxy;
import com.chazwarp.unifieditems.render.RubberTapRenderer;
import com.chazwarp.unifieditems.tileentity.TileEntityRubberTap;

import net.minecraftforge.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void registerRenderers() {
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityRubberTap.class, new RubberTapRenderer());
	}
}