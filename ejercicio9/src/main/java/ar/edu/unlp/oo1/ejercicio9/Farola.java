package ar.edu.unlp.oo1.ejercicio9;

import java.util.ArrayList;
import java.util.List;

public class Farola {
  private boolean estado;
  private List<Farola> farolasVecinas;

  public Farola() {
    this.estado = false;
    this.farolasVecinas = new ArrayList<Farola>();
  }

  public void pairWithNeighbor(Farola unaFarola) {
    if (!this.farolasVecinas.contains(unaFarola)) {
      this.agregarFarola(unaFarola);
      unaFarola.agregarFarola(this);
    }
  }

  private void agregarFarola(Farola unaFarola) {
    this.farolasVecinas.add(unaFarola);
  }

  public List<Farola> getNeighbors() {
    return new ArrayList<Farola>(this.farolasVecinas);
  }

  public boolean isOn() {
    return this.estado == true;
  }

  public boolean isOff() {
    return this.estado == false;
  }

  public void turnOn() {
    if (!this.isOn()) {
      this.estado = true;
      for (Farola farola : farolasVecinas) {
        farola.turnOn();
      }
    }
  }

  public void turnOff() {
    if (!this.isOff()) {
      this.estado = false;
      for (Farola farola : farolasVecinas) {
        farola.turnOff();
      }
    }
  }
}
