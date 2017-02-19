/**
@author Chazwarp923
 */
package tech.chazwarp923.unifieditems.block;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;
import tech.chazwarp923.unifieditems.material.Material;

public class UIBlocks {
	
	public static Map<Material, UIBlockMetalOre> metalOres = new HashMap<Material, UIBlockMetalOre>();
	public static Map<Material, UIBlockGemOre> gemOres = new HashMap<Material, UIBlockGemOre>();
	public static Map<Material, UIBlockStorage> blocks = new HashMap<Material, UIBlockStorage>();
	
	public static void addMetalOre(Material mat, float hardness, String unlocalizedName, HarvestLevel harvestLevel) {
		metalOres.put(mat, new UIBlockMetalOre(hardness, unlocalizedName, harvestLevel));
	}
	
	public static void addGemOre(Material mat, float hardness, String unlocalizedName, HarvestLevel harvestLevel) {
		gemOres.put(mat, new UIBlockGemOre(hardness, unlocalizedName, harvestLevel, mat));
	}
	
	public static void addBlock(Material mat, float hardness, String unlocalizedName, HarvestLevel harvestLevel) {
		blocks.put(mat, new UIBlockStorage(hardness, unlocalizedName, harvestLevel));
	}
	
	public static void preInit() {		
		for(Map.Entry<Material, UIBlockMetalOre> block : metalOres.entrySet()) {
			OreDictionary.registerOre("ore" + block.getKey().toString(), block.getValue());
			if(block.getKey().equals(Material.ALUMINUM)) {
				OreDictionary.registerOre("oreAluminium", block.getValue());
			}
		}
		
		for(Map.Entry<Material, UIBlockGemOre> block : gemOres.entrySet()) {
			OreDictionary.registerOre("ore" + block.getKey().toString(), block.getValue());
		}
		
		for(Map.Entry<Material, UIBlockStorage> block : blocks.entrySet()) {
			OreDictionary.registerOre("block" + block.getKey().toString(), block.getValue());
			if(block.getKey().equals(Material.ALUMINUM)) {
				OreDictionary.registerOre("blockAluminium", block.getValue());
			}
		}
	}
	
	@SideOnly(Side.CLIENT)
	public static void preInitClient() {
		for(Entry<Material, UIBlockMetalOre> block : metalOres.entrySet()) {
			block.getValue().initModel();
		}
		
		for(Entry<Material, UIBlockGemOre> block : gemOres.entrySet()) {
			block.getValue().initModel();
		}
		
		for(Entry<Material, UIBlockStorage> block : blocks.entrySet()) {
			block.getValue().initModel();
		}
	}
}