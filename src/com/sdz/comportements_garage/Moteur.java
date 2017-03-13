package com.sdz.comportements_garage;

import java.io.Serializable;

public abstract class Moteur implements Serializable{
	
	public String cylindre;	
	public Double prix;
	public TypeMoteur typemot;
	
		
	//contructeur par default
	public Moteur(){
		cylindre = "0";
		prix = 0d;
	}
	
	//Contructeurs avec param
	public Moteur(String pcylindre, Double pprix, TypeMoteur ptype){
		this.cylindre=pcylindre;
		this.prix=pprix;		
		this.typemot = ptype;
		}
	
	//Méthodes de classe
	public String toString(){
		return typemot.toString() + " " + cylindre;
		}
	
	public Double getprix(){
		return prix;
		}
	}
