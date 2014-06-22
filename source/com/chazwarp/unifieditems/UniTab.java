package com.chazwarp.unifieditems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

import com.chazwarp.unifieditems.blocks.Blocks;

import cpw.mods.fml.common.registry.LanguageRegistry;

public class UniTab extends CreativeTabs
{
    public static UniTab tab = new UniTab();
    static boolean hasInit;
    static int icon;

    public UniTab()
    {
        super("uniTab");
        LanguageRegistry.instance().addStringLocalization("itemGroup.uniTab", "Unified Items");
    }

    public static void init (int index)
    {
        if (!hasInit)
        {
            hasInit = true;
            icon = index;
        }
    }

    @Override
    public int getTabIconItemIndex ()
    {
        return icon;        
    }
    
    @Override
    public ItemStack getIconItemStack() {
    	return new ItemStack(Blocks.oreCopper, 1, 0);
    }
}
