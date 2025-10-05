package ar.edu.unlp.oo1.ejercicio5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo implements Inversion {
  private double valorInicial;
  private double tasaDeInteres;
  private LocalDate fechaConstitucion;

  public PlazoFijo(double montoIni, double tasa, LocalDate fecha) {
    this.setTasaDeInteres(tasa);
    this.setValorInicial(montoIni);
    this.setFechaConstitucion(fecha);
  }

  public double valorActual() {
    long dias = ChronoUnit.DAYS.between(fechaConstitucion, LocalDate.now());
    return this.getValorInicial() + (this.getValorInicial() * this.getTasaDeInteres() * dias);
  }

  public void setValorInicial(double valorInicial) {
    this.valorInicial = valorInicial;
  }

  public void setTasaDeInteres(double tasaDeInteres) {
    this.tasaDeInteres = tasaDeInteres;
  }

  public void setFechaConstitucion(LocalDate fecha) {
    this.fechaConstitucion = fecha;
  }

  public double getValorInicial() {
    return valorInicial;
  }

  public double getTasaDeInteres() {
    return tasaDeInteres;
  }

  public LocalDate getFechaConstitucion() {
    return fechaConstitucion;
  }
}
