package com.chazwarp.unifieditems.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.chazwarp.unifieditems.items.itemblocks.ItemBlockBronze;
import com.chazwarp.unifieditems.items.itemblocks.ItemBlockCopper;
import com.chazwarp.unifieditems.items.itemblocks.ItemBlockCopperOre;
import com.chazwarp.unifieditems.items.itemblocks.ItemBlockLead;
import com.chazwarp.unifieditems.items.itemblocks.ItemBlockLeadOre;
import com.chazwarp.unifieditems.items.itemblocks.ItemBlockRubberTap;
import com.chazwarp.unifieditems.items.itemblocks.ItemBlockSilver;
import com.chazwarp.unifieditems.items.itemblocks.ItemBlockSilverOre;
import com.chazwarp.unifieditems.items.itemblocks.ItemBlockTin;
import com.chazwarp.unifieditems.items.itemblocks.ItemBlockTinOre;
import com.chazwarp.unifieditems.lib.BlockInfo;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {

	public static Block oreCopper = new BlockUI(Material.rock, 2F,
			Block.soundTypeStone, BlockInfo.COPPER_ORE_UNLOCALIZED_NAME,
			BlockUI.PICKAXE, BlockUI.STONE);
	public static Block blockCopper = new BlockUI(Material.iron, 2F,
			Block.soundTypeMetal, BlockInfo.COPPER_BLOCK_UNLOCALIZED_NAME,
			BlockUI.PICKAXE, BlockUI.IRON);
	public static Block oreTin = new BlockUI(Material.rock, 2F,
			Block.soundTypeStone, BlockInfo.TIN_ORE_UNLOCALIZED_NAME,
			BlockUI.PICKAXE, BlockUI.STONE);
	public static Block blockTin = new BlockUI(Material.iron, 2F,
			Block.soundTypeMetal, BlockInfo.TIN_BLOCK_UNLOCALIZED_NAME,
			BlockUI.PICKAXE, BlockUI.IRON);
	public static Block blockBronze = new BlockUI(Material.iron, 2F,
			Block.soundTypeMetal, BlockInfo.BRONZE_BLOCK_UNLOCALIZED_NAME,
			BlockUI.PICKAXE, BlockUI.IRON);
	public static Block oreSilver = new BlockUI(Material.rock, 2F,
			Block.soundTypeStone, BlockInfo.SILVER_ORE_UNLOCALIZED_NAME,
			BlockUI.PICKAXE, BlockUI.IRON);
	public static Block blockSilver = new BlockUI(Material.iron, 2F,
			Block.soundTypeMetal, BlockInfo.SILVER_BLOCK_UNLOCALIZED_NAME,
			BlockUI.PICKAXE, BlockUI.IRON);
	public static Block oreLead = new BlockUI(Material.rock, 2F,
			Block.soundTypeStone, BlockInfo.LEAD_ORE_UNLOCALIZED_NAME,
			BlockUI.PICKAXE, BlockUI.IRON);
	public static Block blockLead = new BlockUI(Material.iron, 2F,
			Block.soundTypeMetal, BlockInfo.LEAD_BLOCK_UNLOCALIZED_NAME,
			BlockUI.PICKAXE, BlockUI.IRON);
	public static Block rubberTap = new BlockRubberTap();

	public static void registerBlocks() {
		GameRegistry.registerBlock(oreCopper, ItemBlockCopperOre.class,
				BlockInfo.COPPER_ORE_KEY);
		GameRegistry.registerBlock(oreTin, ItemBlockTinOre.class,
				BlockInfo.TIN_ORE_KEY);
		GameRegistry.registerBlock(oreSilver, ItemBlockSilverOre.class,
				BlockInfo.SILVER_ORE_KEY);
		GameRegistry.registerBlock(oreLead, ItemBlockLeadOre.class,
				BlockInfo.LEAD_ORE_KEY);
		GameRegistry.registerBlock(blockCopper, ItemBlockCopper.class,
				BlockInfo.COPPER_BLOCK_KEY);
		GameRegistry.registerBlock(blockTin, ItemBlockTin.class,
				BlockInfo.TIN_BLOCK_KEY);
		GameRegistry.registerBlock(blockBronze, ItemBlockBronze.class,
				BlockInfo.BRONZE_BLOCK_KEY);
		GameRegistry.registerBlock(blockSilver, ItemBlockSilver.class,
				BlockInfo.SILVER_BLOCK_KEY);
		GameRegistry.registerBlock(blockLead, ItemBlockLead.class,
				BlockInfo.LEAD_BLOCK_KEY);
		GameRegistry.registerBlock(rubberTap, ItemBlockRubberTap.class,
				BlockInfo.RUBBER_TAP_KEY);
	}
}