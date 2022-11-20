package org.iesalandalus.programacion.reinaajedrez.modelo;

public class Reina {
	
	private Posicion posicion;
	private Color color;
	
	public Posicion getPosicion() {
		return posicion;
	}
	public void setPosicion(Posicion posicion) {
		if (posicion == null)
			throw new NullPointerException();
		
		this.posicion = posicion;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		if (color == null)
			throw new NullPointerException();
		
		this.color = color;
	}
	
}
