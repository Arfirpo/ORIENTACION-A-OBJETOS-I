package ar.edu.info.oo1.ejercicio15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Carpeta {
  private String nombre;
  private List<Email> emails;

  public Carpeta(String nombre) {
    this.setNombre(nombre);
    this.emails = new ArrayList<Email>();
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return nombre;
  }

  public Email getEmail(String texto) {
    Email email = null;
    boolean encontre = false;
    Iterator<Email> it = this.emails.iterator();
    while (!encontre && it.hasNext()) {
      if (it.next().getTitulo().equals(texto) || it.next().getCuerpo().equals(texto)) {
        email = it.next();
        encontre = true;
      }
    }
    return email;
  }

  public List<Email> getEmails() {
    return this.emails;
  }

  public void agregarEmail(Email unEmail) {
    this.emails.add(unEmail);
  }

  public void eliminarEmail(Email unEmail) {
    this.emails.remove(unEmail);
  }

  public void mover(Email unEmail, Carpeta destino) {
    destino.emails.add(unEmail);
    this.emails.remove(unEmail);
  }

  public int calcularTamaño() {
    return this.emails.stream()
        .mapToInt(email -> email.calcularTamaño())
        .sum();
  }
}
