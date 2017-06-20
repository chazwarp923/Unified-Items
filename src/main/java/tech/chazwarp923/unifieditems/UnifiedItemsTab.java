/**
@author Chazwarp923
 */
package tech.chazwarp923.unifieditems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import tech.chazwarp923.unifieditems.item.UIItems;
import tech.chazwarp923.unifieditems.material.Material;

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
	public ItemStack getTabIconItem() {
		return new ItemStack(UIItems.dusts.get(Material.IRON));
	}
}