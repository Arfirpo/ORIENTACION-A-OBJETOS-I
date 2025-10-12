package ar.edu.info.oo1.ejercicio15;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testArchivo {
  private Archivo arc;

  @BeforeEach
  void setUp() {
    arc = new Archivo("Archivo");
  }

  @Test
  void tamanio() {
    assertEquals(7, arc.tamaño());
  }
}
