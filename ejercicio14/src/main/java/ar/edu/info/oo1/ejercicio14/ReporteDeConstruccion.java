package ar.edu.info.oo1.ejercicio14;

import java.util.ArrayList;
import java.util.List;

public class ReporteDeConstruccion {
  private List<Pieza> piezas;

  public ReporteDeConstruccion() {
    this.piezas = new ArrayList<Pieza>();
  }

  public double volumenDeMaterial(String material) {
    return this.piezas.stream()
        .filter(pieza -> pieza.getMaterial().equals(material))
        .mapToDouble(pieza -> pieza.calcularVolumen())
        .sum();
  }

  public double superficieDeColor(String color) {
    return this.piezas.stream()
        .filter(pieza -> pieza.getColor().equals(color))
        .mapToDouble(pieza -> pieza.calcularSuperficie())
        .sum();
  }

  public List<Pieza> getPiezas() {
    return this.piezas; 
  }
}
