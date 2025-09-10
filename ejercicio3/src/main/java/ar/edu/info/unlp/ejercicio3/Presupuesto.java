package ar.edu.info.unlp.ejercicio3;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Presupuesto {
  private LocalDate fecha;
  private String cliente;
  private List<Item> items;

  public Presupuesto(String cli) {
    this.setCliente(cli);
    this.setFecha();
    this.items = new LinkedList<Item>();
  }

  public void setCliente(String cliente) {
    this.cliente = cliente;
  }

  public void setFecha() {
    this.fecha = LocalDate.now();
  }

  public String getCliente() {
    return cliente;
  }

  public LocalDate getFecha() {
    return fecha;
  }

  public void agregarItem(Item item) {
    this.items.add(item);
  }

  public Double calcularTotal() {
    return this.items.stream().mapToDouble(item -> item.costo()).sum();
  }

}
