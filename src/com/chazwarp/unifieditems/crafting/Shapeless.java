package com.chazwarp.unifieditems.crafting;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import com.chazwarp.unifieditems.blocks.Blocks;
import com.chazwarp.unifieditems.items.Items;

import cpw.mods.fml.common.registry.GameRegistry;

public class Shapeless {

	public static void addCrafting() {
		
	//GameRegistry.addShapelessRecipe(new ItemStack(result, amount), Object... recipe);
		
	//Adds the recipe for bronze
	GameRegistry.addShapelessRecipe(new ItemStack(Items.ingotBronze, 4), new ItemStack(Items.ingotCopper),new ItemStack(Items.ingotCopper),new ItemStack(Items.ingotCopper), new ItemStack(Items.ingotTin));
	
	//Adds the recipes for all the storage blocks
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.blockCopper), new ItemStack(Items.ingotCopper),new ItemStack(Items.ingotCopper),new ItemStack(Items.ingotCopper), new ItemStack(Items.ingotCopper),new ItemStack(Items.ingotCopper),new ItemStack(Items.ingotCopper), new ItemStack(Items.ingotCopper),new ItemStack(Items.ingotCopper),new ItemStack(Items.ingotCopper));
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.blockTin), new ItemStack(Items.ingotTin),new ItemStack(Items.ingotTin),new ItemStack(Items.ingotTin), new ItemStack(Items.ingotTin),new ItemStack(Items.ingotTin),new ItemStack(Items.ingotTin), new ItemStack(Items.ingotTin),new ItemStack(Items.ingotTin),new ItemStack(Items.ingotTin));
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.blockBronze), new ItemStack(Items.ingotBronze),new ItemStack(Items.ingotBronze),new ItemStack(Items.ingotBronze), new ItemStack(Items.ingotBronze),new ItemStack(Items.ingotBronze),new ItemStack(Items.ingotBronze), new ItemStack(Items.ingotBronze),new ItemStack(Items.ingotBronze),new ItemStack(Items.ingotBronze));
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.blockSilver), new ItemStack(Items.ingotSilver),new ItemStack(Items.ingotSilver),new ItemStack(Items.ingotSilver), new ItemStack(Items.ingotSilver),new ItemStack(Items.ingotSilver),new ItemStack(Items.ingotSilver), new ItemStack(Items.ingotSilver),new ItemStack(Items.ingotSilver),new ItemStack(Items.ingotSilver));	
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.blockLead), new ItemStack(Items.ingotLead),new ItemStack(Items.ingotLead),new ItemStack(Items.ingotLead), new ItemStack(Items.ingotLead),new ItemStack(Items.ingotLead),new ItemStack(Items.ingotLead), new ItemStack(Items.ingotLead),new ItemStack(Items.ingotLead),new ItemStack(Items.ingotLead));
	
	//Adds the recipe for the One Time Pulverize
	GameRegistry.addShapelessRecipe(new ItemStack(Items.singlePul), new ItemStack(Item.flint), new ItemStack(Item.flint));
	
	//Adds a recipe for flint
	GameRegistry.addShapelessRecipe(new ItemStack(Item.flint), new ItemStack(Block.cobblestone), new ItemStack(Block.gravel));
	
	//Adds The Recipes for Ores to Dusts
	GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.dustIron, 2), new Object[] {"oreIron", "craftingSinglePul"}));
	GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.dustGold, 2), new Object[] {"oreGold", "craftingSinglePul"}));
	GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.dustCopper, 2), new Object[] {"oreCopper", "craftingSinglePul"}));
	GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.dustTin, 2), new Object[] {"oreTin", "craftingSinglePul"}));
	GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.dustSilver, 2), new Object[] {"oreSilver", "craftingSinglePul"}));
	GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.dustLead, 2), new Object[] {"oreLead", "craftingSinglePul"}));
	
	//Miscellaneous Recipes
	for(int i = 0; i < Item.flintAndSteel.getMaxDamage(); i++) {
		GameRegistry.addShapelessRecipe(new ItemStack(Block.torchWood), new ItemStack(Item.stick), new ItemStack(Item.flintAndSteel, 1, i));
	}
	
	}

}
