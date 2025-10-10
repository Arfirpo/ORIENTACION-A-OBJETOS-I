package ar.edu.info.oo1.ejercicio14;

import java.util.ArrayList;
import java.util.List;

public class ReporteDeConstruccion {
  private List<Pieza> piezas;

  public ReporteDeConstruccion() {
    this.piezas = new ArrayList<Pieza>();
  }

  public double volumenDeMaterial(String material) {
    return this.piezas.stream().filter(pz -> {
      pz.getMaterial().equals(material)
    }).;
  }

  public double superficieDeColor() {
    return 0.0;
  }

  public List<Pieza> getPiezas() {
    return this.piezas;
  }
}
