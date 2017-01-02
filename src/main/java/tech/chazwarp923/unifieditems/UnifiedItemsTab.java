/**
@author Chaz Kerby
 */
package tech.chazwarp923.unifieditems;

import mcjty.lib.compat.CompatCreativeTabs;
import net.minecraft.item.Item;
import tech.chazwarp923.unifieditems.item.UIItems;
import tech.chazwarp923.unifieditems.material.Material;

public class UnifiedItemsTab extends CompatCreativeTabs {
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
	protected Item getItem() {
		return UIItems.dusts.get(Material.IRON);
	}
}