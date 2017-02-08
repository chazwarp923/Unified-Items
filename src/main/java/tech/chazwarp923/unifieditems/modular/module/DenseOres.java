/**
@author Chazwarp923
 */
package tech.chazwarp923.unifieditems.modular.module;

import java.util.Map;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLInterModComms;
import tech.chazwarp923.unifieditems.block.UIBlockOre;
import tech.chazwarp923.unifieditems.block.UIBlocks;
import tech.chazwarp923.unifieditems.material.Material;
import tech.chazwarp923.unifieditems.modular.UIModule;

public class DenseOres extends UIModule {

	@Override
	public void init() {
		for(Map.Entry<Material, UIBlockOre> oreBlock : UIBlocks.ores.entrySet()) {
			FMLInterModComms.sendMessage("denseores", "addDenseOreStone", new ItemStack((Block)oreBlock.getValue()));
		}
	}
}
