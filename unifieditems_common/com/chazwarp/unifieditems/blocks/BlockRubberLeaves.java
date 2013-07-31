package com.chazwarp.unifieditems.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.ColorizerFoliage;
import net.minecraft.world.IBlockAccess;

import com.chazwarp.unifieditems.lib.BlockInfo;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockRubberLeaves extends BlockLeaves {
	
	int[] adjacentTreeBlocks;
	
	public BlockRubberLeaves(int id)
    {
        super(id);
        this.setTickRandomly(true);
        this.setHardness(0.2F);
        this.setLightOpacity(1);
        this.setStepSound(Block.soundGrassFootstep);
        this.setUnlocalizedName(BlockInfo.RUBBER_LEAVES_UNLOCALIZED_NAME);
        setBurnProperties(this.blockID, 30, 60);
        this.setCreativeTab(CreativeTabs.tabDecorations);
        
		this.func_111022_d("uniitems:leavesRubber");
	}
	
    public int getBlockColor ()
    {
        double var1 = 0.5D;
        double var3 = 1.0D;
        return ColorizerFoliage.getFoliageColor(var1, var3);
    }

    /**
     * Returns the color this block should be rendered. Used by leaves.
     */
    public int getRenderColor (int var1)
    {
        return ColorizerFoliage.getFoliageColorBasic();
    }

    /**
     * Returns a integer with hex for 0xrrggbb with this color multiplied against the blocks color. Note only called
     * when first determining what to render.
     */
    public int colorMultiplier (IBlockAccess var1, int x, int y, int z)
    {
        //int meta = var1.getBlockMetadata(x, y, z);

        /*if (meta == 1)
        {
            return 16777215;
        }
        else if (meta == 2)
        {
            return 7579477;
        }
        else
        {*/
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;

        for (int var9 = -1; var9 <= 1; ++var9)
        {
            for (int var10 = -1; var10 <= 1; ++var10)
            {
                int var11 = var1.getBiomeGenForCoords(x + var10, z + var9).getBiomeFoliageColor();
                var6 += (var11 & 16711680) >> 16;
                var7 += (var11 & 65280) >> 8;
                var8 += var11 & 255;
            }
        }

        return (var6 / 9 & 255) << 16 | (var7 / 9 & 255) << 8 | var8 / 9 & 255;
        //}
    }
    
	@Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {

        this.blockIcon = iconRegister.registerIcon(this.func_111023_E());
	}
	
	@Override
    public boolean shouldSideBeRendered (IBlockAccess var1, int var2, int var3, int var4, int var5)
    {
        return this.graphicsLevel ? super.shouldSideBeRendered(var1, var2, var3, var4, var5) : true;
    }
	
}
