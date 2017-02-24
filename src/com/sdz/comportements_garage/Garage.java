package com.sdz.comportements_garage;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Garage {
	
	private ArrayList<Vehicule> listVoit;
	File file = new File("Enregistrement Garage.txt");

//Constructeur garage, à chaque instanciation, on vérifie sur le fichier existe
	public Garage(){
		
//  Vérifie que le fichier garage existe   
		try {
	        ObjectInputStream ois = new ObjectInputStream(
	                new BufferedInputStream(
	                    new FileInputStream(file)));
	
 //Charge la liste des voitures dans listVoit
	        this.listVoit = (ArrayList<Vehicule>)ois.readObject();
	        ois.close();
	        }
	    catch (ClassNotFoundException e) {
	        e.printStackTrace();
	    } 
	    catch(FileNotFoundException e){
	    	e.printStackTrace();
	    	System.out.println("Le garage est vide");
	    }	    
		catch (IOException e) {
			e.printStackTrace();
	    }
} 
 
		public void add(Vehicule voiture){
	  		listVoit.add(voiture);
		      try {
				ObjectOutputStream oos = new ObjectOutputStream(
				          new BufferedOutputStream(
				              new FileOutputStream(file)));
				oos.writeObject(listVoit);
				oos.close();
		      } 
		      catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		public String toString(){
		    String str=("Garage Openclassrooms \n************************\nContenu de notre garage :\n");
			for(Vehicule v : listVoit){
		    	str += v.toString();
		    }
			return str;
		}
 }


