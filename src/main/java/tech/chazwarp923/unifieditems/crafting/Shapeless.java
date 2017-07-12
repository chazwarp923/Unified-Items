package tech.chazwarp923.unifieditems.crafting;

import java.util.Arrays;
import java.util.Map;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import tech.chazwarp923.unifieditems.Reference;
import tech.chazwarp923.unifieditems.block.UIBlockMetalOre;
import tech.chazwarp923.unifieditems.block.UIBlockStorage;
import tech.chazwarp923.unifieditems.block.UIBlocks;
import tech.chazwarp923.unifieditems.config.ConfigHandler;
import tech.chazwarp923.unifieditems.crafting.irecipe.MortarAndPestleRecipe;
import tech.chazwarp923.unifieditems.crafting.irecipe.OreToDustRecipe;
import tech.chazwarp923.unifieditems.crafting.irecipe.TorchRecipe;
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
		
		for(Map.Entry<Material, UIBlockMetalOre> block : UIBlocks.metalOres.entrySet()) {
			RecipeRegistry.addMortarAndPestleRecipe(new OreToDustRecipe(block.getKey()));
		}
		
		//Adds the recipe for bronze dust
		if(ConfigHandler.general.get("bronzeCrafting")) {
			GameRegistry.addShapelessRecipe(new ResourceLocation(Reference.RESOURCE_PREFIX + Material.BRONZE.name + "dustToDustCrafting"), new ResourceLocation(Reference.RESOURCE_PREFIX + "dustToDust"), new ItemStack(UIItems.dusts.get(Material.BRONZE), 4), Ingredient.fromItem(UIItems.dusts.get(Material.COPPER)), Ingredient.fromItem(UIItems.dusts.get(Material.COPPER)), Ingredient.fromItem(UIItems.dusts.get(Material.COPPER)), Ingredient.fromItem(UIItems.dusts.get(Material.TIN)));
		}
		
		//Adds the recipes for ingots to nuggets
		for(Map.Entry<Material, UIItemIngot> item : UIItems.ingots.entrySet()) {
			GameRegistry.addShapelessRecipe(new ResourceLocation(Reference.RESOURCE_PREFIX + item.getKey().name + "ingotToNuggetsCrafting"), new ResourceLocation(Reference.RESOURCE_PREFIX + "ingotToNuggets"), new ItemStack((UIItems.nuggets.get(item.getKey())), 9), Ingredient.fromItem(item.getValue()));
		}
		
		//Adds the recipes for nuggets to ingots
		for(Map.Entry<Material, UIItemNugget> item : UIItems.nuggets.entrySet()) {
			Ingredient[] ingredients = new Ingredient[9];
			Arrays.fill(ingredients, Ingredient.fromItem(item.getValue()));
			GameRegistry.addShapelessRecipe(new ResourceLocation(Reference.RESOURCE_PREFIX + item.getKey().name + "nuggetsToIngotCrafting"), new ResourceLocation(Reference.RESOURCE_PREFIX + "nuggetsToIngot"), new ItemStack(UIItems.ingots.get(item.getKey())), ingredients);
		}
		
		//Adds the recipes for ingots to blocks
		for(Map.Entry<Material, UIItemIngot> item : UIItems.ingots.entrySet()) {
			Ingredient[] ingredients = new Ingredient[9];
			Arrays.fill(ingredients, Ingredient.fromItem(item.getValue()));
			GameRegistry.addShapelessRecipe(new ResourceLocation(Reference.RESOURCE_PREFIX + item.getKey().name + "ingotsToBlockCrafting"), new ResourceLocation(Reference.RESOURCE_PREFIX + "ingotsToBlock"), new ItemStack((UIBlocks.storageBlocks.get(item.getKey()))), ingredients);
		}
		
		//Adds the recipes for gems to blocks
		for(Map.Entry<Material, UIItemGem> item : UIItems.gems.entrySet()) {
			Ingredient[] ingredients = new Ingredient[9];
			Arrays.fill(ingredients, Ingredient.fromItem(item.getValue()));
			GameRegistry.addShapelessRecipe(new ResourceLocation(Reference.RESOURCE_PREFIX + item.getKey().name + "gemsToBlockCrafting"), new ResourceLocation(Reference.RESOURCE_PREFIX + "gemsToBlock"), new ItemStack((UIBlocks.storageBlocks.get(item.getKey()))), ingredients);
		}
		
		//Adds the recipes for blocks to ingots and gems
		for(Map.Entry<Material, UIBlockStorage> block : UIBlocks.storageBlocks.entrySet()) {
			if(block.getKey().type == MaterialType.GENERIC) {
				GameRegistry.addShapelessRecipe(new ResourceLocation(Reference.RESOURCE_PREFIX + block.getKey().name + "blockToIngotsCrafting"), new ResourceLocation(Reference.RESOURCE_PREFIX + "blockToIngots"), new ItemStack((UIItems.ingots.get(block.getKey())), 9), Ingredient.fromItem(Item.getItemFromBlock(block.getValue())));
			}
			else if(block.getKey().type == MaterialType.GENERIC_GEM) {
				GameRegistry.addShapelessRecipe(new ResourceLocation(Reference.RESOURCE_PREFIX + block.getKey().name + "blockToGemsCrafting"), new ResourceLocation(Reference.RESOURCE_PREFIX + "blockToGems"), new ItemStack((UIItems.gems.get(block.getKey())), 9), Ingredient.fromItem(Item.getItemFromBlock(block.getValue())));
			}
		}

		//Adds the recipe for the "Mortar and Pestle"
		GameRegistry.addShapelessRecipe(new ResourceLocation(Reference.RESOURCE_PREFIX + UIItems.mortarAndPestle.getUnlocalizedName() + "Crafting"), new ResourceLocation(Reference.RESOURCE_PREFIX + "general"), new ItemStack(UIItems.mortarAndPestle), Ingredient.fromItem(Items.BOWL), Ingredient.fromItem(Item.getItemFromBlock(Blocks.COBBLESTONE)));
		
		//Adds a recipe for flint
		RecipeRegistry.addMortarAndPestleRecipe(new MortarAndPestleRecipe(new ItemStack(Blocks.GRAVEL), new ItemStack(Items.FLINT, 1)));
		
		//Adds the recipes that use the mortar and pestle
		for(MortarAndPestleRecipe recipe : RecipeRegistry.getMortarAndPestleRecipes()) {
			//GameRegistry.addRecipe(recipe);
			ForgeRegistries.RECIPES.register(recipe);
		}
		
		//Miscellaneous recipes
		//GameRegistry.addRecipe(new TorchRecipe());
		ForgeRegistries.RECIPES.register(new TorchRecipe());
	}
}