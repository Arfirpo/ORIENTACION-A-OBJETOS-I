package ar.edu.info.oo1.parcialObjetos252daFecha.ejercicio2.versionOriginal;

import java.time.LocalDate;

public class Usuario {
  private String nombre, email;
  private SuscripcionPackPromo suscripcion;

  public Usuario(String nom, String email, SuscripcionPackPromo s) {
    this.nombre = nom;
    this.email = email;
    this.setSuscripcion(s);
  }

  public void setSuscripcion(SuscripcionPackPromo s) {
    this.suscripcion = s;
  }

  public double montoApagar(LocalDate fechaPago) {
    return this.suscripcion.montoAPagar(fechaPago);
  }
}
