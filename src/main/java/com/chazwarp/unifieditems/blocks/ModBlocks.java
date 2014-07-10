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

	public static Block oreCopper;
	
		public static void initOreCopper() {
			oreCopper = new BlockCopperOre(Material.rock);
			GameRegistry.registerBlock(oreCopper, ItemBlockCopperOre.class, BlockInfo.COPPER_ORE_KEY);
		}
	
	public static Block blockCopper;
	
		public static void initBlockCopper() {
			blockCopper = new BlockCopper(Material.iron);
			GameRegistry.registerBlock(blockCopper, ItemBlockCopper.class, BlockInfo.COPPER_BLOCK_KEY);
		}
	
	public static Block oreTin;

		public static void initOreTin() {
			oreTin = new BlockTinOre(Material.rock);
			GameRegistry.registerBlock(oreTin, ItemBlockTinOre.class, BlockInfo.TIN_ORE_KEY);
		}	

	public static Block blockTin;
	
		public static void initBlockTin() {
			blockTin = new BlockTin(Material.iron);
			GameRegistry.registerBlock(blockTin, ItemBlockTin.class, BlockInfo.TIN_BLOCK_KEY);
		}	
	
	public static Block blockBronze;
	
		public static void initBlockBronze() {
			blockBronze = new BlockBronze(Material.iron);
			GameRegistry.registerBlock(blockBronze, ItemBlockBronze.class, BlockInfo.BRONZE_BLOCK_KEY);
		}	
	
	public static Block oreSilver;

		public static void initOreSilver() {
			oreSilver = new BlockSilverOre(Material.rock);
			GameRegistry.registerBlock(oreSilver, ItemBlockSilverOre.class, BlockInfo.SILVER_ORE_KEY);
		}	

	public static Block blockSilver;
	
		public static void initBlockSilver() {
			blockSilver = new BlockSilver(Material.iron);
			GameRegistry.registerBlock(blockSilver, ItemBlockSilver.class, BlockInfo.SILVER_BLOCK_KEY);
		}
	
	public static Block oreLead;

		public static void initOreLead() {
			oreLead = new BlockLeadOre(Material.rock);
			GameRegistry.registerBlock(oreLead, ItemBlockLeadOre.class, BlockInfo.LEAD_ORE_KEY);
		}	

	public static Block blockLead;
	
		public static void initBlockLead() {
			blockLead = new BlockLead(Material.iron);
			GameRegistry.registerBlock(blockLead, ItemBlockLead.class, BlockInfo.LEAD_BLOCK_KEY);
		}	
		
	public static Block rubberTap;
		
		public static void initRubberTap() {
			rubberTap = new BlockRubberTap(Material.iron);
			GameRegistry.registerBlock(rubberTap, ItemBlockRubberTap.class, BlockInfo.RUBBER_TAP_KEY);
		}
	
	public static void initBlocks() {
		initOreCopper();
		initOreTin();
		initOreSilver();
		initOreLead();
		initBlockCopper();
		initBlockTin(); 
		initBlockBronze();
		initBlockSilver();
		initBlockLead();
		initRubberTap(); 
	}
}