package tech.chazwarp923.unifieditems.crafting;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import tech.chazwarp923.unifieditems.item.UIItems;

public class Shapeless {

	public static void preInit() {

		// Adds the recipe for bronze
		GameRegistry.addShapelessRecipe(new ItemStack(UIItems.ingots.get("Bronze"), 4), new ItemStack(UIItems.ingots.get("Copper")), new ItemStack(UIItems.ingots.get("Copper")), new ItemStack(UIItems.ingots.get("Copper")), new ItemStack(UIItems.ingots.get("Tin")));
		GameRegistry.addShapelessRecipe(new ItemStack(UIItems.dusts.get("Bronze"), 4), new ItemStack(UIItems.dusts.get("Copper")), new ItemStack(UIItems.dusts.get("Copper")), new ItemStack(UIItems.dusts.get("Copper")), new ItemStack(UIItems.dusts.get("Tin")));

		// Adds the recipes for all the storage blocks
		/*GameRegistry.addShapelessRecipe(new ItemStack(UIBlocks.blockCopper), new ItemStack(UIItems.ingotCopper), new ItemStack(UIItems.ingotCopper), new ItemStack(UIItems.ingotCopper), new ItemStack(UIItems.ingotCopper), new ItemStack(UIItems.ingotCopper), new ItemStack(UIItems.ingotCopper), new ItemStack(UIItems.ingotCopper), new ItemStack(UIItems.ingotCopper), new ItemStack(UIItems.ingotCopper));
		GameRegistry.addShapelessRecipe(new ItemStack(UIBlocks.blockTin), new ItemStack(UIItems.ingotTin), new ItemStack(UIItems.ingotTin), new ItemStack(UIItems.ingotTin), new ItemStack(UIItems.ingotTin), new ItemStack(UIItems.ingotTin), new ItemStack(UIItems.ingotTin), new ItemStack(UIItems.ingotTin), new ItemStack(UIItems.ingotTin), new ItemStack(UIItems.ingotTin));
		GameRegistry.addShapelessRecipe(new ItemStack(UIBlocks.blockBronze), new ItemStack(UIItems.ingotBronze), new ItemStack(UIItems.ingotBronze), new ItemStack(UIItems.ingotBronze), new ItemStack(UIItems.ingotBronze), new ItemStack(UIItems.ingotBronze), new ItemStack(UIItems.ingotBronze), new ItemStack(
						UIItems.ingotBronze), new ItemStack(
						UIItems.ingotBronze), new ItemStack(
						UIItems.ingotBronze));
		GameRegistry.addShapelessRecipe(new ItemStack(UIBlocks.blockSilver),
				new ItemStack(UIItems.ingotSilver), new ItemStack(
						UIItems.ingotSilver), new ItemStack(
						UIItems.ingotSilver), new ItemStack(
						UIItems.ingotSilver), new ItemStack(
						UIItems.ingotSilver), new ItemStack(
						UIItems.ingotSilver), new ItemStack(
						UIItems.ingotSilver), new ItemStack(
						UIItems.ingotSilver), new ItemStack(
						UIItems.ingotSilver));
		GameRegistry.addShapelessRecipe(new ItemStack(UIBlocks.blockLead),
				new ItemStack(UIItems.ingotLead), new ItemStack(
						UIItems.ingotLead), new ItemStack(UIItems.ingotLead),
				new ItemStack(UIItems.ingotLead), new ItemStack(
						UIItems.ingotLead), new ItemStack(UIItems.ingotLead),
				new ItemStack(UIItems.ingotLead), new ItemStack(
						UIItems.ingotLead), new ItemStack(UIItems.ingotLead));*/

		// Adds the recipe for the "Mortar And Pestle"
		GameRegistry.addShapelessRecipe(new ItemStack(UIItems.mortarAndPestle), new ItemStack(Items.BOWL), new ItemStack(Blocks.COBBLESTONE));

		// Adds a recipe for flint
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.FLINT, 1), new Object[] { "blockGravel","craftingMortarAndPestle" }));

		/*// Adds The Recipes for Ores to Dusts
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UIItems.dustIron, 2), new Object[] { "oreIron","craftingMortarAndPestle" }));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UIItems.dustGold, 2), new Object[] { "oreGold","craftingMortarAndPestle" }));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UIItems.dustCopper, 2), new Object[] { "oreCopper","craftingMortarAndPestle" }));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UIItems.dustTin, 2), new Object[] { "oreTin","craftingMortarAndPestle" }));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UIItems.dustSilver, 2), new Object[] { "oreSilver","craftingMortarAndPestle" }));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UIItems.dustLead, 2), new Object[] { "oreLead","craftingMortarAndPestle" }));
		*/
		// Miscellaneous Recipes
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.TORCH, 2), new Object[] { "stickWood","craftingFlintAndSteel" }));
	}
}