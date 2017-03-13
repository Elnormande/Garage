package com.sdz.comportements_garage;

public class SiegeChauffant implements Option {
	
	public double Prix;
	
	public SiegeChauffant(){
		this.Prix = 2500.25d;
	}

	public Double getPrix() {
		return Prix;
	}

	public String toString(){
		return "Sièges Chauffants ("+Prix+"€)";
	}
}
