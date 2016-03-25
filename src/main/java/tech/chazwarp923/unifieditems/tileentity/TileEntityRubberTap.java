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

	@Override
	public void writeToNBT(NBTTagCompound compound) {
		compound.setString("id", "RubberTap");
		compound.setInteger("x", this.pos.getX());
		compound.setInteger("y", this.pos.getY());
		compound.setInteger("z", this.pos.getZ());
	}
}