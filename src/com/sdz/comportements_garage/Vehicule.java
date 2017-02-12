package com.sdz.comportements_garage;

import java.util.ArrayList;
import com.sdz.comportements_garage.Option;
import com.sdz.comportements_garage.Moteur;

public class Vehicule{
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
		// TODO Auto-generated method stub
		return prix;
	}

	public String toString(){
		String STR = "Voiture "+getMarque()+" : "+getNom()+" moteur "+motmot.toString()+" ("+prix+"€) [";
		String listobjt = "";
		double totalopt=0;
		for (Option opt:optionsListe){
			totalopt +=opt.getPrix();
			listobjt = ""+listobjt+" "+opt.toString()+"";
		}
		return	STR +listobjt +"]caisse d'une valeur totale de "+(prix+totalopt)+"";
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
	
	public ArrayList<Option> getOptions(){
		for (Option opt:optionsListe)
			System.out.println(""+opt+"");
		return optionsListe;
	}

	public void addOption(Option monOption) {
		optionsListe.add(monOption);
	}
	
	public void setMoteur(Moteur vroum){
		this.motmot=vroum;
	}
	
}
