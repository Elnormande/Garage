package com.sdz.comportements_garage;

import com.sdz.comportements_garage.TypeMoteur;

public class MoteurEssence extends Moteur{

	public String puissance;
	public double prixmot;
	
	//constructeur
	MoteurEssence(String patate, double prixmot){
	this.puissance=patate;
	this.prixmot=prixmot;
	this.typemot=TypeMoteur.ESSENCE;


	System.out.println("je suis un moteur essence");
	}
}
