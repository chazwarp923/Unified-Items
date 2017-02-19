/**
@author Chazwarp923
 */
package tech.chazwarp923.unifieditems.modular.module;

import java.util.Map;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLInterModComms;
import tech.chazwarp923.unifieditems.block.UIBlockGemOre;
import tech.chazwarp923.unifieditems.block.UIBlockMetalOre;
import tech.chazwarp923.unifieditems.block.UIBlocks;
import tech.chazwarp923.unifieditems.material.Material;
import tech.chazwarp923.unifieditems.modular.UIModule;

public class DenseOres extends UIModule {

	@Override
	public void init() {
		for(Map.Entry<Material, UIBlockMetalOre> oreBlock : UIBlocks.metalOres.entrySet()) {
			FMLInterModComms.sendMessage("denseores", "addDenseOreStone", new ItemStack((Block)oreBlock.getValue()));
		}
		for(Map.Entry<Material, UIBlockGemOre> oreBlock : UIBlocks.gemOres.entrySet()) {
			FMLInterModComms.sendMessage("denseores", "addDenseOreStone", new ItemStack((Block)oreBlock.getValue()));
		}
	}
}
