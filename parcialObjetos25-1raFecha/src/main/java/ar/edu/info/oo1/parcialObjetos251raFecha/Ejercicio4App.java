package ar.edu.info.oo1.parcialObjetos251raFecha;

import java.time.LocalDate;

public class Ejercicio4App {
  public static void main(String[] args) {

    Contrato c1 = new ContratoDeHoras(LocalDate.of(2020, 06, 01), 900, 160, LocalDate.of(2023, 01, 31));

    Contrato c2 = new ContratoDePlanta(LocalDate.of(2023, 02, 01), 120000, 6000, 10000);

    Empleado e1 = new Empleado("juan perez", LocalDate.of(1985, 05, 10), 2, true, c1);

    e1.agregarContrato(c2);

    Contrato c3 = new ContratoDePlanta(LocalDate.of(2022, 07, 014), 80000, 0, 8000);

    Contrato c4 = new ContratoDeHoras(LocalDate.of(2024, 10, 01), 1100, 150, LocalDate.of(2025, 12, 15));

    Empleado e2 = new Empleado("ana garcia", LocalDate.of(1990, 8, 15), 1, false, c3);

    e2.agregarContrato(c4);

  }
}
