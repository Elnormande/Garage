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
	File file = new File("Enregistrement Garage.txt");

	private ArrayList<Vehicule> listVoit= new ArrayList<Vehicule>();
	public 	ObjectInputStream ois;
	public 	ObjectOutputStream ous;
	
//Constructeur garage, à chaque instanciation, on vérifie sur le fichier existe et on stocke le contenu du garage txt dans un arraylist
	public Garage(){
		
		try {
	        ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
	
 //Charge la liste des voitures dans listVoit depuis le fichier
	        listVoit = (ArrayList<Vehicule>)ois.readObject();
	        ois.close();
	        }
	    catch (ClassNotFoundException e) {
	        e.printStackTrace();
	    } 
	    catch(FileNotFoundException e){
	    	e.printStackTrace();
	    	System.out.println("Il n'existe pas de garage !");
	    }	    
		catch (IOException e) {
			e.printStackTrace();
	    }
		finally{
			try{
				if (ois!=null)
					ois.close();
					}
				catch (final IOException e){
				e.printStackTrace();
				}
			}
		if (listVoit.isEmpty()==true)
			System.out.println("Le garage est vide...");
		}
		
//Ajout d'une voiture au garage 
		public void add(Vehicule voiture){

			//Chargement garage stocké dans le fichier dans un nouveau ArrayList			
			try {
		        ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
		        //Charge la liste des voitures dans listVoit depuis le fichier
		        listVoit = (ArrayList<Vehicule>)ois.readObject();
		        ois.close();
		        }
		    catch (ClassNotFoundException e) {
		        e.printStackTrace();
		    }
			catch (FileNotFoundException e){
		    	e.printStackTrace();
		    	System.out.println("Il n'existe pas de garage !");
		    }	    
			catch (IOException e) {
				e.printStackTrace();
			}
			
			
			try {
				ObjectOutputStream oos = new ObjectOutputStream(
				          new BufferedOutputStream(
				              new FileOutputStream(file)));
				//ajout de voiture dans le garage si elle n'est pas déjà existante
				if(listVoit.contains(voiture)==false){
					listVoit.add(voiture);
					oos.writeObject(listVoit);
				}
				oos.close();
		      } 
		      catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		
		public String toString(){
		    String str=("\n*************************\n* Garage Openclassrooms *\n*************************\nContenu de notre garage :\n");
//si la liste de voiture du garage n'est pas vide, on la parcourt pour former le message decrivant le contenu du garage
		    if(listVoit.isEmpty()==false) 
				for(Vehicule v : listVoit){
			    	str += v.toString();
			    }
		    else{
		    	str += "le garage est vide";
		    }
		    System.out.println(str);
			return str;
		}
 }