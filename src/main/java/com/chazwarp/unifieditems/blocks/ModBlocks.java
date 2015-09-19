package com.chazwarp.unifieditems.blocks;

import java.util.ArrayList;
import java.util.List;

import com.chazwarp.unifieditems.items.ItemBlockCopper;
import com.chazwarp.unifieditems.items.ItemBlockCopperOre;
import com.chazwarp.unifieditems.items.ItemBlockRubberTap;
import com.chazwarp.unifieditems.lib.BlockInfo;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {

	protected static List<UIBlockOre> oreList = new ArrayList<UIBlockOre>();
	
	public static Block oreCopper = new UIBlock(Material.rock, 2F, Block.soundTypeStone, BlockInfo.COPPER_ORE_UNLOCALIZED_NAME, UIBlock.PICKAXE, UIBlock.STONE);
	public static Block blockCopper = new UIBlock(Material.iron, 2F, Block.soundTypeMetal, BlockInfo.COPPER_BLOCK_UNLOCALIZED_NAME, UIBlock.PICKAXE, UIBlock.IRON);
	public static Block rubberTap = new BlockRubberTap();

	public static void registerBlocks() {
		GameRegistry.registerBlock(oreCopper, ItemBlockCopperOre.class, BlockInfo.COPPER_ORE_KEY);
		GameRegistry.registerBlock(blockCopper, ItemBlockCopper.class, BlockInfo.COPPER_BLOCK_KEY);
		GameRegistry.registerBlock(rubberTap, ItemBlockRubberTap.class, BlockInfo.RUBBER_TAP_KEY);
	}
	
	public static void addOre(float hardness, String unlocalizedName, int harvestLevel, int hexColor, Block baseTex) {
		oreList.add(new UIBlockOre(hardness, unlocalizedName, harvestLevel, hexColor, baseTex));
	}
}