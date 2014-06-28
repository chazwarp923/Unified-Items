package com.chazwarp.unifieditems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.chazwarp.unifieditems.blocks.ModBlocks;

import cpw.mods.fml.common.registry.LanguageRegistry;

public class UniTab extends CreativeTabs
{
    public static UniTab tab = new UniTab();

    public UniTab()
    {
        super("uniTab");
        LanguageRegistry.instance().addStringLocalization("itemGroup.uniTab", "Unified Items");
    }
    
    @Override
    public ItemStack getIconItemStack() {
    	return null;//new ItemStack(ModBlocks.oreCopper, 1, 0);
    }

	@Override
	public Item getTabIconItem() {
		return Items.apple;
	}
}
