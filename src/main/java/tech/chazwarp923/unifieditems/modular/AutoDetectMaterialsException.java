/**
@author Chazwarp923
*/
package tech.chazwarp923.unifieditems.modular;

public class AutoDetectMaterialsException extends RuntimeException {

	private static final long serialVersionUID = 1279509611895065430L;

	public AutoDetectMaterialsException() {
		super("FIRST RUN, AUTO DETECTED ALL SUPPORTED MATERIALS, PLEASE RESTART YOUR GAME AND DO NOT REPORT THIS, IT IS INTENDED BEHAVIOR, IF YOU WOULD LIKE TO RUN THIS AGAIN, SIMPLY DELETE 'unifieditems-LastKnownMatrials.json' IN YOUR CONFIG DIRECTORY");
	}
}
