package org.iesalandalus.programacion.reinaajedrez.modelo;

import javax.naming.OperationNotSupportedException;

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
			throw new NullPointerException("ERROR: El color no puede ser nulo.");
		
		if (color == Color.BLANCO) {
			setPosicion(new Posicion(1,'d'));
			setColor(Color.BLANCO);
		} else {
			setPosicion(new Posicion(8,'d'));
			setColor(Color.NEGRO);
		}
	}
	public Posicion getPosicion() {
		return posicion;
	}
	public void setPosicion(Posicion posicion) {
		if (posicion == null)
			throw new NullPointerException("Error");
		
		this.posicion = new Posicion(posicion);
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		if (color == null)
			throw new NullPointerException();
		
		this.color = color;
	}
	public void mover(Direccion direccion, int pasos) throws OperationNotSupportedException {
		
		if (direccion == null) 
			throw new NullPointerException("ERROR: La dirección no puede ser nula.");
		
		Posicion posActual = this.getPosicion();
		char nuevaColumna;
		
		if (pasos >= 1 && pasos <= 7) {
			if (direccion != null) {
				
				switch (direccion) {
				
				case NORTE:
					//if (this.getColor() == Color.BLANCO) {
						if (posActual.getFila()+pasos <= 8) {
							this.setPosicion(new Posicion(posActual.getFila()+pasos,posActual.getColumna()));
						} else
							throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
					/*} else {
						if (posActual.getFila()+pasos <= 8) {
							this.setPosicion(new Posicion(posActual.getFila()+pasos,posActual.getColumna()));
						} else
							throw new OperationNotSupportedException();	
					}*/
					break;
				
				case NORESTE:
					if ((posActual.getFila()+pasos <= 8) &&	( (int) posActual.getColumna() + pasos <= 104 ) ) {
						this.setPosicion(new Posicion(posActual.getFila()+pasos,(char) ((int) posActual.getColumna()+pasos)));
					} else
						throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
					break;
			
				case ESTE:
					if ((int) posActual.getColumna()+pasos <= 104) { // h
						this.setPosicion(new Posicion(posActual.getFila(), (char) ((int) posActual.getColumna()+pasos)));
					} else
						throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
					break;
					
				case SURESTE:
					if ((posActual.getFila()-pasos >= 1) &&	( (int) posActual.getColumna() + pasos <= 104 ) ) 
						this.setPosicion(new Posicion(posActual.getFila()-pasos,(char) ((int) posActual.getColumna()+pasos)));
					else
						throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
					break;
					
				case SUR:
					if (posActual.getFila()-pasos >= 1) {
						this.setPosicion(new Posicion(posActual.getFila()-pasos,posActual.getColumna()));
					} else
						throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
					break;
					
				case SUROESTE:
					if ((posActual.getFila()-pasos >= 1) &&	( (int) posActual.getColumna() - pasos >= 97 ) ) 
						this.setPosicion(new Posicion(posActual.getFila()-pasos,(char) ((int) posActual.getColumna()-pasos)));
					 else
						throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
					break;
					
				case OESTE:
					if ((int) posActual.getColumna()-pasos >= 97) { // a
						this.setPosicion(new Posicion(posActual.getFila(), (char) ((int) posActual.getColumna()-pasos)));
					} else
						throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
					break;
					
				case NOROESTE:
					if ((posActual.getFila()+pasos <= 8) &&	( (int) posActual.getColumna() - pasos >= 97 ) ) 
						this.setPosicion(new Posicion(posActual.getFila()+pasos,(char) ((int) posActual.getColumna()-pasos)));
					else
						throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
					break;
				}
			}
		} else throw new IllegalArgumentException("ERROR: El número de pasos debe estar comprendido entre 1 y 7.");
	}
	@Override
	public String toString() {
		return "color=" + color + ", posicion=(" + posicion+")";
	}
}
//Crea un constructor por defecto para esta clase que cree una reina blanca en la posición '1d'. Realiza un commit.