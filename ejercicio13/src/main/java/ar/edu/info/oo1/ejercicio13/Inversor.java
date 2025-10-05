package ar.edu.info.oo1.ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class Inversor {
  private List<Inversion> inversiones;

  public Inversor() {
    this.inversiones = new ArrayList<Inversion>();
  }

  public void agregarInversion(Inversion inv) {
    if (!this.inversiones.contains(inv))
      this.inversiones.add(inv);
  }

  public void quitarInversion(Inversion inv) {
    this.inversiones.remove(inv);
  }

  public double inversionActual(){
    return this.inversiones.stream().mapToDouble(inv -> inv.valorActual()).sum();
  }

}
