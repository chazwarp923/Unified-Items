package com.chazwarp.unifieditems.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelRubberTap extends ModelBase {
	// fields
	ModelRenderer Left_Side;
	ModelRenderer Right_Side;
	ModelRenderer Bottom;

	public ModelRubberTap() {
		textureWidth = 32;
		textureHeight = 32;

		Left_Side = new ModelRenderer(this, 0, 0);
		Left_Side.addBox(-0.5F, -1.5F, -1.5F, 1, 4, 6);
		Left_Side.setRotationPoint(-2.5F, 17F, 3.5F);
		Left_Side.setTextureSize(32, 32);
		Left_Side.mirror = true;
		setRotation(Left_Side, 0F, 0F, 0F);
		Right_Side = new ModelRenderer(this, 0, 0);
		Right_Side.addBox(-0.5F, -1.5F, -1.5F, 1, 4, 6);
		Right_Side.setRotationPoint(2.5F, 17F, 3.5F);
		Right_Side.setTextureSize(32, 32);
		Right_Side.mirror = true;
		setRotation(Right_Side, 0F, 0F, 0F);
		Bottom = new ModelRenderer(this, 0, 14);
		Bottom.addBox(-1.7F, -0.5F, -1.5F, 4, 2, 6);
		Bottom.setRotationPoint(-0.3F, 18F, 3.5F);
		Bottom.setTextureSize(32, 32);
		Bottom.mirror = true;
		setRotation(Bottom, 0F, 0F, 0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3,
			float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Left_Side.render(f5);
		Right_Side.render(f5);
		Bottom.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3,
			float f4, float f5, Entity entity) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}
}
