package ar.edu.info.oo1.ejercicio14;

public abstract class Pieza {
  private String material;
  private String color;

  public Pieza(String mat, String col) {
    this.setMaterial(mat);
    this.setColor(col);
  }

  public void setMaterial(String material) {
    this.material = material;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getMaterial() {
    return material;
  }

  public String getColor() {
    return color;
  }

  public abstract double calcularVolumen();

  public abstract double calcularSuperficie();

}
