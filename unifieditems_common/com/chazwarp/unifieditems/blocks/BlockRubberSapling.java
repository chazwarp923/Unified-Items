package com.chazwarp.unifieditems.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSapling;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.ForgeDirection;

import com.chazwap.unifieditems.worldgen.TreeGen;
import com.chazwarp.unifieditems.lib.BlockInfo;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockRubberSapling extends BlockSapling {
	
	public Icon[] icons;
    public String[] textureNames = new String[] { "rubber" };
	
	public BlockRubberSapling(int id) {
		super(id);
		
        float f = 0.4F;
        setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
        this.setHardness(0.0F);
        this.setStepSound(Block.soundGrassFootstep);
        this.setCreativeTab(CreativeTabs.tabDecorations);
		
		this.func_111022_d("uniitems:saplingRubber");
	}
	
	@Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) 
	{
		this.icons = new Icon[textureNames.length];

        for (int i = 0; i < this.icons.length; ++i)
        {
        this.blockIcon = iconRegister.registerIcon(this.func_111023_E());
        }
	}
	
	
	public boolean canPlaceBlockAt (World world, int x, int y, int z)
	 {
	     int blockID = world.getBlockId(x, y, z);
	     if (blockID == 0 || blocksList[blockID].blockMaterial.isReplaceable())
	         return true;
	     //return canBlockStay(world, x, y, z);
	     return false;
	 }
	
    public boolean canThisPlantGrowOnThisBlockID (int id)
    {
        return id == Block.grass.blockID || id == Block.dirt.blockID;
    }
    
    @Override
    public boolean canBlockStay (World world, int x, int y, int z)
    {
        int meta = world.getBlockMetadata(x, y, z) % 8;
        switch (meta)
        {
        case 0:
            int blockID = world.getBlockId(x, y - 1, z);
            Block soil = blocksList[blockID];
            return (world.getFullBlockLightValue(x, y, z) >= 8 || world.canBlockSeeTheSky(x, y, z)) && (soil != null && soil.canSustainPlant(world, x, y - 1, z, ForgeDirection.UP, this));
        default:
            return true;
        }
    }
    
    @Override
    public EnumPlantType getPlantType (World world, int x, int y, int z)
    {
        return EnumPlantType.Plains;
    }
    
    public void updateTick (World world, int x, int y, int z, Random random)
    {
        if (world.isRemote)
        {
            return;
        }
        super.updateTick(world, x, y, z, random);
        int md = world.getBlockMetadata(x, y, z);
        if (world.getBlockLightValue(x, y + 1, z) >= 9 && random.nextInt(120) == 0)
        {
            if ((md & 8) == 0)
                world.setBlockMetadataWithNotify(x, y, z, md | 8, 4);

            else
                growTree(world, x, y, z, random);
        }
        
    }
    
    @Override
    public void markOrGrowMarked (World world, int x, int y, int z, Random random)
    {
        boneFertilize(world, x, y, z, random);
    }

    public boolean boneFertilize (World world, int x, int y, int z, Random random)
    {
        int meta = world.getBlockMetadata(x, y, z);

        if ((meta & 8) == 0)
        {
            world.setBlockMetadataWithNotify(x, y, z, meta | 8, 4);
        }
        else
        {
            this.growTree(world, x, y, z, random);
        }

        return true;
    }
    
    public void growTree (World world, int x, int y, int z, Random random)
    {
        int md = world.getBlockMetadata(x, y, z) % 8;
        world.setBlock(x, y, z, 0);
        WorldGenerator obj = null;

        if (md == 1)
            obj = new TreeGen(true, 4, 2, 1, 1);

        if (!(obj.generate(world, random, x, y, z)))
            world.setBlock(x, y, z, blockID, md + 8, 3);
    }
    
}    
