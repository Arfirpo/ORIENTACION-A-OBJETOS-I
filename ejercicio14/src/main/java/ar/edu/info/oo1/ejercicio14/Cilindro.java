package ar.edu.info.oo1.ejercicio14;

public class Cilindro extends Pieza {

  private double radio;

  public Cilindro(String mat, String col, double vol, double sup, double h) {
    super(mat, col, vol, sup, h);
  }

  public void setRadio(double radio) {
    this.radio = radio;
  }

  public double getRadio() {
    return radio;
  }

  @Override
  public double calcularVolumen() {
    return (Math.PI * Math.pow(this.radio, 2) * this.getAltura());
  }

  @Override
  public double calcularSuperficie() {
    return (2 * Math.PI * this.radio * this.getAltura()) + (2 * Math.PI * Math.pow(this.radio, 2));
  }
}
