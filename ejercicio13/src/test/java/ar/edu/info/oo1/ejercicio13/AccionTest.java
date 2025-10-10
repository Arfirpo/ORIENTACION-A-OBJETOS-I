package ar.edu.info.oo1.ejercicio13;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AccionTest {

  private Inversion accionesGalicia = new Accion(3400, 54, "gal");
  private Inversion accionesBancoValores = new Accion(4000, 5, "val");

  @Test
  public void testValorUnitario() {
    assertEquals(183600, accionesGalicia.valorActual());
    assertEquals(20000, accionesBancoValores.valorActual());
  }
}
