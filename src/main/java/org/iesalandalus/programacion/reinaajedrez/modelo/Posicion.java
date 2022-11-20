package org.iesalandalus.programacion.reinaajedrez.modelo;

public class Posicion {

	private int fila;
	private char columna;
	
	public Posicion(int fila, char columna) {
		setFila(fila);
		setColumna(columna);
	}
	public int getFila() {
		return fila;
	}
	public void setFila(int fila) {
		if (fila < 1 || fila > 8) 
			throw new IllegalArgumentException();
		this.fila = fila;
		
	}
	public char getColumna() {
		return columna;
	}
	public void setColumna(char columna) {
		if ((int) columna < 97 || (int) columna > 104 )
			throw new IllegalArgumentException();

		this.columna = columna;
	}
}
