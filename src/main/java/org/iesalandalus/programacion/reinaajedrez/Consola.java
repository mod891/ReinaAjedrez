package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.reinaajedrez.modelo.Direccion;
import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {

	private Consola() {}
	
	
	public void mostrarMenu() {
		System.out.println("\nMENU\n----\n");
		System.out.println("1: Crear reina por defecto");
		System.out.println("2: Crear reina eligiendo el color\n");
		System.out.println("3: Mover\n");
		System.out.println("4: Salir\n");
		
	}
	
	public int elegirOpcionMenu() {
		
		int opcion;
		System.out.println("Elige una opción [1-4]");
		
		do {
			opcion = Entrada.entero();
		} while (opcion < 1 || opcion > 4);
		
		return opcion;
	}
	public void mostrarMenuDirecciones() {
		for (int i=0; i<Direccion.values().length; i++) {
			System.out.println(i+":"+Direccion.values()[i]);
		}
	}
	public Direccion elegirDireccion() {
		int opcion;
		System.out.println("Elija una dirección");
		
		do {
			opcion = Entrada.entero();
		} while (opcion < 0 || opcion > Direccion.values().length-10);
		
		return Direccion.values()[opcion];
	}
	
	public int elegirPasos() {
		
		System.out.println("Elige el número de pasos a mover");
		return Entrada.entero();
	}
	
	public void despedirse() {
		System.out.println("Adios");
	}
}
