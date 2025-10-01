package ar.edu.unlp.oo1.ejercicio11;

public class CajaDeAhorro extends Cuenta {

  public CajaDeAhorro(double saldo) {
    super(saldo);
  }

  @Override
  protected boolean puedeExtraer(double monto) {
    return monto + (1 * 0.02) <= this.getSaldo();
  }

  @Override
  public void depositar(double monto) {
    this.extraer(monto * 0.02);
    super.depositar(monto);

  }

  @Override
  public boolean transferirACuenta(double monto, Cuenta cuentaDestino) {
    this.extraer(monto * 0.02);
    return super.transferirACuenta(monto, cuentaDestino);
  }

}
