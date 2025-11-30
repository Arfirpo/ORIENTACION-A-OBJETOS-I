package ar.edu.info.oo1.parcialObjetos252daFecha.ejercicio2.versionModificada;

import java.time.LocalDate;

public abstract class Suscripcion {
  private LocalDate fechaInicio;
  private double precioUnitario;

  public Suscripcion(LocalDate fechaIni, double precioU) {
    this.fechaInicio = fechaIni;
    this.precioUnitario = precioU;
  }

  private double calcularMontoConIVA(double valor) {
    double IVA = valor * 0.21;
    return valor + IVA;
  }

  private double calcularRecargo(LocalDate fechaPago, double monto) {
    return fechaPago.isAfter(this.fechaInicio) ? monto * 0.3 : 0.0;
  }

  public double montoAPagar(LocalDate fechaPago) {
    double costo = this.calcularCosto();
    double recargo = this.calcularRecargo(fechaPago, costo);
    return this.calcularMontoConIVA(costo + recargo);
  }

  public LocalDate getFechaInicio() {
    return fechaInicio;
  }

  public double getPrecioUnitario() {
    return precioUnitario;
  }

  protected abstract double calcularCosto();
}
