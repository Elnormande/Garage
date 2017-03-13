package com.sdz.comportements_garage;

public class BarreDeToit implements Option{
public double Prix;
	
	public BarreDeToit(){
		this.Prix = 400;
	}
	
	public Double getPrix() {
		return Prix;
	}
	
	public String toString(){
		return "Barres de toit ("+Prix+"€)";
	}
}
