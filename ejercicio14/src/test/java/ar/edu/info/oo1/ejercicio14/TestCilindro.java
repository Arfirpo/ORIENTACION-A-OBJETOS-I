package ar.edu.info.oo1.ejercicio14;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCilindro {
  private Cilindro cil1;
  private Cilindro cil2;

  @BeforeEach
  void setUp() {
    cil1 = new Cilindro("madera", "rojo", 120, 25);
    cil2 = new Cilindro("metal", "verde", 125.40, 30);
  }

@Test
public void TestCalcularVolumen() {
    assertEquals(235619.45, cil1.calcularVolumen(), 0.01);
    assertEquals(354560.15, cil2.calcularVolumen(), 0.01);
    assertEquals(22776.55, cil1.calcularSuperficie(), 0.01);
    // assertEquals();
}

}
