package org.iesalandalus.programacion.reinaajedrez.modelo;

public class Reina {
	
	private Posicion posicion;
	private Color color;
	
	public Reina() {
		setPosicion(new Posicion(1,'d'));
		setColor(Color.BLANCO);
	}
	
	public Posicion getPosicion() {
		return posicion;
	}
	public void setPosicion(Posicion posicion) {
		if (posicion == null)
			throw new NullPointerException("Error");
		
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
//Crea un constructor por defecto para esta clase que cree una reina blanca en la posición '1d'. Realiza un commit.