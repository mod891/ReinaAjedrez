package org.iesalandalus.programacion.reinaajedrez.modelo;

import java.util.Objects;

public class Posicion {

	private int fila;
	private char columna;
	
	public Posicion(int fila, char columna) {
		
		setFila(fila);
		setColumna(columna);
	}
	
	public Posicion(Posicion copia) {
	
		if (copia == null) 
			throw new NullPointerException();
	
		setFila(copia.getFila());
		setColumna(copia.getColumna());
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

	@Override
	public int hashCode() {
		return Objects.hash(columna, fila);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Posicion other = (Posicion) obj;
		return columna == other.columna && fila == other.fila;
	}

	@Override
	public String toString() {
		return "Posicion [fila=" + fila + ", columna=" + columna + "]";
	}
}
