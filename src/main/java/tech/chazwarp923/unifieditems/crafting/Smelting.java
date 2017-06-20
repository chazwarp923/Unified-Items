package tech.chazwarp923.unifieditems.crafting;

import java.util.Map;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import tech.chazwarp923.unifieditems.block.UIBlockGemOre;
import tech.chazwarp923.unifieditems.block.UIBlockMetalOre;
import tech.chazwarp923.unifieditems.block.UIBlocks;
import tech.chazwarp923.unifieditems.config.ConfigHandler;
import tech.chazwarp923.unifieditems.item.UIItemDust;
import tech.chazwarp923.unifieditems.item.UIItemIngot;
import tech.chazwarp923.unifieditems.item.UIItems;
import tech.chazwarp923.unifieditems.material.Material;

public class Smelting {

	public static void init() {

		// Smelting recipes for the Ores
		for(Map.Entry<Material, UIBlockMetalOre> block : UIBlocks.metalOres.entrySet()) {
			GameRegistry.addSmelting(block.getValue(), new ItemStack(UIItems.ingots.get(block.getKey())), 0.5f);
		}
		
		for(Map.Entry<Material, UIBlockGemOre> block : UIBlocks.gemOres.entrySet()) {
			GameRegistry.addSmelting(block.getValue(), new ItemStack(UIItems.gems.get(block.getKey())), 0.5f);
		}
		
		//Adds the recipes for other mods' ingots into my ingots
		if(ConfigHandler.general.get("furnaceConvert")) {
			for(Map.Entry<Material, UIItemIngot> ingot : UIItems.ingots.entrySet()) {
				for(ItemStack stack : OreDictionary.getOres("ingot" + ingot.getKey().toString())) {
					GameRegistry.addSmelting(stack, new ItemStack(ingot.getValue()), 0.0f);
				}
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