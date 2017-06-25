/**
@author Chazwarp923
 */

package tech.chazwarp923.unifieditems.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

public class UIItemBlock extends ItemBlock {

	public UIItemBlock(Block block) {
		super(block);
		this.setRegistryName(block.getRegistryName());
		setHasSubtypes(true);
	}
}