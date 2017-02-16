package com.sdz.comportements_garage;

public class GPS implements Option{
	public double Prix;
	
	public GPS(){
		this.Prix = 350.25;
		System.out.println("Je suis un GPS");
	}
	
	public double getPrix() {
		return Prix;
	}
	
	public String toString(){
		return "GPS ("+Prix+"€)";
	}
	
}
