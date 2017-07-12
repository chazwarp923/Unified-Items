/**
@author Chazwarp923
*/
package tech.chazwarp923.unifieditems.event;

import java.util.Map;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;
import tech.chazwarp923.unifieditems.block.UIBlockGemOre;
import tech.chazwarp923.unifieditems.block.UIBlockMetalOre;
import tech.chazwarp923.unifieditems.block.UIBlockStorage;
import tech.chazwarp923.unifieditems.block.UIBlocks;
import tech.chazwarp923.unifieditems.crafting.RecipeRegistry;
import tech.chazwarp923.unifieditems.item.UIItemDust;
import tech.chazwarp923.unifieditems.item.UIItemGear;
import tech.chazwarp923.unifieditems.item.UIItemGem;
import tech.chazwarp923.unifieditems.item.UIItemIngot;
import tech.chazwarp923.unifieditems.item.UIItemNugget;
import tech.chazwarp923.unifieditems.item.UIItemPlate;
import tech.chazwarp923.unifieditems.item.UIItems;
import tech.chazwarp923.unifieditems.material.Material;

@Mod.EventBusSubscriber
public class RegistrationEventHandler { 
	/**
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		IForgeRegistry<Block> registry = event.getRegistry();
		
		//Register all the blocks
		for(Map.Entry<Material, UIBlockMetalOre> block : UIBlocks.metalOres.entrySet()) {
			//registry.register(block.getValue());
		}
		
		for(Map.Entry<Material, UIBlockGemOre> block : UIBlocks.gemOres.entrySet()) {
			//registry.register(block.getValue());
		}
		
		for(Map.Entry<Material, UIBlockStorage> block : UIBlocks.storageBlocks.entrySet()) {
			//registry.register(block.getValue());
		}
	}
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		IForgeRegistry<Item> registry = event.getRegistry();
		
		//Register all the itemblocks
		for(Map.Entry<Material, UIBlockMetalOre> block : UIBlocks.metalOres.entrySet()) {
			//registry.register(new UIItemBlock(block.getValue()));
		}
		
		for(Map.Entry<Material, UIBlockGemOre> block : UIBlocks.gemOres.entrySet()) {
			//registry.register(new UIItemBlock(block.getValue()));
		}
		
		for(Map.Entry<Material, UIBlockStorage> block : UIBlocks.storageBlocks.entrySet()) {
			//registry.register(new UIItemBlock(block.getValue()));
		}
		
		//Register all the items		
		//registry.register(UIItems.mortarAndPestle);
					
		for(Map.Entry<Material, UIItemDust> item : UIItems.dusts.entrySet()) {
			//registry.register(item.getValue());
		}
			
		for(Map.Entry<Material, UIItemIngot> item : UIItems.ingots.entrySet()) {
			//registry.register(item.getValue());
		}
				
		for(Map.Entry<Material, UIItemNugget> item : UIItems.nuggets.entrySet()) {
			//registry.register(item.getValue());
		}
				
		for(Map.Entry<Material, UIItemGem> item : UIItems.gems.entrySet()) {
			//registry.register(item.getValue());
		}
				
		for(Map.Entry<Material, UIItemPlate> item : UIItems.plates.entrySet()) {
			//registry.register(item.getValue());
		}
		
		for(Map.Entry<Material, UIItemGear> item : UIItems.gears.entrySet()) {
			//registry.register(item.getValue());
		}
	}
	
	@SubscribeEvent
	public void registerCrafting(RegistryEvent.Register<IRecipe> event) {
		IForgeRegistry<IRecipe> registry = event.getRegistry();
		
		//Register all the recipes
		if(registry.getRegistrySuperType().equals(IRecipe.class)) {
			for(IRecipe recipe : RecipeRegistry.getCraftingRecipes()) {
				//registry.register(recipe);
			}
		}
	}*/
}
