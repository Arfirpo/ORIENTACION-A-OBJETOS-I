package ar.edu.info.oo1.ejercicio14;

public class Cilindro extends Pieza {

  private double radio;
  private double altura;

  public Cilindro(String mat, String col, double h, double rad) {
    super(mat, col);
    this.setRadio(rad);
    this.setAltura(h);
  }

  public void setRadio(double radio) {
    this.radio = radio;
  }

  public double getRadio() {
    return radio;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  public double getAltura() {
    return altura;
  }

  @Override
  public double calcularVolumen() {
    return Math.round((Math.PI * Math.pow(this.radio, 2) * this.altura) * 100.0) / 100.0;
  }

  @Override
  public double calcularSuperficie() {
    return Math.round(
        ((2 * Math.PI * this.radio * this.altura) +
            (2 * Math.PI * Math.pow(this.radio, 2)))
            * 100.0)
        / 100.0;
  }
}
