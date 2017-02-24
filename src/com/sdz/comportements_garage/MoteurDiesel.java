package com.sdz.comportements_garage;

public class MoteurDiesel extends Moteur{

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
