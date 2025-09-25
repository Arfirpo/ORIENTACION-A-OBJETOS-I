package ar.edu.unlp.oo1.ejercicio8;

import java.time.LocalDate;

public class Mamifero {
  private String identificador;
  private String especie;
  private LocalDate fechaDeNacimiento;
  private Mamifero padre;
  private Mamifero madre;

  public Mamifero(String id, String especie, LocalDate nac, Mamifero padre, Mamifero madre) {
    this.setIdentificador(id);
    this.setEspecie(especie);
    this.setFechaDeNacimiento(nac);
    this.setMadre(madre);
    this.setPadre(padre);
  }

  public Mamifero(String nom) {
    this.setIdentificador(nom);
  }

  public Mamifero() {

  }

  public void setIdentificador(String identificador) {
    this.identificador = identificador;
  }

  public void setEspecie(String especie) {
    this.especie = especie;
  }

  public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
    this.fechaDeNacimiento = fechaDeNacimiento;
  }

  public void setMadre(Mamifero madre) {
    this.madre = madre;
  }

  public void setPadre(Mamifero padre) {
    this.padre = padre;
  }

  public String getEspecie() {
    return especie;
  }

  public String getIdentificador() {
    return identificador;
  }

  public LocalDate getFechaDeNacimiento() {
    return fechaDeNacimiento;
  }

  public Mamifero getMadre() {
    return madre;
  }

  public Mamifero getPadre() {
    return padre;
  }

  public Mamifero getAbueloMaterno() {
    if (this.getMadre() != null)
      return this.getMadre().getPadre();
    else
      return null;
  }

  public Mamifero getAbuelaMaterna() {
    if (this.getMadre() != null)
      return this.getMadre().getMadre();
    else
      return null;
  }

  public Mamifero getAbueloPaterno() {
    if (this.getPadre() != null)
      return this.getPadre().getPadre();
    else
      return null;
  }

  public Mamifero getAbuelaPaterna() {
    if (this.getPadre() != null)
      return this.getPadre().getMadre();
    else
      return null;
  }

  public boolean tieneComoAncestroA(Mamifero unMamifero) {
    boolean esta = false;
    if (this.getPadre() != null || this.getMadre() != null)
      return tieneComoAncestroA(this, unMamifero, esta);
    else
      return false;
  }

  private boolean tieneComoAncestroA(Mamifero otroMAmifero, Mamifero unMamifero, boolean esta) {

    if (this.getPadre().equals(unMamifero)
        || this.getMadre().equals(unMamifero))
      esta = true;

    else {

      if (this.getMadre() != null && !esta) {
        if (!this.getMadre().equals(unMamifero)) {
          esta = tieneComoAncestroA(this.getMadre(), unMamifero);
        }
      }

      if (this.getPadre() != null && !esta) {
        if (!this.getPadre().equals(unMamifero)) {
          esta = tieneComoAncestroA(this.getPadre(), unMamifero);
        }
      }

    }

    return esta;
  }

}
