package ar.edu.unlp.oo1.ejercicio10;

public class Ejercicio10Application {
  public static void main(String[] args) {

    Gerente alan = new Gerente("Alan Turing");

    double aportesAlan = alan.aportes();

    double sueldoBasicoAlan = alan.sueldoBasico();

    System.out.println("Aportes de Alan: " + aportesAlan);
    System.out.println("Sueldo Basico de Alan: " + sueldoBasicoAlan);

  }
}
