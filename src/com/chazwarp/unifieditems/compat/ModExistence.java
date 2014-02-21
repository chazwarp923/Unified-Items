package com.chazwarp.unifieditems.compat;

import com.chazwarp.unifieditems.lib.OreGen;

import cpw.mods.fml.common.Loader;

public class ModExistence {

	static int copperMods = 0;
	static int tinMods = 0;
	static int silverMods = 0;
	static int leadMods = 0;
	
	public static void Compat() {
	     if (Loader.isModLoaded("IC2")) {
	         OreGen.COPPER_VEIN = OreGen.COPPER_VEIN + 1;
	         OreGen.TIN_VEIN = OreGen.TIN_VEIN + 1;
	         OreGen.LEAD_VEIN = OreGen.LEAD_VEIN + 1;
	         copperMods = copperMods++;
	         tinMods = tinMods++;
	         leadMods = leadMods++;
	         System.out.println("[Unified Items] IC2 Integration Loaded");
	        }
	     else {
	    	 System.out.println("[Unified Items] IC2 Integration Not Loaded"); 
	     }
	     if (Loader.isModLoaded("ThermalExpansion")) {
	         OreGen.COPPER_VEIN = OreGen.COPPER_VEIN + 1;
	         OreGen.TIN_VEIN = OreGen.TIN_VEIN + 1;
	         OreGen.SILVER_VEIN = OreGen.SILVER_VEIN + 1;
	         OreGen.LEAD_VEIN = OreGen.LEAD_VEIN + 1;
	         copperMods = copperMods++;
	         tinMods = tinMods++;
	         silverMods = silverMods++;
	         leadMods = leadMods++;
	         System.out.println("[Unified Items] Thermal Expansion Integration Loaded");
	        }
	     else {
	    	 System.out.println("[Unified Items] Thermal Expansion Integration Not Loaded"); 
	     }
	     //EnderIO
	     if (Loader.isModLoaded("EnderIO")) {
	         OreGen.COPPER_VEIN = OreGen.COPPER_VEIN + 1;
	         OreGen.TIN_VEIN = OreGen.TIN_VEIN + 1;
	         copperMods = copperMods++;
	         tinMods = tinMods++;
	         System.out.println("[Unified Items] EnderIO Integration Loaded");
	        }
	     else {
	    	 System.out.println("[Unified Items] EnderIO Integration Not Loaded"); 
	     }
	     //Factorization Support
	     if (Loader.isModLoaded("Factorization")) {
	         OreGen.SILVER_VEIN = OreGen.SILVER_VEIN + 2;
	         silverMods = silverMods++;
	         System.out.println("[Unified Items] Factorization Integration Loaded");
	        }
	     else {
	    	 System.out.println("[Unified Items] Factorization Integration Not Loaded"); 
	     }
	     //Forestry Support
	     if (Loader.isModLoaded("Forestry")) {
	         OreGen.COPPER_VEIN = OreGen.COPPER_VEIN + 1;
	         OreGen.TIN_VEIN = OreGen.TIN_VEIN + 1;
	         copperMods = copperMods++;
	         tinMods = tinMods++;
	         System.out.println("[Unified Items] Forestry Integration Loaded");
	        }
	     else {
	    	 System.out.println("[Unified Items] Forestry Integration Not Loaded"); 
	     }
	     //Tinkers Support
	     if (Loader.isModLoaded("TConstruct")) {
	         OreGen.COPPER_VEIN = OreGen.COPPER_VEIN + 1;
	         copperMods = copperMods++;
	         System.out.println("[Unified Items] Tinker's Construct Integration Loaded");
	        }
	     else {
	    	 System.out.println("[Unified Items] Tinker's Construct Integration Not Loaded"); 
	     }
	     
	if(copperMods > 5) {
		OreGen.COPPER_CHUNK = OreGen.COPPER_CHUNK++;
	 }
	if(tinMods > 5) {
		OreGen.TIN_CHUNK = OreGen.TIN_CHUNK++;
	 }
	if(silverMods > 5) {
		OreGen.SILVER_CHUNK = OreGen.SILVER_CHUNK++;
	 }
	if(leadMods > 5) {
		OreGen.LEAD_CHUNK = OreGen.LEAD_CHUNK++;
	 }
	
	}
	
}
