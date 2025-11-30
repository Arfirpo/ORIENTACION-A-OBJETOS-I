package ar.edu.info.oo1.parcialObjetos252daFecha.ejercicio2.versionModificada;

import java.time.LocalDate;

public class PackGigas extends Suscripcion {
  private double cantGigas;

  public PackGigas(LocalDate fechaIni, double precioU, double cantGigas) {
    super(fechaIni, precioU);
    this.cantGigas = cantGigas;
  }

  @Override
  protected double calcularCosto() {
    return this.cantGigas * this.getPrecioUnitario();
  }
}
