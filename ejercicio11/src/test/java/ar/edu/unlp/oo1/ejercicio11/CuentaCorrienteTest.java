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
  public void puedeExtraer() {
    assertTrue(cuentaSinDescubierto.puedeExtraer(200));
    assertFalse(cuentaSinDescubierto.puedeExtraer(300));

    assertTrue(cuentaConDescubierto.puedeExtraer(600));
    assertFalse(cuentaConDescubierto.puedeExtraer(700));

    cuentaSinDescubierto.setDescubierto(100);
    assertTrue(cuentaSinDescubierto.puedeExtraer(300));

    cuentaConDescubierto.setDescubierto(0);
    assertFalse(cuentaConDescubierto.puedeExtraer(101));

  }

  @Test
  public void testTrasferirACuenta() {
    assertTrue(cuentaSinDescubierto.transferirACuenta(200, cuentaConDescubierto));
    assertFalse(cuentaSinDescubierto.transferirACuenta(201, cuentaConDescubierto));
    assertTrue(cuentaConDescubierto.transferirACuenta(700, cuentaSinDescubierto));
    assertFalse(cuentaConDescubierto.transferirACuenta(101, cuentaSinDescubierto));
  }

  @Test
  public void testSaldoMinimo() {
    cuentaSinDescubierto.extraer(200);
    assertEquals(0, cuentaSinDescubierto.getSaldo());
    cuentaConDescubierto.extraer(200);
    assertEquals(-100, cuentaConDescubierto.getSaldo());
  }

}
