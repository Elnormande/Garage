package com.sdz.comportements_garage;

public class Vehicule <Option>extends Moteur implements Option{
public double prix;
public String nom;
public Marque nomMarque;
//public Option[]<Option>;


//contructeur par default	
public void Vehicule(){}
	
//Contructeur avec param
public void Vehicule(double prix, String nom, Marque nomMarque ) {
	this.prix=prix;
	this.nom=nom;
	this.nomMarque=nomMarque;
	}
 
	public double getPrix() {
		// TODO Auto-generated method stub
		return prix;
	}

}
