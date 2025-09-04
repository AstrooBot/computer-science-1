package co.edu.udistrital.controller;

import co.edu.udistrital.model.Directorio;
import co.edu.udistrital.model.Empresa;
import co.edu.udistrital.view.VistaConsola;

public class Controller {
	
	private VistaConsola vista;
	private Directorio directorio;
	private Ordenador ordenador;
	
	public Controller() {
		vista = new VistaConsola();
		directorio = new Directorio(5);
		ordenador = new Ordenador(directorio);
	}

	public void seleccionarOrdenamiento(int ordenamiento, String[] criterio, boolean descendente) {
		switch (ordenamiento) {
			case 1:
				ordenador.burbuja(criterio, descendente);
				break;
			case 2:
				ordenador.insercion(criterio, descendente);
				break;
			default:
				vista.imprimir("Metodo de ordenamiento no valido");
		}
	}

	public void seleccionarOrdenamiento(int ordenamiento, long[] criterio, boolean descendente) {
		switch (ordenamiento) {
			case 1:
				ordenador.burbuja(criterio, descendente);
				break;
			case 2:
				ordenador.insercion(criterio, descendente);
				break;
			default:
				vista.imprimir("Metodo de ordenamiento no valido");
		}
	}

	public boolean esDescendente(int descendente) {
		boolean resultado = false;
		switch (descendente) {
			case 1:
				resultado = true;
				break;
			case 2:
				resultado = false;
				break;
			default:
				break;
		}
		return resultado;
	}

	public String[] seleccionarCriterio(int criterio) {
		String[] resultado = null;
		switch (criterio) {
			case 1:
				 resultado = this.ordenador.getByCriterio("nombre");
				break;
			case 2:
				resultado = this.ordenador.getByCriterio("fechaCreacion");
				break;
			case 3:
				resultado = this.ordenador.getByCriterio("ventas");
				break;
			case 4:
				resultado = this.ordenador.getByCriterio("numClientes");
				break;
			default:
				break;
		}
		return resultado;
	}
	
	public void run() {

		Empresa emp1 = new Empresa();
		emp1.setNombre("Textiles LuisP");
		emp1.setFechaCreacion("20/03/2008");
		emp1.setVentas(37456000);
		emp1.setNumClientes(342);

		Empresa emp2 = new Empresa();
		emp2.setNombre("Comidas Rapidas: Que Alitas");
		emp2.setFechaCreacion("25/12/2018");
		emp2.setVentas(62876000);
		emp2.setNumClientes(2347);

		Empresa emp3 = new Empresa();
		emp3.setNombre("Panaderia DKCH");
		emp3.setFechaCreacion("14/04/2015");
		emp3.setVentas(123345000);
		emp3.setNumClientes(5654);
		
		Empresa emp4 = new Empresa();
		emp4.setNombre("Zapateria Donde Mercedes");
		emp4.setFechaCreacion("17/03/2000");
		emp4.setVentas(12500000);
		emp4.setNumClientes(398);

		Empresa emp5 = new Empresa();
		emp5.setNombre("Supermercado San Juan");
		emp5.setFechaCreacion("10/06/1999");
		emp5.setVentas(92889000);
		emp5.setNumClientes(2654);

		directorio.añadir(emp1);
		directorio.añadir(emp2);
		directorio.añadir(emp3);
		directorio.añadir(emp4);
		directorio.añadir(emp5);

		int ordenamiento = Integer.parseInt(vista.leer("Metodo de ordenamiento: \n 1.Burbuja \n 2.Insercion"));
		int criterio = Integer.parseInt(vista.leer("Criterio de ordenamiento: \n 1.Nombre \n 2.Fecha de Creacion \n 3.Ventas \n 4.Numero de Clientes"));
		int descendente = Integer.parseInt(vista.leer("Ordenar de forma descendente? \n 1.si \n 2.no"));

		this.seleccionarOrdenamiento(ordenamiento, this.seleccionarCriterio(criterio), this.esDescendente(descendente));
		
		if(criterio == 2) {
		String tipoFecha = vista.leer("Valor de fecha a tomar: \n 1. Dia \n 2. Mes \n 3. Año ");
		this.seleccionarOrdenamiento(ordenamiento, this.ordenador.getByDate(this.seleccionarCriterio(2), tipoFecha), this.esDescendente(descendente));}

		vista.imprimir("Has seleccionado: \n"+ "Algoritmo: " + Integer.toString(ordenamiento) + "Criterio: " + Integer.toString(criterio) + "\n Ordenamiento: " + Integer.toString(criterio) + "\n Descendente: " + Integer.toString(descendente));
		vista.imprimir("Directorio de Empresas:");
		vista.imprimir(directorio.mostrar());


	}

}
