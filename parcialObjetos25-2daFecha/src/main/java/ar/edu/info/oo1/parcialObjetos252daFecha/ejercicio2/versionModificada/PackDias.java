package ar.edu.info.oo1.parcialObjetos252daFecha.ejercicio2.versionModificada;

import java.time.LocalDate;

public class PackDias extends Suscripcion {
  private int cantDias;

  public PackDias(LocalDate fechaIni, double precioU, int cantDias) {
    super(fechaIni, precioU);
    this.cantDias = cantDias;
  }

  @Override
  protected double calcularCosto() {
    return this.cantDias * this.getPrecioUnitario();
  }
}
