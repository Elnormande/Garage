package com.sdz.comportements_garage;

import java.io.Serializable;

import com.sdz.comportements_garage.TypeMoteur;

public class MoteurEssence extends Moteur implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -829424622747108257L;
	public String puissance;
	public double prixmot;
	
	//constructeur
	MoteurEssence(String patate, double prixmot){
	this.puissance=patate;
	this.prixmot=prixmot;
	this.typemot=TypeMoteur.ESSENCE;
	}
}
