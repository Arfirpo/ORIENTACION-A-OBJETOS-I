package ar.edu.info.oo1.ejercicio14;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestReporte {

  private ReporteDeConstruccion repo1;
  private Pieza cil1;
  private Pieza cil2;
  private Pieza esf1;
  private Pieza esf2;
  private Pieza prsm1;
  private Pieza prsm2;

  @BeforeEach
  void setUp() {
    repo1 = new ReporteDeConstruccion();
    cil1 = new Cilindro("madera", "rojo", 120, 25);
    cil2 = new Cilindro("metal", "verde", 125.40, 30);
    esf1 = new Esfera("madera", "azul", 6.75);
    esf2 = new Esfera("metal", "rojo", 8.97);
    prsm1 = new PrismaRectangular("madera", "rojo", 28.5, 46, 24);
    prsm2 = new PrismaRectangular("metal", "azul", 40.8, 22.4, 84.9);
    repo1.agregarPieza(null);

    repo1.agregarPieza(cil1);
    repo1.agregarPieza(cil2);
    repo1.agregarPieza(esf1);
    repo1.agregarPieza(esf2);
    repo1.agregarPieza(prsm1);
    repo1.agregarPieza(prsm2);

  }

  @Test
  public void testVolumenDeMaterial() {

  }

  @Test
  public void testColorDeMaterial() {

  }

}
