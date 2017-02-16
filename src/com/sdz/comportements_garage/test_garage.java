package com.sdz.comportements_garage;

import com.sdz.comportements_garage.Garage;

public class test_garage {
	public static void main(String[] args) {
		   	 Garage garage = new Garage();   
		   	 System.out.println(garage);
		   	 
		   	 Vehicule lag1 = new Lagouna();
		   	 lag1.setMoteur(new MoteurEssence("150 Chevaux", 5555));
		   	 lag1.addOption(new GPS());
		   	 lag1.addOption(new SiegeChauffant());
		   	 garage.add(lag1);
	
		   	 Vehicule A300A= new A310();
		   	 A300A.setMoteur(new MoteurEssence("320 ch", 51351));
		   	 A300A.addOption(new GPS());
		   	 garage.add(A300A);
	}
}