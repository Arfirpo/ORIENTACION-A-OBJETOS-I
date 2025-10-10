package ar.edu.info.oo1.ejercicio14;

public class Esfera extends Pieza{

  private double radio;

  public Esfera(String mat, String col, double vol, double sup,double rad) {
    super(mat,col,vol,sup);
    this.setRadio(rad);
  }

  public void setRadio(double radio) {
    this.radio = radio;
  }

  public double getRadio() {
    return radio;
  }
  
}
