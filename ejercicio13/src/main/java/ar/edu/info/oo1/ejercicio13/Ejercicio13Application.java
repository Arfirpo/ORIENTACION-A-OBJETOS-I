package ar.edu.info.oo1.ejercicio13;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.ChronoUnit;

public class Ejercicio13Application {
  public static void main(String[] args) {

    Inversor agustin = new Inversor();

    Inversion pampaEnergia = new Accion(2500, 5, "PAMP");
    Inversion centralPuerto = new Accion(2700, 20, "CEPU");
    Inversion bancoGalicia = new Accion(7000, 15, "GAL");

    LocalDate fecha = LocalDate.of(2024, 5, 10);
    LocalDate fecha2 = LocalDate.of(2025, 2, 20);
    Inversion pFijo1 = new PlazoFijo(50000, 0.045, fecha);
    Inversion pFijo2 = new PlazoFijo(26000, 0.05, fecha2);

    // agustin.agregarInversion(pFijo2);
    // agustin.agregarInversion(pampaEnergia);
    // agustin.agregarInversion(pFijo1);
    // agustin.agregarInversion(centralPuerto);
    // agustin.agregarInversion(bancoGalicia);

    // DecimalFormat df = new DecimalFormat("#,##0.00");
    // System.out.println(df.format(agustin.inversionActual()));

    PlazoFijo pFijo3 = new PlazoFijo(20000, 0.05, LocalDate.of(2024, 12, 01));

    System.out.println(ChronoUnit.DAYS.between(pFijo3.getFechaConstitucon(), LocalDate.now()));

   System.out.println(pFijo3.valorActual()); 

  }
}
