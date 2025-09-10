package ar.edu.info.unlp.ejercicio3;

public class Item {
  private String detalle;
  private Integer catidad;
  private Double costoUnitario;

  public Item() {
  }

  public Item(String det, Integer cant, Number cUnit) {
    this.setDetalle(det);
    this.setCatidad(cant);
    this.setCostoUnitario(cUnit.doubleValue());
  }

  public void setCatidad(Integer catidad) {
    this.catidad = catidad;
  }

  public void setCostoUnitario(Double costoUnitario) {
    this.costoUnitario = costoUnitario;
  }

  public void setDetalle(String detalle) {
    this.detalle = detalle;
  }

  public Integer getCatidad() {
    return catidad;
  }

  public Double getCostoUnitario() {
    return costoUnitario;
  }

  public String getDetalle() {
    return detalle;
  }

  public Double costo() {
    return this.getCostoUnitario() * this.getCatidad();
  }
}
