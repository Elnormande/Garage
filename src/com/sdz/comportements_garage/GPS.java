package com.sdz.comportements_garage;

public class GPS implements Option{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4388532799690202981L;
	public double Prix;
	
	public GPS(){
		this.Prix = 350.25;
	}
	
	public double getPrix() {
		return Prix;
	}
	
	public String toString(){
		return "GPS ("+Prix+"€)";
	}
}
