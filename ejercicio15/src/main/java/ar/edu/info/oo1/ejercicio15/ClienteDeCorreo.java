package ar.edu.info.oo1.ejercicio15;

import java.util.ArrayList;
import java.util.List;

public class ClienteDeCorreo {
  private List<Carpeta> carpetas;
  private Carpeta inbox;

  public ClienteDeCorreo() {
    this.carpetas = new ArrayList<Carpeta>();
    this.inbox = new Carpeta("inbox");
    this.carpetas.add(inbox);
  }

  public void recibir(Email unEmail) {
    this.inbox.agregarEmail(unEmail);
  }

  public Email buscarTexto(String texto) {
    return this.carpetas.stream()
        .map(c -> c.buscarEmail(texto))
        .findFirst()
        .orElse(null);
  }

  public void agregarCarpeta(Carpeta unaCarpeta) {
    this.carpetas.add(unaCarpeta);
  }

  public void eliminarCarpeta(Carpeta unaCarpeta) {
    this.carpetas.add(unaCarpeta);
  }

  public List<Carpeta> getCarpetas() {
    return this.carpetas;
  }

  public Carpeta getInbox() {
    return inbox;
  }

  public int espacioOcupado() {
    return this.carpetas.stream()
        .mapToInt(car -> car.calcularTamaño())
        .sum();
  }

  public void mover(Email unEmail, Carpeta destino) {
    destino.agregarEmail(unEmail);
  }

}
