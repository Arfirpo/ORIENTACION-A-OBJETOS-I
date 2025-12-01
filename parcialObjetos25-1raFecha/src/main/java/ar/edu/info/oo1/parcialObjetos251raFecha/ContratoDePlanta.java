package ar.edu.info.oo1.parcialObjetos251raFecha;

import java.time.LocalDate;

public class ContratoDePlanta extends Contrato {

  private double sueldoMensual, montoConyuge, montoHijos;

  public ContratoDePlanta(LocalDate fechaIni, double sueldoM, double montoC, double montoH) {
    super(fechaIni);
    this.sueldoMensual = sueldoM;
    this.montoConyuge = montoC;
    this.montoHijos = montoH;
  }




  @Override
  public double calcularSueldoBasico() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public boolean estaVigente() {
    // TODO Auto-generated method stub
    return false;
  }
}
