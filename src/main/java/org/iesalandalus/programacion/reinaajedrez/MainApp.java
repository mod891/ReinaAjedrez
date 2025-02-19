package org.iesalandalus.programacion.reinaajedrez;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.reinaajedrez.modelo.Color;
import org.iesalandalus.programacion.reinaajedrez.modelo.Direccion;
import org.iesalandalus.programacion.reinaajedrez.modelo.Reina;

public class MainApp {
	
	private static Reina reina = null;
	
	private static void ejecutarOpcion(int opcion) {
		
		switch (opcion) {
		case 1: 
			crearReinaDefecto();
			break;
		case 2:
			crearReinaColor();
			break;
		case 3:
			mover();
			break;
		case 4:
			mostrarReina();
			break;
		case 5:
			Consola.despedirse();
			break;
		}
	}
	
	private static void crearReinaDefecto() {
		try {

			reina = new Reina();
		} catch (IllegalArgumentException | NullPointerException e) { 
			System.out.println(e.getMessage());
		}
	}
	
	private static void crearReinaColor() {	
		try {

			Color color = Consola.elegirColor();
			reina = new Reina(color);	
		} catch (IllegalArgumentException | NullPointerException e) { 
			System.out.println(e.getMessage());
		}
	}
	
	private static void mover() {
		
		Consola.mostrarMenuDirecciones();
		Direccion direccion = Consola.elegirDireccion();
		int pasos = Consola.elegirPasos();
		try {	
			reina.mover(direccion, pasos);
		} catch (OperationNotSupportedException e) {
			System.out.println(e.getMessage());
		}
		
	}
	private static void mostrarReina() {
		
		if (reina != null) {
			System.out.println(reina.toString());
		} 
		else 
			System.out.println("La reina no ha sido creada");
	}
	public static void main(String[] args) {
		
		int opcion;
		do {
			Consola.mostrarMenu();
			opcion = Consola.elegirOpcionMenu();
			ejecutarOpcion(opcion);
		} while (opcion != 5);
	}
}
