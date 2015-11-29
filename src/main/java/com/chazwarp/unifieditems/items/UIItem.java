/**
@author Chaz Kerby
 */

package com.chazwarp.unifieditems.items;

import com.chazwarp.unifieditems.UniTab;
import com.chazwarp.unifieditems.lib.Reference;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class UIItem extends Item {

	private String name = "UIDefaultItem";
	
	protected UIItem(String unlocalizedName) {
		super();
		
		name = unlocalizedName;
		GameRegistry.registerItem(this, name);
		
		setCreativeTab(UniTab.tab);
		setUnlocalizedName(Reference.TEXTURE_LOC + "_" + unlocalizedName);
	}
	
	public String getName() {
		return name;
	}
}