package ar.edu.info.oo1.parcialObjetos252daFecha.ejercicio2.versionOriginal;

import java.time.LocalDate;

public class SuscripcionPackPromo {
  private LocalDate fechaInicio;
  private int cantidadDias;
  private double precioPorDia;

  public SuscripcionPackPromo(LocalDate fechaInicio, int cantDias, double precioPorDia) {
    this.fechaInicio = fechaInicio;
    this.cantidadDias = cantDias;
    this.precioPorDia = precioPorDia;
  }

  private double calcularMontoConIVA(double valor) {
    double IVA = valor * 0.21;
    return valor + IVA;
  }

  private double calcularRecargo(LocalDate fechaPago, double monto) {
    return fechaPago.isAfter(this.fechaInicio) ? monto * 0.3 : 0.0;
  }

  public double montoAPagar(LocalDate fechaPago) {
    double costo = this.precioPorDia * this.cantidadDias;
    double recargo = this.calcularRecargo(fechaPago, costo);
    return this.calcularMontoConIVA(costo + recargo);
  }

}
