package ar.edu.info.oo1.ejercicio13;

public class Accion implements Inversion {

  private double valorUnitario;
  private int cant;
  private String ticker;

  public Accion(double vUni, int cant, String ticker) {
    this.valorUnitario = vUni;
    this.cant = cant;
    this.ticker = ticker;
  }

  public void setCant(int cant) {
    this.cant = cant;
  }
 
  public void setValorUnitario(double valorUnitario) {
    this.valorUnitario = valorUnitario;
  }

  public void setTicker(String ticker) {
    this.ticker = ticker;
  }

  public int getCant() {
    return cant;
  }

  public double getValorUnitario() {
    return valorUnitario;
  }

  public String getTicker() {
    return ticker;
  }

  @Override
  public double valorActual() {
    return this.valorUnitario * this.cant;
  }

}
