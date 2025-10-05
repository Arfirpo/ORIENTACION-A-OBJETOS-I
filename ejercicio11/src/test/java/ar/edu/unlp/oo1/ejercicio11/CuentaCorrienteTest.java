package ar.edu.unlp.oo1.ejercicio11;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CuentaCorrienteTest {
  private CuentaCorriente cuentaSinDescubierto;
  private CuentaCorriente cuentaConDescubierto;

  @BeforeEach
  void setUp() {
    cuentaSinDescubierto = new CuentaCorriente(200);
    cuentaConDescubierto = new CuentaCorriente(500, 100);
  }

  @Test
  public void testDescubierto() {
    assertEquals(0, cuentaSinDescubierto.getDescubierto());
    assertEquals(500, cuentaConDescubierto.getDescubierto());
  }

  @Test
  public void testGetSaldo(){
    assertEquals(200,cuentaSinDescubierto.getSaldo());
    assertEquals(100,cuentaConDescubierto.getSaldo());
  }

  @Test
  public void puedeExtraer() {
    assertFalse(cuentaSinDescubierto.puedeExtraer(300));
    assertTrue(cuentaConDescubierto.puedeExtraer(600)); // Agregado para cubrir el límite
  }

}
