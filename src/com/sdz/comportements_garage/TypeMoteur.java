package com.sdz.comportements_garage;

import java.io.Serializable;

public enum TypeMoteur implements Serializable{

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

