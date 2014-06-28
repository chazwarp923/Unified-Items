package com.chazwarp.unifieditems.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

import com.chazwarp.unifieditems.UniTab;
import com.chazwarp.unifieditems.lib.ItemInfo;
import com.chazwarp.unifieditems.lib.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemDustTin extends Item {

        public ItemDustTin(int id) {
                super(id);
                setCreativeTab(UniTab.tab);
                setMaxStackSize(64);
                setUnlocalizedName(ItemInfo.DUST_TIN_UNLOCALIZED_NAME);
                
    	}
    	
        @Override
        @SideOnly(Side.CLIENT)
        public void registerIcons(IconRegister iconRegister) {

        	this.itemIcon = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + ItemInfo.DUST_TIN_UNLOCALIZED_NAME);
        }
}