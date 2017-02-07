package com.sdz.comportements_garage;

public enum TypeMoteur {

	DIESEL("Diesel"),
	ESSENCE("Essence"),
	HYBRIDE("Hybride"),
	ELECTRIQUE("Electrique");
	
	//initialisation
	private String typMot = "";
	
	//constructeur
	TypeMoteur(String typMot){
		this.typMot=typMot;
	}
	
	public String toString(){
	    return typMot;
	  }
	
}

