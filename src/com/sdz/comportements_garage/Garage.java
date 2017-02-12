package com.sdz.comportements_garage;

import java.util.ArrayList;
import java.util.List;

public class Garage {
  List<Vehicule> listVoit = new ArrayList<Vehicule>();

  public void add(Vehicule voiture){
      listVoit.add(voiture); 

    System.out.println("Garage Openclassrooms \n*****************\nContenu de notre garage :");
    for(Vehicule v : listVoit)
    	System.out.print(v.toString());
    	
    //	System.out.print(v.getOptions());
 
   }
}