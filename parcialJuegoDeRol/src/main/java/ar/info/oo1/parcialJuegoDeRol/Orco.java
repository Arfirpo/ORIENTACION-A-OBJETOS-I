package ar.info.oo1.parcialJuegoDeRol;

public class Orco extends Personaje {

  public Orco(String nombre, Rol rol) {
    super(nombre, rol);
    this.setFuerza(2);
    this.setInteligencia(1);
  }

  @Override
  public double determinarPoderAtaque(int horaDia) {
    return this.getRol().valorBase(this) * ((horaDia <= 8 || horaDia >= 20) ? 1.6 : 1);
  }

  @Override
  public boolean puedeIncrementarHabilidad() {
    return this.getNivel() % 3 == 0;
  }

}
