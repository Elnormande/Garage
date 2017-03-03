package com.sdz.comportements_garage;

import java.io.Serializable;

public enum Marque implements Serializable{
	
	RENO("Renault"),
	PIGEOT("Pigeot"),
	TROEN("Troen");
	
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
