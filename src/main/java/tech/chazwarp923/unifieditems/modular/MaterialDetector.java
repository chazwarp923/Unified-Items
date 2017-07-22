/**
@author Chazwarp923
*/
package tech.chazwarp923.unifieditems.modular;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.oredict.OreDictionary;
import tech.chazwarp923.unifieditems.Reference;
import tech.chazwarp923.unifieditems.material.Material;

public class MaterialDetector {

	private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
	private static File config;
	private static List<Material> enabledMaterials = new ArrayList<Material>();
	
	public static void preInit(FMLPreInitializationEvent event) {
		config = new File(event.getModConfigurationDirectory().toString() + "/" + Reference.MOD_ID + "-LastKnownMaterials.json");
		for(Material mat : Material.values()) {
			if(doesOreNameExist(mat) || isDevEnvironment()) {
				enabledMaterials.add(mat);
			}
		}
	}
	
	public static void init() {
		if(!config.exists()) {
			JsonDataOrganizer jdo = new JsonDataOrganizer();
			for(Material mat : enabledMaterials) {
				jdo.materials.add(mat.name);
			}
			try (FileWriter w = new FileWriter(config)) {
				GSON.toJson(jdo, w);
			} catch (IOException e) {
				e.printStackTrace();
			}
			throw new AutoDetectMaterialsException();
		}
	}
	
	public static List<Material> readKnownMaterials() {
		if(config.exists()) {
			try {
				BufferedReader br = new BufferedReader(new FileReader(config));
				JsonDataOrganizer json = GSON.fromJson(br, JsonDataOrganizer.class);
				List<Material> materials = new ArrayList<Material>();
				for(String key : json.materials) {
					materials.add(Material.getMaterialFromName(key));
				}
				return materials;
			} 
			catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	private static Boolean doesOreNameExist(Material mat) {
		List<Boolean> exists = new ArrayList<Boolean>();
		
		exists.add(OreDictionary.doesOreNameExist("ore" + mat.name));
		exists.add(OreDictionary.doesOreNameExist("dust" + mat.name));
		exists.add(OreDictionary.doesOreNameExist("ingot" + mat.name));
		exists.add(OreDictionary.doesOreNameExist("nugget" + mat.name));
		exists.add(OreDictionary.doesOreNameExist("gem" + mat.name));
		exists.add(OreDictionary.doesOreNameExist("block" + mat.name));
		
		return exists.contains(Boolean.TRUE);
	}
	
	private static boolean isDevEnvironment() {
		File devFile = new File("C:\\Users\\chazk\\DevFileCheckDoNotDelete.txt");
		return devFile.exists();
	}
}
