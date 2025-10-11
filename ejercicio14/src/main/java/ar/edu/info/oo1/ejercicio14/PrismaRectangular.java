package ar.edu.info.oo1.ejercicio14;

public class PrismaRectangular extends Pieza {

  private double ladoMayor;
  private double ladoMenor;
  private double altura;

  public PrismaRectangular(String mat, String col, double h, double ladoMax, double ladoMin) {
    super(mat, col);
    this.setLadoMayor(ladoMax);
    this.setLadoMenor(ladoMin);
    this.setAltura(h);
  }

  public void setLadoMayor(double ladoMayor) {
    this.ladoMayor = ladoMayor;
  }

  public double getLadoMayor() {
    return ladoMayor;
  }

  public void setLadoMenor(double ladoMenor) {
    this.ladoMenor = ladoMenor;
  }

  public double getLadoMenor() {
    return ladoMenor;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  public double getAltura() {
    return altura;
  }

  @Override
  public double calcularVolumen() {
    return this.ladoMayor * this.ladoMenor * this.altura;
  }

  @Override
  public double calcularSuperficie() {
    return 2 * ((this.ladoMayor * this.ladoMenor)
        + (this.ladoMayor * this.altura + (this.ladoMenor * this.altura)));
  }
}
