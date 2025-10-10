package ar.edu.info.oo1.ejercicio14;

public class PrismaRectangular extends Pieza {

  private double ladoMayor;
  private double ladoMenor;

  public PrismaRectangular(String mat, String col, double vol, double sup, double h, double ladoMax, double ladoMin) {
    super(mat, col, vol, sup, h);
    this.setLadoMayor(ladoMax);
    this.setLadoMenor(ladoMin);
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

  @Override
  public double calcularVolumen() {
    return this.ladoMayor * this.ladoMenor * this.getAltura();
  }

  @Override
  public double calcularSuperficie() {
    return 2 * ((this.ladoMayor * this.ladoMenor)
        + (this.ladoMayor * this.getAltura() + (this.ladoMenor * this.getAltura())));
  }
}
