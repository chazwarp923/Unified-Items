/**
@author Chaz Kerby
 */

package tech.chazwarp923.unifieditems.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;
import tech.chazwarp923.unifieditems.UniTab;
import tech.chazwarp923.unifieditems.item.UIItemBlock;

public class UIBlock extends Block {
	
	private String name = "UIDefaultBlock";

	public UIBlock(Material mat, float hardness, SoundType sound, String unlocalizedName, HarvestType harvestTool, HarvestLevel harvestLevel) {
		super(mat);

		setCreativeTab(UniTab.tab);
		setHardness(hardness);
		setHarvestLevel(harvestTool.toString(), harvestLevel.level);
		setRegistryName(unlocalizedName);
		setSoundType(sound);
		setUnlocalizedName("UnifiedItems" + unlocalizedName);
		name = unlocalizedName;
		
		GameRegistry.register(this);
		GameRegistry.register(new UIItemBlock(this), getRegistryName());
	}
	
	public String getName() {
		return name;
	}
}