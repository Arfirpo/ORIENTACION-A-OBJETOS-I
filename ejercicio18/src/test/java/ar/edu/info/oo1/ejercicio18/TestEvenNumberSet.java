package ar.edu.info.oo1.ejercicio18;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestEvenNumberSet {

  private EvenNumberSet pares;

  @BeforeEach
  void setUp() {
    pares = new EvenNumberSet();
    pares.add(5);
    pares.add(4);
    pares.add(2);
    pares.add(7);
    pares.add(4);
    pares.add(8);
  }

  @Test
  public void testSize() {
    assertEquals(3, pares.size());
    assertNotEquals(6, pares.size());
  }

  @Test
  public void testAdd() {
    assertFalse(pares.add(4));
    assertTrue(pares.add(10));
    assertFalse(pares.add(15));
  }

}
