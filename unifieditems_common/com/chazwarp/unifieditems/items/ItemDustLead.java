package com.chazwarp.unifieditems.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.chazwarp.unifieditems.lib.ItemInfo;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemDustLead extends Item {

        public ItemDustLead(int id) {
                super(id);
                setCreativeTab(CreativeTabs.tabMaterials);
                setMaxStackSize(64);
                setUnlocalizedName(ItemInfo.DUST_LEAD_UNLOCALIZED_NAME);
                
        		this.func_111206_d("uniitems:dustLead");
    	}
    	
        @Override
        @SideOnly(Side.CLIENT)
        public void registerIcons(IconRegister iconRegister) {

            this.itemIcon = iconRegister.registerIcon(this.func_111208_A());
        }

}
