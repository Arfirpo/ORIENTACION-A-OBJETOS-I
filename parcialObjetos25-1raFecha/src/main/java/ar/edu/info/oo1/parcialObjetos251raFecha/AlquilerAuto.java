package ar.edu.info.oo1.parcialObjetos251raFecha;

import java.time.LocalDate;

public class AlquilerAuto extends Servicio {
  private double costoPorKm, kmRecorridos;
  private String tipoVehiculo;

  public AlquilerAuto(LocalDate fechaIni, LocalDate fechaFin, double costoDiario, double costoKm, double kmRecorridos,
      String tipoV) {
    super(fechaIni, fechaFin, costoDiario);
    this.costoPorKm = costoKm;
    this.kmRecorridos = kmRecorridos;
    this.tipoVehiculo = tipoV;
  }

  @Override
  public double calcularCostoServicio() {
    return (costoPorKm * kmRecorridos) + super.calcularCostoServicio();
  }

  public String getTipoVehiculo() {
    return tipoVehiculo;
  }

}
