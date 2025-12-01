package ar.edu.info.oo1.parcialObjetos251raFecha;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
  private String nombre;
  private List<Servicio> listaServicios;

  public Usuario(String nom) {
    this.nombre = nom;
    this.listaServicios = new ArrayList<Servicio>();
  }

  public void agregarServicio(Servicio ser) {
    listaServicios.add(ser);
  }

  public double calcularGastoTotal() {
    return this.listaServicios.stream().mapToDouble(s -> s.calcularCostoServicio()).sum();
  }

  public String getNombre() {
    return nombre;
  }
}
