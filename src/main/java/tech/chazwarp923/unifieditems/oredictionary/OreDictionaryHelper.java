package tech.chazwarp923.unifieditems.oredictionary;

import tech.chazwarp923.unifieditems.item.UIItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryHelper {

	public static void init() {
		for(int i=0; i < 4; i++)
		OreDictionary.registerOre("craftingMortarAndPestle", new ItemStack(UIItems.mortarAndPestle, 1, i));
		
		OreDictionary.registerOre("blockGravel", new ItemStack(Blocks.GRAVEL));
		
		for (int i = 0; i < new ItemStack(Items.FLINT_AND_STEEL).getMaxDamage(); i++)
		OreDictionary.registerOre("craftingFlintAndSteel", new ItemStack(Items.FLINT_AND_STEEL, 1, i));
	}
}