package com.chazwarp.unifieditems.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

import com.chazwarp.lib.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemUI extends Item {

    public ItemUI(int id) {

        super(id - Reference.SHIFTED_ID_RANGE_CORRECTION);
        maxStackSize = 1;
        setNoRepair();
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        
        itemIcon = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }
}