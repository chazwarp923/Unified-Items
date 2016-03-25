/**
@author Chaz Kerby
 */

package tech.chazwarp923.unifieditems.block;

import tech.chazwarp923.unifieditems.UniTab;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class UIBlock extends Block {

	public enum HarvestType {
		SWORD("sword"),
		AXE("axe"),
		PICKAXE("pickaxe"),
		SHOVEL("spade");

		final String type;

		HarvestType(String type) {
			this.type = type;
		}
	}

	public enum HarvestLevel {
		WOOD(0),
		STONE(1),
		IRON(2),
		DIAMOND(3);

		final int level;

		HarvestLevel(int level) {
			this.level = level;
		}
	}
	
	private String name = "UIDefaultBlock";

	public UIBlock(Material mat, float hardness, SoundType sound, String unlocalizedName, HarvestType harvestTool, HarvestLevel harvestLevel) {
		super(mat);

		setCreativeTab(UniTab.tab);
		setHardness(hardness);
		setHarvestLevel(harvestTool.toString(), Integer.parseInt(harvestLevel.toString()));
		setRegistryName(unlocalizedName);
		setStepSound(sound);
		setUnlocalizedName(unlocalizedName); name = unlocalizedName;
		
		GameRegistry.registerBlock(this, name);
	}
	
	public String getName() {
		return name;
	}
}