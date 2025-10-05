package ar.edu.unlp.oo1.ejercicio11;

public class Ejercicio11Application {

  public static void main(String[] args) {

    CuentaCorriente cuentaAgus = new CuentaCorriente(500, 500);

    CajaDeAhorro cajaAgus = new CajaDeAhorro(200, 0.02);

    cajaAgus.depositar(1000); // deposito $1000, me quedan $980

    System.out.println(cajaAgus.getSaldo());

    System.out.println(cajaAgus.extraer(1000));
    System.out.println(cajaAgus.extraer(100.4));

    System.out.println(cajaAgus.transferirACuenta(100, cuentaAgus));

    System.out.println(cuentaAgus.getSaldo());
    System.out.println(cuentaAgus.getDescubierto());
    System.out.println(cuentaAgus.extraer(400));
    System.out.println(cuentaAgus.extraer(400));

    System.out.println(cajaAgus.getSaldo());
    System.out.println(cuentaAgus.getSaldo());

    

  }
}
