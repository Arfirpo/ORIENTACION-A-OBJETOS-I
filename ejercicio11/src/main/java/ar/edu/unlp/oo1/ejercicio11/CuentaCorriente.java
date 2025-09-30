package ar.edu.unlp.oo1.ejercicio11;

public class CuentaCorriente extends Cuenta {
  private double descubierto;

  public CuentaCorriente(double desc){
    super();
    this.setDescubierto(desc);
  }

  public void setDescubierto(double descubierto) {
    this.descubierto = descubierto;
  }

  public double getDescubierto() {
    return descubierto;
  }


}
