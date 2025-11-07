package ar.edu.info.oo1.ejercicio19;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Inmueble {
  private String nombre;
  private Direccion dir;
  private double precioNoche;
  private List<Reserva> reservas;

  public Inmueble(String nom, Direccion dir, double precio) {
    this.setNombre(nom);
    this.setPrecioNoche(precio);
    this.setDir(dir);
    this.reservas = new ArrayList<Reserva>();
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setDir(Direccion dir) {
    this.dir = dir;
  }

  public void setPrecioNoche(double precioNoche) {
    this.precioNoche = precioNoche;
  }

  public double getPrecioNoche() {
    return precioNoche;
  }

  public boolean estaDisponible(Inmueble inm, LocalDate fechaIni, LocalDate fechaFin) {
    DateLapse periodo = new DateLapse(fechaIni, fechaFin);
    return this.reservas.stream().noneMatch(r -> r.getFecha().overlapse(periodo));
  }
}
