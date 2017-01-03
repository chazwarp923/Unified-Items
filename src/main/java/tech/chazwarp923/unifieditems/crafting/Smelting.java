package tech.chazwarp923.unifieditems.crafting;

import java.util.Map;

import mcjty.lib.tools.ItemStackTools;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import tech.chazwarp923.unifieditems.block.UIBlockOre;
import tech.chazwarp923.unifieditems.block.UIBlocks;
import tech.chazwarp923.unifieditems.item.UIItemDust;
import tech.chazwarp923.unifieditems.item.UIItemIngot;
import tech.chazwarp923.unifieditems.item.UIItems;
import tech.chazwarp923.unifieditems.material.Material;
import tech.chazwarp923.unifieditems.material.MaterialType;

public class Smelting {

	public static void init() {

		// Smelting recipes for the Ores
		for(Map.Entry<Material, UIBlockOre> block : UIBlocks.ores.entrySet()) {
			if(block.getKey().type == MaterialType.GENERIC) {
				GameRegistry.addSmelting(block.getValue(), new ItemStack(UIItems.ingots.get(block.getKey())), 0.5f);
			}
			else if(block.getKey().type == MaterialType.GENERIC_GEM) {
				GameRegistry.addSmelting(block.getValue(), new ItemStack(UIItems.gems.get(block.getKey())), 0.5f);
			}
		}
		
		//Adds the recipes for other mods' ingots into my ingots
		for(Map.Entry<Material, UIItemIngot> ingot : UIItems.ingots.entrySet()) {
			for(ItemStack stack : ItemStackTools.getOres("ingot" + ingot.getKey().toString())) {
				GameRegistry.addSmelting(stack, new ItemStack(ingot.getValue()), 0.0f);
			}
		}

		// Smelting recipes for the Dusts
		GameRegistry.addSmelting(UIItems.dusts.get(Material.IRON), new ItemStack(Items.IRON_INGOT), 0.0f);
		GameRegistry.addSmelting(UIItems.dusts.get(Material.GOLD), new ItemStack(Items.GOLD_INGOT), 0.0f);
		for(Map.Entry<Material, UIItemDust> item : UIItems.dusts.entrySet()) {
			UIItemIngot ingot = UIItems.ingots.get(item.getKey());
			if(ingot != null) {
				GameRegistry.addSmelting(item.getValue(), new ItemStack(UIItems.ingots.get(item.getKey())), 0.0f);
			}
		}
	}
}