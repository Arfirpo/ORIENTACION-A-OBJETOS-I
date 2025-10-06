package ar.edu.info.oo1.ejercicio13;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InversorTest {

  private Inversor agustin = new Inversor();
  private Inversion pampaEnergia = new Accion(2500, 5, "PAMP");
  private Inversion centralPuerto = new Accion(2700, 20, "CEPU");
  private Inversion bancoGalicia = new Accion(7000, 15, "GAL");
  private LocalDate fecha = LocalDate.of(2024, 5, 10);
  private LocalDate fecha2 = LocalDate.of(2025, 2, 20);
  private Inversion pFijo1 = new PlazoFijo(50000, 0.045, fecha);
  private Inversion pFijo2 = new PlazoFijo(26000, 0.05, fecha2);

  @BeforeEach
  void setUp() {
    agustin.agregarInversion(pFijo2);
    agustin.agregarInversion(pampaEnergia);
    agustin.agregarInversion(pFijo1);
    agustin.agregarInversion(centralPuerto);
    agustin.agregarInversion(bancoGalicia);
  }
  

  @Test
  public void testInversionActual(){
    assertEquals(251605.89, agustin.inversionActual(),0.0001);
    agustin.quitarInversion(bancoGalicia);
    assertEquals(146605.89, agustin.inversionActual(),0.0001);
  }

  @Test
  public void testAgregarInversion(){
    assertFalse(agustin.agregarInversion(bancoGalicia));
    agustin.quitarInversion(pampaEnergia);
    assertTrue(agustin.agregarInversion(pampaEnergia));
  }
}
