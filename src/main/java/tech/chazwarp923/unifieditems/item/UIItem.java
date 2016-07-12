/**
@author Chaz Kerby
 */

package tech.chazwarp923.unifieditems.item;

import tech.chazwarp923.unifieditems.UniTab;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class UIItem extends Item {

	private String name = "UIDefaultItem";
	
	protected UIItem(String unlocalizedName) {
		super();
		
		setCreativeTab(UniTab.tab);
		setRegistryName(unlocalizedName);
		setUnlocalizedName("UnifiedItems" + unlocalizedName);
		name = unlocalizedName;
		
		GameRegistry.register(this);
	}
	
	public String getName() {
		return name;
	}
}