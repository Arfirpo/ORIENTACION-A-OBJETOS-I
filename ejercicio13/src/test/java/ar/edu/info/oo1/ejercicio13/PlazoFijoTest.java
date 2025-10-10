package ar.edu.info.oo1.ejercicio13;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class PlazoFijoTest {
  private PlazoFijo pFijo1 = new PlazoFijo(3500, 0.02, LocalDate.of(2025, 01, 01));

  private PlazoFijo pFijo2 = new PlazoFijo(2000, 0.05,LocalDate.of(2024, 12, 01));



  @Test
  public void TestValorUnitario(){
    assertEquals(0, 0);
    assertEquals(20876.12, pFijo2.valorActual());
  }


}
