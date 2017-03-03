package com.sdz.comportements_garage;

import java.util.ArrayList;
import java.io.Serializable;
import com.sdz.comportements_garage.Option;
import com.sdz.comportements_garage.Moteur;

public abstract class Vehicule implements Serializable{

private static final long serialVersionUID = 1L;
private double prix;
private String nom;
private Marque nomMarque;
private ArrayList<Option> optionsListe;
public Moteur motmot;


//contructeur par default	
public Vehicule(){}
	
//Contructeur avec param
public Vehicule(double prix, String nom, Marque nomMarque, ArrayList<Option> optionsl) {
	this.prix=prix;
	this.nom=nom;
	this.nomMarque=nomMarque;
	this.optionsListe=optionsl;
	optionsListe=new ArrayList<Option>();	
}
 
//Constructeur avec 3 param
public Vehicule(double prix, String nom, Marque nomMarque){
	this.prix=prix;
	this.nom=nom;
	this.nomMarque=nomMarque;
	optionsListe=new ArrayList<Option>();	
}
		
//Méthod de class
	public double getPrix() {
		return prix;
	}

	public String toString(){
		String STR = "Voiture "+getMarque()+" : "+getNom()+" moteur "+motmot.toString()+" ("+prix+"€) [";
		String listobjt = "";
		double totalopt=0;

		//boucle qui parcourt les options calcule le prix total et renvoie un string avec la liste d'option
		for (Option opt:optionsListe){
			totalopt +=opt.getPrix();
			listobjt = ""+listobjt+" "+opt.toString()+"";
			}
		return	STR +listobjt +"] caisse d'une valeur totale de "+(prix+totalopt)+"€.\n";
	}
	
	public Marque getMarque(){
		return this.nomMarque;
	}
   
	public String getNom(){
		return this.nom;
	}
	
	public ArrayList<Option> options() {
        return optionsListe;
    }
	
	// non utilisé...
	public ArrayList<Option> getOptions(){
		return optionsListe;
	}

	public void addOption(Option monOption) {
		optionsListe.add(monOption);
	}
	
	public void setMoteur(Moteur vroum){
		this.motmot=vroum;
	}
	
}
