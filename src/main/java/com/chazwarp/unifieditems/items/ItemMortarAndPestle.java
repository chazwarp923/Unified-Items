package com.chazwarp.unifieditems.items;

import com.chazwarp.unifieditems.lib.ItemInfo;

public class ItemMortarAndPestle extends ItemUI {

	public ItemMortarAndPestle() {
		super(ItemInfo.MORTAR_AND_PESTLE_UNLOCALIZED_NAME);
        setMaxStackSize(1);
        setMaxDamage(4);                
    }
}