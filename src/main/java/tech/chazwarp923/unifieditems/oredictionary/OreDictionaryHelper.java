package tech.chazwarp923.unifieditems.oredictionary;

import tech.chazwarp923.unifieditems.item.UIItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryHelper {

	public static void init() {
		OreDictionary.registerOre("itemRawRubber", new ItemStack(UIItems.rawRubber));
		OreDictionary.registerOre("itemRubber", new ItemStack(UIItems.ingotRubber));
		OreDictionary.registerOre("ingotRubber", new ItemStack(UIItems.ingotRubber));
		
		OreDictionary.registerOre("craftingMortarAndPestle", new ItemStack(UIItems.mortarAndPestle, 1, 0));
		OreDictionary.registerOre("craftingMortarAndPestle", new ItemStack(UIItems.mortarAndPestle, 1, 1));
		OreDictionary.registerOre("craftingMortarAndPestle", new ItemStack(UIItems.mortarAndPestle, 1, 2));
		OreDictionary.registerOre("craftingMortarAndPestle", new ItemStack(UIItems.mortarAndPestle, 1, 3));
		OreDictionary.registerOre("blockGravel", new ItemStack(Blocks.gravel));
		
		for (int i = 0; i < new ItemStack(Items.flint_and_steel).getMaxDamage(); i++)
		OreDictionary.registerOre("craftingFlintAndSteel", new ItemStack(Items.flint_and_steel, 1, i));
	}
}