package ar.edu.info.oo1.ejercicio13;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo implements Inversion {

  private double valorInicial;
  private double interesAnual;
  private LocalDate fechaConstitucon;

  public PlazoFijo(double monto, double tasaInt) {
    this.valorInicial = monto;
    this.interesAnual = tasaInt;
    this.fechaConstitucon = LocalDate.now();
  }

  public PlazoFijo(double monto, double tasaInt, LocalDate fecha) {
    this.valorInicial = monto;
    this.interesAnual = tasaInt;
    this.fechaConstitucon = fecha;
  }

  public void setValorInicial(double valorInicial) {
    this.valorInicial = valorInicial;
  }

  public void setinteresAnual(double interesAnual) {
    this.interesAnual = interesAnual;
  }

  public void setFechaConstitucon(LocalDate fechaConstitucon) {
    this.fechaConstitucon = fechaConstitucon;
  }

  public double getValorInicial() {
    return valorInicial;
  }

  public double getinteresAnual() {
    return interesAnual;
  }

  public LocalDate getFechaConstitucon() {
    return fechaConstitucon;
  }

  @Override
  public double valorActual() {
    int cantDias = Math.toIntExact(ChronoUnit.DAYS.between(this.fechaConstitucon, LocalDate.now())) + 1;

    return Math.round((this.valorInicial * Math.pow(1 + (this.interesAnual / 365), cantDias) * 100.00)) / 100.00;
  }
}
