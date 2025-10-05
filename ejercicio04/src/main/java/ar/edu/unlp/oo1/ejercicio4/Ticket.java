package ar.edu.unlp.oo1.ejercicio4;

import java.time.LocalDate;
import java.util.List;

public class Ticket {
	private LocalDate fecha;
	private List<Producto> productos;

	public Ticket(Integer cantProd, Double pesoTot, double precioTot) {
		this.setFecha();
	}

	public Ticket(List<Producto> prods){
		this.productos = prods;
	}


	public void setFecha() {
		this.fecha = LocalDate.now();
	}

	public Integer getCantidadDeProductos() {
		return this.productos.size();
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public Double getPesoTotal() {
		return this.productos.stream().mapToDouble(prod -> prod.getPeso()).sum();
	}

	public Double getPrecioTotal() {
		return this.productos.stream().mapToDouble(prod -> prod.getPrecio()).sum();
	}

	public double impuesto() {
		return this.getPrecioTotal() * 0.21;
	}

}
