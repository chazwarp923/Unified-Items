package tech.chazwarp923.unifieditems.crafting;

import java.util.Map;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import tech.chazwarp923.unifieditems.block.UIBlockOre;
import tech.chazwarp923.unifieditems.block.UIBlocks;
import tech.chazwarp923.unifieditems.item.UIItemDust;
import tech.chazwarp923.unifieditems.item.UIItems;

public class Smelting {

	public static void preInit() {

		// Smelting recipes for the Ores
		for(Map.Entry<String, UIBlockOre> block : UIBlocks.ores.entrySet()) {
			GameRegistry.addSmelting(block.getValue(), new ItemStack(UIItems.ingots.get(block.getKey())), 0.5f);
		}

		// Smelting recipes for the Dusts
		for(Map.Entry<String, UIItemDust> item : UIItems.dusts.entrySet()) {
			GameRegistry.addSmelting(new ItemStack(item.getValue()), new ItemStack(UIItems.ingots.get(item.getKey())), 0.5f);
		}
	}
}