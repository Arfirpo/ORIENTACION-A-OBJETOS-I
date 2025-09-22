package ar.edu.unlp.oo1.ejercicio7;

public class Cuerpo3D {
  private double altura;
  private Figura caraBasal;

  public Cuerpo3D() {
  }

  public Cuerpo3D(double alt, Figura cara) {
    this.setAltura(alt);
    this.setCaraBasal(cara);
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  public void setCaraBasal(Figura caraBasal) {
    this.caraBasal = caraBasal;
  }

  public Figura getCaraBasal() {
    return caraBasal;
  }

  public double getAltura() {
    return altura;
  }

  public double getSuperficieExterior() {
    return (2 * (this.caraBasal.getArea())) + (this.caraBasal.getPerimetro() * this.altura);
  }

  public double getVolumen() {
    return (this.caraBasal.getArea() * this.altura);
  }

}
