package ar.edu.unlp.oo1.ejercicio5;

import java.util.LinkedList;
import java.util.List;

public class Inversor {
  private List<Inversion> inversiones;

  public Inversor() {
    this.inversiones = new LinkedList<Inversion>();
  }

  public void agregarInversion(Inversion inv) {
    this.inversiones.add(inv);
  }

  public void quitarInversion(Inversion inv) {
    this.inversiones.remove(inv);
  }

  public double inversionActual() {
    return inversiones.stream().mapToDouble(inv -> inv.valorActual()).sum();
  }

}
