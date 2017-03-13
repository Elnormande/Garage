package com.sdz.comportements_garage;

public class Climatisation implements Option{
public double Prix;
	
	public Climatisation(){
		this.Prix = 650;
	}
	
	public Double getPrix() {
		return Prix;
	}
	
	public String toString(){
		return "Climatisation ("+Prix+"€)";
	}
}
