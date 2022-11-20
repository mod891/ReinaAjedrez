package org.iesalandalus.programacion.reinaajedrez.modelo;

public class Reina {
	
	private Posicion posicion;
	private Color color;
	
	public Reina() {
		setPosicion(new Posicion(1,'d'));
		setColor(Color.BLANCO);
	}
	//rea y que creará una reina de dicho color cuya posición será '1d' si es blanca o '8b' si es negra. Realiza un commit.
	public Reina(Color color) {
		if (color == null)
			throw new NullPointerException();
		
		if (color == Color.BLANCO) {
			setPosicion(new Posicion(1,'d'));
			setColor(Color.BLANCO);
		} else {
			setPosicion(new Posicion(8,'b'));
			setColor(Color.NEGRO);
		}
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