package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.reinaajedrez.modelo.Color;
import org.iesalandalus.programacion.reinaajedrez.modelo.Direccion;
import org.iesalandalus.programacion.reinaajedrez.modelo.Reina;
import org.iesalandalus.programacion.reinaajedrez.Consola;
public class MainApp {
	
	private static Reina reina;
	
	private static void ejecutarOpcion(int opcion) {
		switch (opcion) {
		case 1: 
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		}
	}
	
	private static void crearReinaDefecto() {
		reina = new Reina();
	}
	
	private static void crearReinaColor() {	
		Color color = Consola.elegirColor();
		reina = new Reina(color);
	}
	
	private static void mover() {
		Consola.mostrarMenuDirecciones();
		Direccion direccion = Consola.elegirDireccion();
		int pasos = Consola.elegirPasos();
		try {
			
			reina.mover(direccion, pasos);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) {
		
	}
}
