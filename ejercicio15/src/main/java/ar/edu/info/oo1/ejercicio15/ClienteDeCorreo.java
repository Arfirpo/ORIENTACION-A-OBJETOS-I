package ar.edu.info.oo1.ejercicio15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ClienteDeCorreo {
  private List<Carpeta> carpetas;
  private Carpeta inbox;

  public ClienteDeCorreo() {
    this.carpetas = new ArrayList<Carpeta>();
    this.inbox = new Carpeta("inbox");
    this.carpetas.add(inbox);
  }

  public void recibirEmail(Email unEmail) {
    this.inbox.agregarEmail(unEmail);
  }

  public Email buscarTexto(String texto) {
    boolean encontre = false;
    Email unEmail = null;
    Iterator<Carpeta> it = this.carpetas.iterator();
    while (!encontre && it.hasNext()) {
      if (it.next().getEmail(texto) != null)
        encontre = true;
    }
    return unEmail;
  }

  public int espacioOcupado() {
    return this.carpetas.stream()
        .mapToInt(car -> car.calcularTamaño())
        .sum();
  }

  public void moverEmail(Email unEmail, String carpeta){
    
  }

}
