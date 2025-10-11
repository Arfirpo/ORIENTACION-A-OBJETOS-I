package ar.edu.info.oo1.ejercicio14;

public class Esfera extends Pieza {

  private double radio;

  public Esfera(String mat, String col, double rad) {
    super(mat, col);
    this.setRadio(rad);
  }

  public void setRadio(double radio) {
    this.radio = radio;
  }

  public double getRadio() {
    return radio;
  }

  @Override
  public double calcularVolumen() {
    return Math.round(((4.0 / 3.0) * Math.PI * Math.pow(this.radio, 3))*100.0)/100.0;

  }

  @Override
  public double calcularSuperficie() {
    return Math.round((4.0 * Math.PI * Math.pow(this.radio, 2)) * 100.0) / 100.0;
  }

}
