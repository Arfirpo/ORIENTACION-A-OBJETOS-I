package ar.edu.info.oo1.ejercicio13;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class PlazoFijoTest {
  private PlazoFijo pFijo1 = new PlazoFijo(3500, 0.02, LocalDate.of(2025, 01, 01));
  private PlazoFijo pFijo2 = new PlazoFijo(2000, 0.05, LocalDate.of(2024, 12, 01));
  private PlazoFijo pFijo3 = new PlazoFijo(1500, 0.5, LocalDate.now());

  @Test
  public void TestValorUnitario() {
    assertEquals(3554.5, pFijo1.valorActual(), 0.01);
    assertEquals(2087.61, pFijo2.valorActual(), 0.01);
    assertEquals(1500, pFijo3.valorActual(), 0.01);
  }

}
