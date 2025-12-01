package ar.edu.info.oo1.ejercicio19;

public class Direccion {
  private String calle;
  private String altura;
  private String codPostal = "S/N";
  private String piso = "S/N";
  private String dept = "S/N";

  public Direccion(String calle, String alt) {
    this.setCalle(calle);
    this.setAltura(alt);
    this.setCodPostal("S/N");
    this.setDept("");
    this.setPiso("");
  }

  public Direccion(String calle, String alt, String codP, String piso, String depto) {
    this.setCalle(calle);
    this.setAltura(alt);
    this.setCodPostal(codP);
    this.setDept(depto);
    this.setPiso(piso);
  }

  public void setAltura(String altura) {
    this.altura = altura;
  }

  public void setCalle(String calle) {
    this.calle = calle;
  }

  public void setCodPostal(String codPostal) {
    this.codPostal = codPostal;
  }

  public void setDept(String dept) {
    this.dept = dept;
  }

  public void setPiso(String piso) {
    this.piso = piso;
  }

  @Override
  public String toString() {
    String aux = "";
    aux += "Calle: " + this.calle + " - N° " + this.altura + "\n";
    aux += (this.codPostal.length() != 0) ? "Codigo Postal: N° " + this.codPostal + "\n" : ".";
    aux += (this.dept.length() != 0) ? "Depto: N° " + this.dept + " - Piso: " + this.piso : ".";
    return aux;
  }
}
