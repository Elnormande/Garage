package com.sdz.comportements_garage;

public enum Marque {
	
	RENO("Renault"),
	PIGEOT("Pigeot");
	
	//initialisation
	private String marque = "";
	
	//constructeur
	Marque(String marque){
		this.marque=marque;
	}	
	
	public String toString(){
	    return marque;
	  }
}
