package ar.edu.info.oo1.parcialObjetos251raFecha;

import java.time.LocalDate;

public abstract class Contrato {
  private LocalDate fechaInicio;

  public Contrato(LocalDate fechaIni) {
    this.fechaInicio = fechaIni;
  }

  public abstract double calcularSueldoBasico();

  public abstract boolean estaVigente();
}
