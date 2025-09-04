package co.edu.udistrital.model;

public class Empresa {

	private String nombre;
	private String fechaCreacion;
	private long ventas;
	private long numClientes;
	
	public Empresa() {
		this.nombre = "";
		this.fechaCreacion = "";
		this.ventas = 0;
		this.numClientes = 0;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public long getVentas() {
		return ventas;
	}

	public void setVentas(long ventas) {
		this.ventas = ventas;
	}

	public long getNumClientes() {
		return numClientes;
	}

	public void setNumClientes(long numClientes) {
		this.numClientes = numClientes;
	}

	@Override
	public String toString() {
		return "Empresa [nombre=" + this.nombre + ", fechaCreacion=" + this.fechaCreacion + ", ventas=" + this.ventas + ", numClientes=" + this.numClientes
				+ "]";
	}	
	
}
