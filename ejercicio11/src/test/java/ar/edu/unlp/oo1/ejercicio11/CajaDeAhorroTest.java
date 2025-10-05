package ar.edu.unlp.oo1.ejercicio11;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CajaDeAhorroTest {

  private CajaDeAhorro caja;


  @BeforeEach
  void setUp(){
    caja = new CajaDeAhorro(1000, 0.02);
  }

  @Test
  public void puedeExtraerTest(){
    caja.depositar(1000);
    assertTrue(caja.puedeExtraer(960));
    assertFalse(caja.puedeExtraer(1000));
  }

  @Test
  public void depositarTest(){
    caja.depositar(500);
    assertEquals(490,caja.getSaldo());
  }
}
