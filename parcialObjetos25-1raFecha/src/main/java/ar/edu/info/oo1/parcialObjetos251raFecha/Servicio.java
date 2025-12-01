package ar.edu.info.oo1.parcialObjetos251raFecha;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Servicio {
  private LocalDate fechaIni, fechaFin;
  private double costoDiario;

  public Servicio(LocalDate fechaIni, LocalDate fechaFin, double costoDiario) {
    this.fechaIni = fechaIni;
    this.fechaFin = fechaFin;
    this.costoDiario = costoDiario;

  }

  public double calcularCostoServicio() {
    long dias = ChronoUnit.DAYS.between(fechaIni, fechaFin);
    return dias * costoDiario;
  }

}
