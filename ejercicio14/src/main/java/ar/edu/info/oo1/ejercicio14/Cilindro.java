package ar.edu.info.oo1.ejercicio14;

public class Cilindro extends Pieza {

  private double radio;

  public Cilindro(String mat, String col, double vol, double sup) {
    super(mat, col, vol, sup);
  }

  public void setRadio(double radio) {
    this.radio = radio;
  }

  public double getRadio() {
    return radio;
  }
}
