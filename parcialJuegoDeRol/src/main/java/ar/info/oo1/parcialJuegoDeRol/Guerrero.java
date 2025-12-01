package ar.info.oo1.parcialJuegoDeRol;

public class Guerrero implements Rol {

  @Override
  public double valorBase(Personaje p) {
    return p.getFuerza() * 2;
  }

  @Override
  public void incrementarHabilidad(Personaje p) {
    p.fuerza += p.getNivel() / 6;
  }

}
