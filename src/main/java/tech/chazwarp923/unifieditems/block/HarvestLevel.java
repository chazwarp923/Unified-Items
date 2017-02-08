/**
@author Chazwarp923
 */
package tech.chazwarp923.unifieditems.block;

public enum HarvestLevel {
	WOOD(0),
	STONE(1),
	IRON(2),
	DIAMOND(3);

	final int level;

	HarvestLevel(int level) {
		this.level = level;
	}
}
