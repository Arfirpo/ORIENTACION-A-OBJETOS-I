package ar.edu.info.oo1.ejercicio15;

public class Archivo {

  private String nombre;

  public Archivo(String nom) {
    this.setNombre(nom);
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return nombre;
  }

  public int tamaño() {
    return this.nombre.length();
  }

}