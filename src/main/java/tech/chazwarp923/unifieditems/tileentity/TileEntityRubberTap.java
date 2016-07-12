package tech.chazwarp923.unifieditems.tileentity;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;

public class TileEntityRubberTap extends TileEntity {

	@Override
	public void readFromNBT(NBTTagCompound compound) {
		BlockPos newPos = new BlockPos(compound.getInteger("x"), compound.getInteger("y"), compound.getInteger("z"));
		this.setPos(newPos);
	}
}