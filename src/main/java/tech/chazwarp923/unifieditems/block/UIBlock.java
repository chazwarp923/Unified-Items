/**
@author Chazwarp923
 */

package tech.chazwarp923.unifieditems.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import tech.chazwarp923.unifieditems.UnifiedItemsTab;
import tech.chazwarp923.unifieditems.item.UIItemBlock;

public class UIBlock extends Block {

	public UIBlock(Material mat, float hardness, SoundType sound, String unlocalizedName, HarvestType harvestTool, HarvestLevel harvestLevel) {
		super(mat);

		setCreativeTab(UnifiedItemsTab.tab);
		setHardness(hardness);
		setHarvestLevel(harvestTool.type, harvestLevel.level);
		setRegistryName(unlocalizedName);
		setSoundType(sound);
		setUnlocalizedName(unlocalizedName);
		
		GameRegistry.register(this);
		GameRegistry.register(new UIItemBlock(this), getRegistryName());
	}
	
	@SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}