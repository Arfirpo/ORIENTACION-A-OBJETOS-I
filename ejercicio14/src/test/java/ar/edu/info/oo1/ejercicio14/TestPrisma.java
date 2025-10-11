package ar.edu.info.oo1.ejercicio14;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestPrisma {

  private PrismaRectangular prsm1;
  private PrismaRectangular prsm2;

  @BeforeEach
  void setUp() {
    prsm1 = new PrismaRectangular("madera", "rojo", 28.5, 46, 24);
    prsm2 = new PrismaRectangular("metal", "azul", 40.8, 22.4, 84.9);
  }

  @Test
  public void testCalcularVolumen() {
    assertEquals(31464, prsm1.calcularVolumen(), 0.01);
    assertEquals(77591.81, prsm2.calcularVolumen(), 0.01);
  }

  public void testCalcularSuperficie() {
    assertEquals(31464, prsm1.calcularVolumen(), 0.01);
    assertEquals(77591.81, prsm2.calcularVolumen(), 0.01);    
  }
}
