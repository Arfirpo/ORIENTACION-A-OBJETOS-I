package ar.edu.unlp.oo1.ejercicio5;

public class Acciones implements Inversion {
  private double valorUnitario;
  private int cantidad;
  private String ticker;

  public Acciones(double unit, int cant, String nombre){
    this.setValorUnitario(unit);
    this.setCantidad(cant);
    this.setTicker(ticker);
  }

  public double valorActual() {
    return this.getValorUnitario() * this.getCantidad();
  }

  public void setValorUnitario(double valorUnitario) {
    this.valorUnitario = valorUnitario;
  }

  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }

  public void setTicker(String ticker) {
    this.ticker = ticker;
  }

  public int getCantidad() {
    return cantidad;
  }

  public String getTicker() {
    return ticker;
  }

  public double getValorUnitario() {
    return valorUnitario;
  }

}
