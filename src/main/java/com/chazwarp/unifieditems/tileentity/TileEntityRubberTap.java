package com.chazwarp.unifieditems.tileentity;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileEntityRubberTap extends TileEntity {

	@Override
	public void readFromNBT(NBTTagCompound compound) {
		this.xCoord = compound.getInteger("x");
		this.yCoord = compound.getInteger("y");
		this.zCoord = compound.getInteger("z");
	}

	@Override
	public void writeToNBT(NBTTagCompound compound) {
		compound.setString("id", "RubberTap");
		compound.setInteger("x", this.xCoord);
		compound.setInteger("y", this.yCoord);
		compound.setInteger("z", this.zCoord);
	}
}