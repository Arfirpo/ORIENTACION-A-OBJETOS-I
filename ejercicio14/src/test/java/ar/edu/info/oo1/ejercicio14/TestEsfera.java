package ar.edu.info.oo1.ejercicio14;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestEsfera {
  private Esfera esf1;
  private Esfera esf2;

  @BeforeEach
  void setUp() {
    esf1 = new Esfera("madera", "azul", 6.75);
    esf2 = new Esfera("metal", "rojo", 8.97);
  }

  @Test
  public void testCalcularVolumen() {
    assertEquals(1288.25, esf1.calcularVolumen(), 0.01);
    assertEquals(3023.20, esf2.calcularVolumen(), 0.01);
  }

  @Test
  public void testCalcularSuperficie() {
    assertEquals(572.55, esf1.calcularSuperficie(),0.01);
    assertEquals(1011.10, esf2.calcularSuperficie(),0.01);
  }

}
