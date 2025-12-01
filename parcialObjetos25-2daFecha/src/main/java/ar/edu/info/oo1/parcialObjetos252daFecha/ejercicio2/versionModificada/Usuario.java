package ar.edu.info.oo1.parcialObjetos252daFecha.ejercicio2.versionModificada;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
  private String nombre, email;
  private List<Suscripcion> suscripciones;

  public Usuario(String nom, String email, Suscripcion s) {
    this.nombre = nom;
    this.email = email;
    this.suscripciones = new ArrayList<Suscripcion>();
    this.agregarSuscripcion(s);
  }

  public void agregarSuscripcion(Suscripcion s) {
    this.suscripciones.add(s);
  }

  public double montoAPagar(LocalDate fechaPago) {
    return this.suscripciones.stream().mapToDouble(s -> s.montoAPagar(fechaPago)).sum();
  }
}
