package ar.edu.info.oo1.parcialObjetos251raFecha;

import java.time.LocalDate;

public class Estadia extends Servicio {
  private String destino;
  private int cantidadPersonas;

  public Estadia(LocalDate fechaIni, LocalDate fechaFin, double costoDiario, String destino, int cantPer) {
    super(fechaIni, fechaFin, costoDiario);
    this.destino = destino;
    this.cantidadPersonas = cantPer;
  }

  @Override
  public double calcularCostoServicio() {
    return this.cantidadPersonas * super.calcularCostoServicio();
  }


}
