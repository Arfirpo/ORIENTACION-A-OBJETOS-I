package ar.edu.unlp.oo1.ejercicio7;

public class Circulo implements Figura {
  private double radio;

  public Circulo() {
  }

  public Circulo(double rad) {
    this.setRadio(rad);
  }

  public void setRadio(double radio) {
    this.radio = radio;
  }

  public double getDiametro() {
    return this.radio * 2;
  }

  public double getRadio() {
    return radio;
  }

  @Override
  public double getArea() {
    return Math.PI * Math.pow(this.radio, 2);
  }

  @Override
  public double getPerimetro() {
    return Math.PI * getDiametro();
  }
}
