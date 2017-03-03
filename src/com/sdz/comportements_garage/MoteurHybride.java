package com.sdz.comportements_garage;

import java.io.Serializable;

public class MoteurHybride extends Moteur implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2478440472505876735L;
	public String puissance;
	public double prixmot;
	
	//constructeur
	MoteurHybride(String patate, double prixmot){
	this.puissance=patate;
	this.prixmot=prixmot;
	this.typemot=TypeMoteur.HYBRIDE;
	}
}
