package com.sdz.comportements_garage;

import java.io.Serializable;

public interface Option extends Serializable{
	double prix=0;	
	
	public default double getPrix() {
		// TODO Auto-generated method stub
		return prix;
	}
	public String toString();
}
