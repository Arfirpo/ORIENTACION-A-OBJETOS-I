package ar.edu.unlp.oo1.ejercicio2;

public class Balanza {
	private Integer cantidadDeProductos;
	private Double precioTotal;
	private Double pesoTotal;

	public Balanza() {
		this.ponerEnCero();
	}

	public void setCantidadDeProductos(Integer cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
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

	public Double getPesoTotal() {
		return pesoTotal;
	}

	public Double getPrecioTotal() {
		return precioTotal;
	}

	public void ponerEnCero() {
		this.cantidadDeProductos = 0;
		this.setPrecioTotal(0.0);
		this.setPesoTotal(0.0);
	}

	public void agregarProducto(Producto prod) {
		this.cantidadDeProductos++;
		this.precioTotal += prod.getPrecio();
		this.pesoTotal += prod.getPeso();

	}

	public Ticket emitirTicket() {
		return new Ticket(this.getCantidadDeProductos(), this.getPesoTotal(), this.getPrecioTotal());
	}
}
