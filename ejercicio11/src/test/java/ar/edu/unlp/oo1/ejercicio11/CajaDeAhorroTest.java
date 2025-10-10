package ar.edu.unlp.oo1.ejercicio11;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CajaDeAhorroTest {

  private CajaDeAhorro caja;
  private CuentaCorriente cuenta;

  @BeforeEach
  void setUp() {
    caja = new CajaDeAhorro(1000, 0.02);
    cuenta = new CuentaCorriente(1500);
  }

  @Test
  public void testPuedeExtraer() {
    assertTrue(caja.puedeExtraer(960),"fallo porque x");
    assertFalse(caja.puedeExtraer(1000));
  }

  @Test
  public void testDepositar() {
    caja.depositar(1000);
    assertEquals(1980, caja.getSaldo());
  }

  @Test
  public void testTransferirACuenta(){
    assertTrue(caja.transferirACuenta(980, cuenta));
    assertFalse(caja.transferirACuenta(1000, cuenta));
  }


}
