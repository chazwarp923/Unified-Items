/**
@author Chaz Kerby
 */
package tech.chazwarp923.unifieditems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import tech.chazwarp923.unifieditems.item.UIItems;
import tech.chazwarp923.unifieditems.material.MaterialRegistry;

public class UnifiedItemsTab extends CreativeTabs {
	public static final UnifiedItemsTab tab = new UnifiedItemsTab();

	public UnifiedItemsTab() {
		super(Reference.MOD_ID);
		setBackgroundImageName("item_search.png");
	}

	@Override
	public boolean hasSearchBar() {
		return true;
	}

	@Override
	public Item getTabIconItem() {
		return UIItems.dusts.get(MaterialRegistry.IRON);
	}
}