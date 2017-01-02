package tech.chazwarp923.unifieditems;

import java.util.Map;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLMissingMappingsEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import tech.chazwarp923.unifieditems.block.UIBlockOre;
import tech.chazwarp923.unifieditems.block.UIBlockStorage;
import tech.chazwarp923.unifieditems.block.UIBlocks;
import tech.chazwarp923.unifieditems.item.UIItemDust;
import tech.chazwarp923.unifieditems.item.UIItemGem;
import tech.chazwarp923.unifieditems.item.UIItemIngot;
import tech.chazwarp923.unifieditems.item.UIItemNugget;
import tech.chazwarp923.unifieditems.item.UIItems;
import tech.chazwarp923.unifieditems.material.Material;

public class VersionTransition {

	@Mod.EventHandler
    public void onMissingMapping(FMLMissingMappingsEvent event) {

        for (FMLMissingMappingsEvent.MissingMapping mapping : event.get()) {
            String resourcePath = mapping.resourceLocation.getResourcePath().toLowerCase();
            if (mapping.type == GameRegistry.Type.BLOCK) {
            	for(Map.Entry<Material, UIBlockOre> block : UIBlocks.ores.entrySet()) {
            		if (resourcePath.equals(block.getValue().getRegistryName())) {
                        mapping.remap((Block)block);
                    }
            	}
            	for(Map.Entry<Material, UIBlockStorage> block : UIBlocks.blocks.entrySet()) {
            		if (resourcePath.equals(block.getValue().getRegistryName())) {
                        mapping.remap((Block)block);
                    }
            	}
            } 
            else if (mapping.type == GameRegistry.Type.ITEM) {
            	for(Map.Entry<Material, UIBlockOre> block : UIBlocks.ores.entrySet()) {
            		if (resourcePath.equals(block.getValue().getRegistryName())) {
                        mapping.remap(Item.getItemFromBlock((Block)block));
                    }
            	}
            	for(Map.Entry<Material, UIBlockStorage> block : UIBlocks.blocks.entrySet()) {
            		if (resourcePath.equals(block.getValue().getRegistryName())) {
                        mapping.remap(Item.getItemFromBlock((Block)block));
                    }
            	}
            	for(Map.Entry<Material, UIItemDust> item : UIItems.dusts.entrySet()) {
            		if (resourcePath.equals(item.getValue().getRegistryName())) {
                        mapping.remap((Item)item);
                    }
        		}
        		for(Map.Entry<Material, UIItemIngot> item : UIItems.ingots.entrySet()) {
        			if (resourcePath.equals(item.getValue().getRegistryName())) {
                        mapping.remap((Item)item);
                    }
        		}
        		for(Map.Entry<Material, UIItemNugget> item : UIItems.nuggets.entrySet()) {
        			if (resourcePath.equals(item.getValue().getRegistryName())) {
                        mapping.remap((Item)item);
                    }
        		}
        		for(Map.Entry<Material, UIItemGem> item : UIItems.gems.entrySet()) {
        			if (resourcePath.equals(item.getValue().getRegistryName())) {
                        mapping.remap((Item)item);
                    }
        		}
            }
        }
    }
}
