package tech.chazwarp923.unifieditems.crafting;

import java.util.Map;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import tech.chazwarp923.unifieditems.block.UIBlockMetalOre;
import tech.chazwarp923.unifieditems.block.UIBlockStorage;
import tech.chazwarp923.unifieditems.block.UIBlocks;
import tech.chazwarp923.unifieditems.crafting.irecipe.MortarAndPestleRecipe;
import tech.chazwarp923.unifieditems.crafting.irecipe.OreToDustRecipe;
import tech.chazwarp923.unifieditems.crafting.irecipe.TorchRecipe;
import tech.chazwarp923.unifieditems.item.UIItemGem;
import tech.chazwarp923.unifieditems.item.UIItemIngot;
import tech.chazwarp923.unifieditems.item.UIItemNugget;
import tech.chazwarp923.unifieditems.item.UIItems;
import tech.chazwarp923.unifieditems.material.Material;
import tech.chazwarp923.unifieditems.material.MaterialType;
import tech.chazwarp923.unifieditems.tools.RecipeJsonHelper;

public class Shapeless {

	public static void init() {
		
		RecipeRegistry.addMortarAndPestleRecipe(new OreToDustRecipe(new ItemStack(Blocks.IRON_ORE), new ItemStack(UIItems.dusts.get(Material.IRON), 2)));
		RecipeRegistry.addMortarAndPestleRecipe(new OreToDustRecipe(new ItemStack(Blocks.GOLD_ORE), new ItemStack(UIItems.dusts.get(Material.GOLD), 2)));
		RecipeRegistry.addMortarAndPestleRecipe(new OreToDustRecipe(new ItemStack(Blocks.OBSIDIAN), new ItemStack(UIItems.dusts.get(Material.OBSIDIAN), 4)));
		
		for(Map.Entry<Material, UIBlockMetalOre> block : UIBlocks.metalOres.entrySet()) {
			RecipeRegistry.addMortarAndPestleRecipe(new OreToDustRecipe(block.getKey()));
		}
		
		//Adds the recipes for ingots to nuggets
		for(Map.Entry<Material, UIItemIngot> item : UIItems.ingots.entrySet()) {
			RecipeJsonHelper.addShapelessRecipe(new ItemStack(UIItems.nuggets.get(item.getKey()), 9), new ItemStack(item.getValue()));
		}
		
		//Adds the recipes for nuggets to ingots
		for(Map.Entry<Material, UIItemNugget> item : UIItems.nuggets.entrySet()) {
			RecipeJsonHelper.addShapelessRecipe(new ItemStack(UIItems.ingots.get(item.getKey())), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()));
		}
		
		//Adds the recipes for ingots to blocks
		for(Map.Entry<Material, UIItemIngot> item : UIItems.ingots.entrySet()) {
			RecipeJsonHelper.addShapelessRecipe(new ItemStack(UIBlocks.storageBlocks.get(item.getKey())), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()));
		}
		
		//Adds the recipes for gems to blocks
		for(Map.Entry<Material, UIItemGem> item : UIItems.gems.entrySet()) {
			RecipeJsonHelper.addShapelessRecipe(new ItemStack(UIBlocks.storageBlocks.get(item.getKey())), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()), new ItemStack(item.getValue()));
		}
		
		//Adds the recipes for blocks to ingots and gems
		for(Map.Entry<Material, UIBlockStorage> block : UIBlocks.storageBlocks.entrySet()) {
			if(block.getKey().type == MaterialType.GENERIC || block.getKey().type == MaterialType.ALLOY) {
				RecipeJsonHelper.addShapelessRecipe(new ItemStack(UIItems.ingots.get(block.getKey()), 9), new ItemStack(block.getValue()));
			}
			else if(block.getKey().type == MaterialType.GENERIC_GEM) {
				RecipeJsonHelper.addShapelessRecipe(new ItemStack(UIItems.gems.get(block.getKey()), 9), new ItemStack(block.getValue()));
			}
		}

		//Adds the recipe for the "Mortar and Pestle"
		//RecipeJsonHelper.addShapelessRecipe(new ItemStack(UIItems.mortarAndPestle), new ItemStack(Items.BOWL), new ItemStack(Blocks.COBBLESTONE));
		
		//Adds a recipe for flint
		RecipeRegistry.addMortarAndPestleRecipe(new MortarAndPestleRecipe(new ItemStack(Blocks.GRAVEL), new ItemStack(Items.FLINT, 1)));
		
		//Adds the recipes that use the mortar and pestle
		for(MortarAndPestleRecipe recipe : RecipeRegistry.getMortarAndPestleRecipes()) {
			ForgeRegistries.RECIPES.register(recipe);
		}
		
		//Miscellaneous recipes
		//GameRegistry.addRecipe(new TorchRecipe());
		ForgeRegistries.RECIPES.register(new TorchRecipe());
	}
}