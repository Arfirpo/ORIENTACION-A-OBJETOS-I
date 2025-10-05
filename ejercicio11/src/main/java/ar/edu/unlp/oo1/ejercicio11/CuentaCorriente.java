package ar.edu.unlp.oo1.ejercicio11;

public class CuentaCorriente extends Cuenta {
  private double descubierto;

  public CuentaCorriente(double desc, double saldo) {
    super(saldo);
    this.setDescubierto(desc);
  }

  public CuentaCorriente(double saldo) {
    super(saldo);
  }

  public void setDescubierto(double descubierto) {
    this.descubierto = descubierto;
  }

  public double getDescubierto() {
    return descubierto;
  }

  @Override
  protected boolean puedeExtraer(double monto) {
    return (this.getSaldo() + this.descubierto) >= monto;
  }

}
