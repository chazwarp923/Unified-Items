/**
@author Chazwarp923
 */
package tech.chazwarp923.unifieditems.modular;

import java.util.ArrayList;
import java.util.List;

public class ModuleRegistry {
	
	private static List<UIModule> modules = new ArrayList<UIModule>();
	
	/**
	 * Registers a module for further processing
	 */
	public static void registerModule(UIModule module) {
		modules.add(module);
	}
	
	public static void preInit() {
		for(UIModule module : modules) {
			module.preInit();
		}
	}
	
	public static void init() {
		for(UIModule module : modules) {
			module.init();
		}
	}
	
	public static void postInit() {
		for(UIModule module : modules) {
			module.postInit();
		}
	}
}
