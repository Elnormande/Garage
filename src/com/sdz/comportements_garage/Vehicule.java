package com.sdz.comportements_garage;

import java.util.ArrayList;
import java.io.Serializable;
import com.sdz.comportements_garage.Option;
import com.sdz.comportements_garage.Moteur;

public abstract class Vehicule implements Serializable{

protected Double prix;
protected String nom;
protected Marque nomMarque;
protected ArrayList<Option> optionsListe;
protected Moteur motmot;
protected Marque Marque;


//contructeur par default	
public Vehicule(){}
	
//Contructeur avec param
public Vehicule(double prix, String nom, Marque nomMarque, ArrayList<Option> optionsl) {
	this.prix=prix;
	this.nom=nom;
	this.Marque=nomMarque;
	this.optionsListe=optionsl;
	optionsListe=new ArrayList<Option>();	
}
 
//Constructeur avec 3 param
public Vehicule(double prix, String nom, Marque nomMarque){
	this.prix=prix;
	this.nom=nom;
	this.Marque=nomMarque;
	optionsListe=new ArrayList<Option>();	
}
		
//Méthod de class
	public double getPrix() {
		return prix;
	}

	public String toString(){
		String STR = "Voiture "+Marque+" : "+nom+" moteur "+motmot.toString()+" ("+prix+"€) [";
		String listobjt = "";
		double totalopt=0;

		//boucle qui parcourt les options calcule le prix total et renvoie un string avec la liste d'option
		for (int i=0; i<optionsListe.size();i++){
			totalopt +=optionsListe.get(i).getPrix();
			if (i==0)
					listobjt = ""+listobjt+" "+optionsListe.get(i).toString()+"";
			else listobjt = ""+listobjt+", "+optionsListe.get(i).toString()+"";
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
