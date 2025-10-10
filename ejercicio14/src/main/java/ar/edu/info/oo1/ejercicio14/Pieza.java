package ar.edu.info.oo1.ejercicio14;

public abstract class Pieza {
  private String material;
  private String color;
  private double volumen;
  private double superficie;
  private double altura;

  public Pieza(String mat, String col, double vol, double sup, double h) {
    this.setMaterial(mat);
    this.setColor(col);
    this.setVolumen(vol);
    this.setSuperficie(sup);
    this.setAltura(h);
  }

  public Pieza(String mat, String col, double vol, double sup) {
    this.setMaterial(mat);
    this.setColor(col);
    this.setVolumen(vol);
    this.setSuperficie(sup);
    this.setAltura(0);
  }

  public void setMaterial(String material) {
    this.material = material;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setVolumen(double volumen) {
    this.volumen = volumen;
  }

  public void setSuperficie(double superficie) {
    this.superficie = superficie;
  }

  public String getMaterial() {
    return material;
  }

  public String getColor() {
    return color;
  }

  public double getVolumen() {
    return volumen;
  }

  public double getSuperficie() {
    return superficie;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  public double getAltura() {
    return altura;
  }

  public abstract double calcularVolumen();

  public abstract double calcularSuperficie();

}
