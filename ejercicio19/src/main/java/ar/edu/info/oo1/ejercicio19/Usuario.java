package ar.edu.info.oo1.ejercicio19;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
  private String nombre;
  private String dni;
  private Direccion dir;
  private List<Inmueble> alquileres;
  private List<Reserva> reservas;

  public Usuario(String nom, String dni, Direccion dir) {
    this.setNombre(nom);
    this.setDni(dni);
    this.setDir(dir);
    this.alquileres = new ArrayList<Inmueble>();
    this.reservas = new ArrayList<Reserva>();
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setDni(String dni) {
    this.dni = dni;
  }

  public void setDir(Direccion dir) {
    this.dir = dir;
  }

  public String getNombre() {
    return nombre;
  }

  public String getDni() {
    return dni;
  }

  public String getDir() {
    return dir.toString();
  }

  public boolean crearReserva(Inmueble inm, LocalDate fechaIni, LocalDate fechaFin) {
    boolean ok = false;
    if (inm.estaDisponible(inm, fechaIni, fechaFin)) {
      this.reservas.add(new Reserva(fechaIni, fechaFin, inm, this));
      ok = true;
    }
    return ok;
  }

  public boolean cancelarReserva(Inmueble inm){
    boolean ok = false;
    Reserva r = this.reservas.stream().filter(r -> r.getInmueble().equals(inm)).findFirst().;
    return ok;
  }
}
