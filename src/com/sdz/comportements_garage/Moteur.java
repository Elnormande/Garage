package com.sdz.comportements_garage;

public abstract class Moteur{
	public String cylindre;	
	public double prix;
	public TypeMoteur typemot;
	
		
	//contructeur par default
	public Moteur(){
		cylindre = "0";
		prix = 0;
	}
	
	//Contructeur avec param
	Moteur(String pcylindre, double pprix, TypeMoteur ptype){
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
