package org.iesalandalus.programacion.reinaajedrez.modelo;

public enum Color {

	BLANCO("Blanco"), 
	NEGRO("Negro");
	
	private Color(String cadenaAMostrar) {
		this.cadenaAMostrar = cadenaAMostrar;
	}
	
	private String cadenaAMostrar;
	
	public String toString() {
		return cadenaAMostrar;
	}
}