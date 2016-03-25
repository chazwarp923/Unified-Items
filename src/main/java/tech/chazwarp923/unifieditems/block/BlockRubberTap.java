package tech.chazwarp923.unifieditems.block;

import tech.chazwarp923.unifieditems.UniTab;
import tech.chazwarp923.unifieditems.item.UIItemBlock;
import tech.chazwarp923.unifieditems.lib.BlockInfo;
import tech.chazwarp923.unifieditems.tileentity.TileEntityRubberTap;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockRubberTap extends BlockContainer {

	public BlockRubberTap() {
		super(Material.iron);
		
		setCreativeTab(UniTab.tab);
		setHardness(2F);
		setStepSound(Block.soundTypeMetal);
		setUnlocalizedName(BlockInfo.RUBBER_TAP_UNLOCALIZED_NAME);
		setBlockBounds(0.3F, 0.25F, 0.6F, 0.7F, 0.55F, 1.0F);
		setLightOpacity(0);
		
		GameRegistry.registerBlock(this, UIItemBlock.class, BlockInfo.RUBBER_TAP_UNLOCALIZED_NAME);
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public int getRenderType() {
		return -1;
	}

	@Override
	public TileEntity createNewTileEntity(World world, int Integer) {
		return new TileEntityRubberTap();
	}
}