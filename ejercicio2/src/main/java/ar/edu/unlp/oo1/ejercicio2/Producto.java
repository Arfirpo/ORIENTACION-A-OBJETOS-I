package ar.edu.unlp.oo1.ejercicio2;

public class Producto {
	private Double peso;
	private Double precioPorKilo;
	private String descripcion;

	public Producto(String desc, Double peso, Integer ppk) {
		this.setPeso(peso);
		this.setPrecioPorKilo(ppk.doubleValue());
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

	public void setPrecioPorKilo(Integer precioPorKilo){
		this.precioPorKilo = precioPorKilo.doubleValue();
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
		return this.getPrecioPorKilo() * this.getPeso();
	}

}
