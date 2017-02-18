/**
@author Chazwarp923
 */
package tech.chazwarp923.unifieditems.tools;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import org.apache.logging.log4j.Level;

import tech.chazwarp923.unifieditems.UnifiedItems;
import tech.chazwarp923.unifieditems.material.Material;

public class JsonHelper {

	public static void generateJson(Material mat) {
		switch(mat.type) {
		case GENERIC:
			createBlockJson("ore_" + mat.name.toLowerCase());
			createItemJson("dust_" + mat.name.toLowerCase());
			createItemJson("ingot_" + mat.name.toLowerCase());
			createItemJson("nugget_" + mat.name.toLowerCase());
			createItemJson("plate_" + mat.name.toLowerCase());
			createItemJson("gear_" + mat.name.toLowerCase());
			createBlockJson("block_" + mat.name.toLowerCase());
			break;
		case ALLOY:
			createItemJson("dust_" + mat.name.toLowerCase());
			createItemJson("ingot_" + mat.name.toLowerCase());
			createItemJson("nugget_" + mat.name.toLowerCase());
			createItemJson("plate_" + mat.name.toLowerCase());
			createItemJson("gear_" + mat.name.toLowerCase());
			createBlockJson("block_" + mat.name.toLowerCase());
			break;
		case GENERIC_GEM:
			createBlockJson("ore_" + mat.name.toLowerCase());
			createItemJson("dust_" + mat.name.toLowerCase());
			createItemJson("gem_" + mat.name.toLowerCase());
			createBlockJson("block_" + mat.name.toLowerCase());
			break;
		case DUST:
			createItemJson("dust_" + mat.name.toLowerCase());
			break;
		case INGOT:
			createItemJson("ingot_" + mat.name.toLowerCase());
			break;
		case NUGGET:
			createItemJson("nugget_" + mat.name.toLowerCase());
			break;
		case GEM:
			createItemJson("gem_" + mat.name.toLowerCase());
			break;
		case PLATE:
			createItemJson("plate_" + mat.name.toLowerCase());
			break;
		case GEAR:
			createItemJson("gear_" + mat.name.toLowerCase());
			break;
		case BLOCK:
			createBlockJson("block_" + mat.name.toLowerCase());
			break;
		default:
			UnifiedItems.logger.log(Level.INFO, "Unable to generate json for " + mat.name);
			break;
		}
	}
	
	private static void createBlockJson(String name) {
		createJsonFile(name, "block");
		createJsonFile(name + "_i", "itemblock");
	}
	
	private static void createItemJson(String name) {
		createJsonFile(name, "item");
	}
	
	@SuppressWarnings("all")
	private static void createJsonFile(String name, String type) {
		String parent = "";
		try {
			PrintWriter writer = new PrintWriter(name + ".json", "UTF-8");
			writer.println("{");
			switch(type) {
				case "block":
					parent = "block/cube_all";
					break;
				case "item":
					parent = "builtin/generated";
					break;
				case "itemblock":
					parent = "unifieditems:block/" + name;
					break;
				default:
					UnifiedItems.logger.log(Level.INFO, "Invalid type passed to createJsonFile, String = " + type);
					break;
			}
			writer.println("	\"parent\": \"" + parent + "\",");
			if(type.equals("block") || type.equals("item")) {
				writer.println("	\"textures\": {");
				if(type.equals("block")) {
					writer.println("		\"all\": \"unifieditems:blocks/" + name + "\"");
					writer.println("	}");
					writer.println("}");
				}
				if(type.equals("item")) {
					writer.println("		\"layer0\": \"unifieditems:items/" + name +"\"");
					writer.println("	},");
				}
			}
			if(type.equals("item") || type.equals("itemblock")) {
				writer.println("	\"display\": {");
				if(type.equals("item")) {
					writer.println("		\"ground\": {");
					writer.println("             \"rotation\": [ 0, 0, 0 ],");
					writer.println("             \"translation\": [ 0, 2, 0],");
					writer.println("             \"scale\":[ 0.5, 0.5, 0.5 ]");
					writer.println("         },");
					writer.println("         \"head\": {");
					writer.println("             \"rotation\": [ 0, 180, 0 ],");
					writer.println("             \"translation\": [ 0, 13, 7],");
					writer.println("             \"scale\":[ 1, 1, 1]");
					writer.println("         },");
					writer.println("         \"thirdperson_righthand\": {");
					writer.println("             \"rotation\": [ 0, 0, 0 ],");
					writer.println("             \"translation\": [ 0, 3, 1 ],");
					writer.println("             \"scale\": [ 0.55, 0.55, 0.55 ]");
					writer.println("         },");
					writer.println("         \"firstperson_righthand\": {");
					writer.println("             \"rotation\": [ 0, -90, 25 ],");
					writer.println("             \"translation\": [ 1.13, 3.2, 1.13],");
					writer.println("             \"scale\": [ 0.68, 0.68, 0.68 ]");
					writer.println("         }");
				}
				if (type.equals("itemblock")) {
					writer.println("		\"thirdperson\": {");
					writer.println("			\"rotation\": [ 10, -45, 170 ],");
					writer.println("			\"translation\": [ 0, 1.5, -2.75 ],");
					writer.println("			\"scale\": [ 0.375, 0.375, 0.375 ]");
					writer.println("		}");
				}
				writer.println("	}");
			}
			writer.println("}");
			writer.close();
		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
