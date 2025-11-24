package ar.edu.info.oo1.parcialObjetos251raFecha;

import java.time.LocalDate;

public class ContratoDeHoras extends Contrato {
  private double valorHora;
  private int horasMensuales;
  private LocalDate fechaFin;

  public ContratoDeHoras(LocalDate fechaIni, double valorH, int horasM, LocalDate fechaFin) {
    super(fechaIni);
    this.valorHora = valorH;
    this.horasMensuales = horasM;
    this.fechaFin = fechaFin;
  }

  @Override
  public double calcularSueldoBasico() {
    return 0;
  }

  @Override
  public boolean estaVigente() {
    return false;
  }

}
