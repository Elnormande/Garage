package com.sdz.comportements_garage;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
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

	public Garage() {
		
		try {
	        ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
	
 //Charge la liste des voitures dans listVoit depuis le fichier
	        listVoit = (ArrayList<Vehicule>)ois.readObject();
	        ois.close();
	        }
	    catch (ClassNotFoundException e) {//en cas de désérialisation d'une classe
	        e.printStackTrace();
	    } 
	    catch(FileNotFoundException e){
	    	e.printStackTrace();
	    	System.out.println("Il n'existe pas de fichier de garage sauvegardé!");
	    } catch (EOFException e) {  //si l'ois est vide
			System.err.println("Le garage est vide...");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

//Ajout d'une voiture au garage 

		public void addVoiture(Vehicule voiture){

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
			catch (EOFException e) {  //si l'ois est vide Le garage est vide au moment d'ajouter des choses dedans...
			}	    
			catch (IOException e) {
				e.printStackTrace();
			}
			
			
			try {
				ObjectOutputStream oos = new ObjectOutputStream(
				          new BufferedOutputStream(
				              new FileOutputStream(file)));
				//ajout de voiture dans le garage si elle n'est pas déjà existante mais ne semble pas fonctionner ^^'

				if(listVoit.contains(voiture)==false){
					listVoit.add(voiture);
					oos.writeObject(listVoit);
					oos.close();
				}
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
			return str;
		}
 }