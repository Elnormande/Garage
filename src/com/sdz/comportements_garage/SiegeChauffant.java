package com.sdz.comportements_garage;

public class SiegeChauffant implements Option {
	public double Prix;
	
	public SiegeChauffant(){
		this.Prix = 2500.25;
		System.out.println("Je suis un si�ge chauffant");
	}
	@Override
	public double getPrix() {
		// TODO Auto-generated method stub
		return Prix;
	}

	public String toString(){
		return "Si�ge Chauffant ("+Prix+"�)";
	}
}
