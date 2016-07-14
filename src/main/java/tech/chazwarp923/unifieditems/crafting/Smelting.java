package tech.chazwarp923.unifieditems.crafting;

import java.util.Map;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import tech.chazwarp923.unifieditems.block.UIBlockOre;
import tech.chazwarp923.unifieditems.block.UIBlocks;
import tech.chazwarp923.unifieditems.item.UIItemDust;
import tech.chazwarp923.unifieditems.item.UIItemIngot;
import tech.chazwarp923.unifieditems.item.UIItems;

public class Smelting {

	public static void init() {

		// Smelting recipes for the Ores
		for(Map.Entry<String, UIBlockOre> block : UIBlocks.ores.entrySet()) {
			GameRegistry.addSmelting(block.getValue(), new ItemStack(UIItems.ingots.get(block.getKey())), 0.5f);
		}

		// Smelting recipes for the Dusts
		GameRegistry.addSmelting(UIItems.dusts.get("Iron"), new ItemStack(Items.IRON_INGOT), 0.5f);
		GameRegistry.addSmelting(UIItems.dusts.get("Gold"), new ItemStack(Items.GOLD_INGOT), 0.5f);
		for(Map.Entry<String, UIItemDust> item : UIItems.dusts.entrySet()) {
			UIItemIngot ingot = UIItems.ingots.get(item.getKey());
			if(ingot != null) {
				GameRegistry.addSmelting(item.getValue(), new ItemStack(UIItems.ingots.get(item.getKey())), 0.5f);
			}
		}
	}
}