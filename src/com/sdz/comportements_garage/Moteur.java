package com.sdz.comportements_garage;

import java.io.Serializable;

public abstract class Moteur implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7312171877829525197L;
	public String cylindre;	
	public double prix;
	public TypeMoteur typemot;
	
		
	//contructeur par default
	public Moteur(){
		cylindre = "0";
		prix = 0;
	}
	
	//Contructeurs avec param
	public Moteur(String pcylindre, double pprix, TypeMoteur ptype){
		this.cylindre=pcylindre;
		this.prix=pprix;		
		this.typemot = ptype;
		}
	
	//Méthodes de classe
	public String toString(){
		return typemot.toString();
		}
	
	public double getprix(){
		return prix;
		}
	}
