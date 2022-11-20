package org.iesalandalus.programacion.reinaajedrez.modelo;

public enum Color {

	BLANCO("blanco"), 
	NEGRO("negro");
	
	private Color(String cadenaAMostrar) {
		this.cadenaAMostrar = cadenaAMostrar;
	}
	
	private String cadenaAMostrar;
	
	public String toString() {
		return cadenaAMostrar;
	}
}