package com.sdz.comportements_garage;

public class VitreElectrique implements Option{
public double Prix;
	
	public VitreElectrique(){
		this.Prix = 550;
	}
	
	public double getPrix() {
		return Prix;
	}
	
	public String toString(){
		return "Vitre électrique ("+Prix+"€)";
	}
}
