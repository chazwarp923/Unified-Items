/**
@author Chazwarp923
*/
package tech.chazwarp923.unifieditems.event;

import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import tech.chazwarp923.unifieditems.Reference;
import tech.chazwarp923.unifieditems.config.ConfigHandler;

@Mod.EventBusSubscriber(Side.CLIENT)
public class OnConfigChangedEventHandler {
	@SubscribeEvent
	public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent configChangedEvent) {
		if (configChangedEvent.getModID().equals(Reference.MOD_ID))
			ConfigHandler.saveGUIValuesToDisk();
	}
}
