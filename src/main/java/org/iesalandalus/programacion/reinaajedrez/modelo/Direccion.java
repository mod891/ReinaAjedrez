package org.iesalandalus.programacion.reinaajedrez.modelo;

public enum Direccion {
	NORTE("Norte"), 
	NORESTE("Noreste"),
	ESTE("Este"),
	SURESTE("Sureste"),
	SUR("Sur"),
	SUROESTE("Suroeste"),
	OESTE("Oeste"),
	NOROESTE("Noroeste");
	
	private Direccion(String cadenaAMostrar) {
		this.cadenaAMostrar = cadenaAMostrar;
	}
	
	private String cadenaAMostrar;
	
	public String toString() {
		return cadenaAMostrar;
	}
}
