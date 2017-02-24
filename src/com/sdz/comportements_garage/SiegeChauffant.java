package com.sdz.comportements_garage;

public class SiegeChauffant implements Option {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4733582358308067699L;
	public double Prix;
	
	public SiegeChauffant(){
		this.Prix = 2500.25;
	}


	public double getPrix() {
		return Prix;
	}

	public String toSting(){
		return "Siège Chauffant ("+Prix+"€)";
	}
}
