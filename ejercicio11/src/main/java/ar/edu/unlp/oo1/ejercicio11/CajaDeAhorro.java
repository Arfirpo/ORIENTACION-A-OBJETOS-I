package ar.edu.unlp.oo1.ejercicio11;

public class CajaDeAhorro extends Cuenta {
  private double interes;

  public CajaDeAhorro(double saldo, double interes) {
    super(saldo);
    this.interes = interes;
  }

  public double getInteres() {
    return interes;
  }

  @Override
  protected boolean puedeExtraer(double monto) {
    return monto * (1 + this.interes) <= this.getSaldo();
  }

  @Override
  public void depositar(double monto) {
    super.depositar(monto);
    this.extraer(monto * 0.02);
  }

  @Override
  public boolean transferirACuenta(double monto, Cuenta cuentaDestino) {
    boolean result;
    result = super.transferirACuenta(monto, cuentaDestino);
    this.extraer(monto * 0.02);
    return result;
  }

}
