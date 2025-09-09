package ar.edu.unlp.oo1.ejercicio2;

import java.time.LocalDate;

public class Ticket {
	private LocalDate fecha;
	private Integer cantidadDeProductos;
	private Double pesoTotal;
	private Double precioTotal;

	public Ticket(Integer cantProd, Double pesoTot, double precioTot) {
		this.setFecha();
		this.setCantidadDeProductos(cantProd);
		this.setPesoTotal(pesoTot);
		this.setPrecioTotal(precioTot);
	}

	public void setCantidadDeProductos(Integer cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
	}

	public void setFecha() {
		this.fecha = LocalDate.now();
	}

	public void setPesoTotal(Double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}

	public void setPrecioTotal(Double precioTotal) {
		this.precioTotal = precioTotal;
	}

	public Integer getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public Double getPesoTotal() {
		return pesoTotal;
	}

	public Double getPrecioTotal() {
		return precioTotal;
	}

	public double impuesto() {
		return this.getPrecioTotal() * 0.21;
	}

}
