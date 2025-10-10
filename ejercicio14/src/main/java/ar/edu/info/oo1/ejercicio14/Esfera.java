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
    return (4 / 3) * Math.PI * Math.pow(this.radio, 3);
  }

  @Override
  public double calcularSuperficie() {
    return 4 * Math.PI * Math.pow(this.radio, 2);
  }

}
