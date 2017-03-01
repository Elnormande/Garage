package com.sdz.comportements_garage;

import java.io.Serializable;

public class MoteurDiesel extends Moteur implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2478440472505876735L;
	public String puissance;
	public double prixmot;
	
	//constructeur
	MoteurDiesel(String patate, double prixmot){
	this.puissance=patate;
	this.prixmot=prixmot;
	this.typemot=TypeMoteur.DIESEL;


	System.out.println("je suis un moteur Diesel");
	}
}
