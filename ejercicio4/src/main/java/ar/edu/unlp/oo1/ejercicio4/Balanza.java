package ar.edu.unlp.oo1.ejercicio4;

import java.util.LinkedList;
import java.util.List;

public class Balanza {
	private List<Producto> productos;

	public Balanza() {
		this.ponerEnCero();
	}

	public Integer getCantidadDeProductos() {
		return this.productos.size();
	}

	public Double getPesoTotal() {
		return this.productos.stream().mapToDouble(prod -> prod.getPeso()).sum();
	}

	public Double getPrecioTotal() {
		return this.productos.stream().mapToDouble(prod -> prod.getPrecio()).sum();
	}

	public void ponerEnCero() {
		if (this.productos != null && !this.productos.isEmpty())
			this.productos.clear();
		else
			this.productos = new LinkedList<Producto>();
	}

	public void agregarProducto(Producto prod) {
		this.productos.add(prod);
	}

	public List<Producto> getProductos() {
		return this.productos;
	}

	public Ticket emitirTicket() {
		return new Ticket(this.getCantidadDeProductos(), this.getPesoTotal(), this.getPrecioTotal());
	}
}
