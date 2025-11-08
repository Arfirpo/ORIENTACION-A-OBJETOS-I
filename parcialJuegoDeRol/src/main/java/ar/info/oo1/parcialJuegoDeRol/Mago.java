package ar.info.oo1.parcialJuegoDeRol;

public class Mago implements Rol {
  @Override
  public double valorBase(Personaje p) {
    return (p.getInteligencia() + p.getNivel()) * 2;
  }

  @Override
  public void incrementarHabilidad(Personaje p) {
    p.inteligencia += p.getNivel() * (3 / 2);
  }
}
