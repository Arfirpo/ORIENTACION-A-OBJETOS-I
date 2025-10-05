package ar.edu.info.oo1.ejercicio13;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo implements Inversion {

  private double valorInicial;
  private double tasaInteres;
  private LocalDate fechaConstitucon;

  public PlazoFijo(double monto, double tasaInt) {
    this.valorInicial = monto;
    this.tasaInteres = tasaInt;
    this.fechaConstitucon = LocalDate.now();
  }

  public void setValorInicial(double valorInicial) {
    this.valorInicial = valorInicial;
  }

  public void setTasaInteres(double tasaInteres) {
    this.tasaInteres = tasaInteres;
  }

  public void setFechaConstitucon(LocalDate fechaConstitucon) {
    this.fechaConstitucon = fechaConstitucon;
  }

  public double getValorInicial() {
    return valorInicial;
  }

  public double getTasaInteres() {
    return tasaInteres;
  }

  public LocalDate getFechaConstitucon() {
    return fechaConstitucon;
  }

  @Override
  public double valorActual() {
    int cantDias = Math.toIntExact(ChronoUnit.DAYS.between(this.fechaConstitucon, LocalDate.now())) + 1;

    return this.valorInicial * Math.pow(1+ this.tasaInteres, cantDias);

  }
}
