package ar.edu.unlp.oo1.ejercicio7;

public class Cuadrado implements Figura {
  private double lado;

  public Cuadrado() {
  }

  public Cuadrado(double lado) {
    this.setLado(lado);
  }

  public void setLado(double lado) {
    this.lado = lado;
  }

  public double getLado() {
    return lado;
  }

  @Override
  public double getPerimetro() {
    return this.lado * 4;
  }

  @Override
  public double getArea() {
    return this.lado * this.lado;
  }
}
