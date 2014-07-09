package com.chazwarp.unifieditems.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.chazwarp.unifieditems.lib.BlockInfo;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {

	public static Block oreCopper;
	
		public static void initOreCopper() {
			oreCopper = new BlockCopperOre(Material.rock);
			GameRegistry.registerBlock(oreCopper, BlockInfo.COPPER_ORE_KEY);
		}
	
	public static Block blockCopper;
	
		public static void initBlockCopper() {
			blockCopper = new BlockCopper(Material.iron);
			GameRegistry.registerBlock(blockCopper, BlockInfo.COPPER_BLOCK_KEY);
		}
	
	public static Block oreTin;

		public static void initOreTin() {
			oreTin = new BlockTinOre(Material.rock);
			GameRegistry.registerBlock(oreTin, BlockInfo.TIN_ORE_KEY);
		}	

	public static Block blockTin;
	
		public static void initBlockTin() {
			blockTin = new BlockTin(Material.iron);
			GameRegistry.registerBlock(blockTin, BlockInfo.TIN_BLOCK_KEY);
		}	
	
	public static Block blockBronze;
	
		public static void initBlockBronze() {
			blockBronze = new BlockBronze(Material.iron);
			GameRegistry.registerBlock(blockBronze, BlockInfo.BRONZE_BLOCK_KEY);
		}	
	
	public static Block oreSilver;

		public static void initOreSilver() {
			oreSilver = new BlockSilverOre(Material.rock);
			GameRegistry.registerBlock(oreSilver, BlockInfo.SILVER_ORE_KEY);
		}	

	public static Block blockSilver;
	
		public static void initBlockSilver() {
			blockSilver = new BlockSilver(Material.iron);
			GameRegistry.registerBlock(blockSilver, BlockInfo.SILVER_BLOCK_KEY);
		}
	
	public static Block oreLead;

		public static void initOreLead() {
			oreLead = new BlockLeadOre(Material.rock);
			GameRegistry.registerBlock(oreLead, BlockInfo.LEAD_ORE_KEY);
		}	

	public static Block blockLead;
	
		public static void initBlockLead() {
			blockLead = new BlockLead(Material.iron);
			GameRegistry.registerBlock(blockLead, BlockInfo.LEAD_BLOCK_KEY);
		}	
		
	public static Block rubberTap;
		
		public static void initRubberTap() {
			rubberTap = new BlockRubberTap(Material.iron);
			GameRegistry.registerBlock(rubberTap, BlockInfo.RUBBER_TAP_KEY);
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