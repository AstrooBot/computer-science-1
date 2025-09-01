package co.edu.udistrital.view;

import java.util.Scanner;

public class VistaConsola {

	private Scanner sc;
	
	public VistaConsola() {
		sc = new Scanner(System.in);
	}
	
	public void imprimir(String mensaje) {
		System.out.println(mensaje);
	}
	
	public String leer(String mensaje) {
		System.out.println(mensaje);
		String dato = sc.nextLine();
		return dato;
	}
	
}
