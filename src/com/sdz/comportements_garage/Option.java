package com.sdz.comportements_garage;

public interface Option {
	public default Void Option(){
	System.out.println("Voiture sans options");
	return null;
	}
	public static double getPrix(){
		return prix; 
	}
}
