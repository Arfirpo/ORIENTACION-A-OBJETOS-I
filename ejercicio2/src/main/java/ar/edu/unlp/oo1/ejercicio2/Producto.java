package ar.edu.unlp.oo1.ejercicio2;

public class Producto {
	private Double peso;
	private Double precioPorKilo;
	private String descripcion;

	public Producto(Double peso, Double ppk, String desc) {
		this.setPeso(peso);
		this.setPrecioPorKilo(ppk);
		this.setDescripcion(desc);
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public void setPrecioPorKilo(Double precioPorKilo) {
		this.precioPorKilo = precioPorKilo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public Double getPeso() {
		return peso;
	}

	public Double getPrecioPorKilo() {
		return precioPorKilo;
	}

	public Double getPrecio() {
		int kilos = this.getPeso().intValue();
		return kilos * this.getPrecioPorKilo();
	}

}
