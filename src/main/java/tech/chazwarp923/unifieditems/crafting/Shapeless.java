package tech.chazwarp923.unifieditems.crafting;

import java.util.Map;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import tech.chazwarp923.unifieditems.block.UIBlockOre;
import tech.chazwarp923.unifieditems.block.UIBlockStorage;
import tech.chazwarp923.unifieditems.block.UIBlocks;
import tech.chazwarp923.unifieditems.crafting.IRecipe.MortarAndPestleRecipe;
import tech.chazwarp923.unifieditems.crafting.IRecipe.OreToDustRecipe;
import tech.chazwarp923.unifieditems.crafting.IRecipe.TorchRecipe;
import tech.chazwarp923.unifieditems.item.UIItemGem;
import tech.chazwarp923.unifieditems.item.UIItemIngot;
import tech.chazwarp923.unifieditems.item.UIItemNugget;
import tech.chazwarp923.unifieditems.item.UIItems;
import tech.chazwarp923.unifieditems.material.Material;
import tech.chazwarp923.unifieditems.material.MaterialType;

public class Shapeless {

	public static void init() {
		
		RecipeRegistry.addMortarAndPestleRecipe(new OreToDustRecipe(new ItemStack(Blocks.IRON_ORE), new ItemStack(UIItems.dusts.get(Material.IRON), 2)));
		RecipeRegistry.addMortarAndPestleRecipe(new OreToDustRecipe(new ItemStack(Blocks.GOLD_ORE), new ItemStack(UIItems.dusts.get(Material.GOLD), 2)));
		
		for(Map.Entry<Material, UIBlockOre> block : UIBlocks.ores.entrySet()) {
			RecipeRegistry.addMortarAndPestleRecipe(new OreToDustRecipe(block.getKey()));
		}
		
		//Adds the recipe for bronze dust
		GameRegistry.addShapelessRecipe(new ItemStack(UIItems.dusts.get(Material.BRONZE), 4), new ItemStack(UIItems.dusts.get(Material.COPPER)), new ItemStack(UIItems.dusts.get(Material.COPPER)), new ItemStack(UIItems.dusts.get(Material.COPPER)), new ItemStack(UIItems.dusts.get(Material.TIN)));

		//Adds the recipes for ingots to nuggets
		for(Map.Entry<Material, UIItemIngot> item : UIItems.ingots.entrySet()) {
			GameRegistry.addShapelessRecipe(new ItemStack(UIItems.nuggets.get(item.getKey()), 9), new ItemStack(item.getValue()));
		}
		
		//Adds the recipes for nuggets to ingots
		for(Map.Entry<Material, UIItemNugget> item : UIItems.nuggets.entrySet()) {
			GameRegistry.addShapelessRecipe(new ItemStack(UIItems.ingots.get(item.getKey())), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()));
		}
		
		//Adds the recipes for ingots to blocks
		for(Map.Entry<Material, UIItemIngot> item : UIItems.ingots.entrySet()) {
			GameRegistry.addShapelessRecipe(new ItemStack(UIBlocks.blocks.get(item.getKey())), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()));
		}
		
		//Adds the recipes for gems to blocks
		for(Map.Entry<Material, UIItemGem> item : UIItems.gems.entrySet()) {
			GameRegistry.addShapelessRecipe(new ItemStack(UIBlocks.blocks.get(item.getKey())), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()));
		}
		
		//Adds the recipes for blocks to ingots and gems
		for(Map.Entry<Material, UIBlockStorage> block : UIBlocks.blocks.entrySet()) {
			if(block.getKey().type == MaterialType.GENERIC) {
				GameRegistry.addShapelessRecipe(new ItemStack(UIItems.ingots.get(block.getKey()), 9), new ItemStack(block.getValue()));
			}
			else if(block.getKey().type == MaterialType.GENERIC_GEM) {
				GameRegistry.addShapelessRecipe(new ItemStack(UIItems.gems.get(block.getKey()), 9), new ItemStack(UIBlocks.blocks.get(block.getKey())));
			}
		}

		//Adds the recipe for the "Mortar and Pestle"
		GameRegistry.addShapelessRecipe(new ItemStack(UIItems.mortarAndPestle), new ItemStack(Items.BOWL), new ItemStack(Blocks.COBBLESTONE));

		//Adds a recipe for flint
		RecipeRegistry.addMortarAndPestleRecipe(new MortarAndPestleRecipe(new ItemStack(Blocks.GRAVEL), new ItemStack(Items.FLINT, 1)));
		
		//Adds the recipes that use the mortar and pestle
		for(MortarAndPestleRecipe recipe : RecipeRegistry.getMortarAndPestleRecipes()) {
			GameRegistry.addRecipe(recipe);
		}
		
		//Miscellaneous recipes
		GameRegistry.addRecipe(new TorchRecipe());
	}
}