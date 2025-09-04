package co.edu.udistrital.model;

public class Directorio {

	private Empresa listEmpresas[];
	private int tamano;
	private int ocupados;
	
	public Directorio(int tamano) {
		this.tamano = tamano;
		this.ocupados = 0;
		listEmpresas = new Empresa[tamano];
	}
	
	public boolean añadir(Empresa x) {
		if( this.ocupados < this.tamano) {
			this.listEmpresas[this.ocupados] = x;
			this.ocupados++;
			return true;
		}
		return false;
	}

	public int getTamano() {
		return tamano;
	}

	public int getOcupados() {
		return this.ocupados;
	}

	public void invertir() {
		Empresa[] newArr = new Empresa[this.tamano];
		for(int i = 0; i < listEmpresas.length; i++) {
            newArr[i] = this.listEmpresas[listEmpresas.length - 1 - i];
        }
		this.listEmpresas = newArr;

	}

	public void eliminar(int posicion) {

		if(posicion >= 0 && posicion <= this.ocupados) {
			this.listEmpresas[posicion] = null;
			this.ocupados--;
			for(int i = posicion; i < this.ocupados; i++) {
				this.listEmpresas[i] = this.listEmpresas[i+1];
			}
		}
	}

	public Empresa buscar(int posicion) {
		if(posicion >= 0 && posicion <= this.ocupados) {
			return this.listEmpresas[posicion];
		}
		return null;
	}

	public void mover(int posicionVieja, int posicionNueva) {

		if(posicionVieja >= 0 && posicionVieja <= this.ocupados && posicionNueva >= 0 && posicionNueva <= this.ocupados) {
			Empresa temp = this.listEmpresas[posicionVieja];
			this.listEmpresas[posicionVieja] = this.listEmpresas[posicionNueva];
			this.listEmpresas[posicionNueva] = temp;
		}
	}

	public String mostrar() {
		String acum = "";
		for (int i = 0; i < this.ocupados; i++) {
			acum += Integer.toString(i) + " " + this.listEmpresas[i] + "\n";
		}
		return acum;
	}
}
