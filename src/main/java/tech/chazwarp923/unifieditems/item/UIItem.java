/**
@author Chazwarp923
 */

package tech.chazwarp923.unifieditems.item;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import tech.chazwarp923.unifieditems.UnifiedItemsTab;

public class UIItem extends Item {
	
	protected UIItem(String unlocalizedName) {
		super();
		
		setCreativeTab(UnifiedItemsTab.tab);
		setRegistryName(unlocalizedName);
		setUnlocalizedName(unlocalizedName);
		
		ForgeRegistries.ITEMS.register(this);
	}
	
	@SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}