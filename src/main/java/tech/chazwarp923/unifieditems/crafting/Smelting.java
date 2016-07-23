package tech.chazwarp923.unifieditems.crafting;

import java.util.Map;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import tech.chazwarp923.unifieditems.block.UIBlockOre;
import tech.chazwarp923.unifieditems.block.UIBlocks;
import tech.chazwarp923.unifieditems.item.UIItemDust;
import tech.chazwarp923.unifieditems.item.UIItemIngot;
import tech.chazwarp923.unifieditems.item.UIItems;
import tech.chazwarp923.unifieditems.material.MaterialRegistry;

public class Smelting {

	public static void init() {

		// Smelting recipes for the Ores
		for(Map.Entry<MaterialRegistry, UIBlockOre> block : UIBlocks.ores.entrySet()) {
			GameRegistry.addSmelting(block.getValue(), new ItemStack(UIItems.ingots.get(block.getKey())), 0.5f);
		}
		
		//Adds the recipes for other mods' ingots into my ingots
		for(Map.Entry<MaterialRegistry, UIItemIngot> ingot : UIItems.ingots.entrySet()) {
			for(ItemStack stack : OreDictionary.getOres("ingot" + ingot.getKey().toString())) {
				GameRegistry.addSmelting(stack, new ItemStack(ingot.getValue()), 0.0f);
			}
		}

		// Smelting recipes for the Dusts
		GameRegistry.addSmelting(UIItems.dusts.get(MaterialRegistry.IRON), new ItemStack(Items.IRON_INGOT), 0.0f);
		GameRegistry.addSmelting(UIItems.dusts.get(MaterialRegistry.GOLD), new ItemStack(Items.GOLD_INGOT), 0.0f);
		for(Map.Entry<MaterialRegistry, UIItemDust> item : UIItems.dusts.entrySet()) {
			UIItemIngot ingot = UIItems.ingots.get(item.getKey());
			if(ingot != null) {
				GameRegistry.addSmelting(item.getValue(), new ItemStack(UIItems.ingots.get(item.getKey())), 0.0f);
			}
		}
	}
}