package ar.edu.info.oo1.ejercicio15;

import java.util.ArrayList;
import java.util.List;

public class Email {
  private String titulo;
  private String cuerpo;
  private List<Archivo> adjuntos;

  public Email(String titulo, String cuerpo) {
    this.setTitulo(titulo);
    this.setCuerpo(cuerpo);
    this.adjuntos = new ArrayList<Archivo>();
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getTitulo() {
    return titulo;
  }

  public List<Archivo> getAdjuntos() {
    return this.adjuntos;
  }

  public void setCuerpo(String cuerpo) {
    this.cuerpo = cuerpo;
  }

  public String getCuerpo() {
    return cuerpo;
  }

  public int calcularTamaño() {
    int tam = 0;
    tam += this.titulo.length();
    tam += this.cuerpo.length();
    tam += this.adjuntos.stream()
        .mapToInt(arch -> arch.tamaño())
        .sum();
    return tam;
  }

}
