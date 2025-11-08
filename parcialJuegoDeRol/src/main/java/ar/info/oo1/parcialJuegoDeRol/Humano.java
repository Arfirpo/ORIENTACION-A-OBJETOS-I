package ar.info.oo1.parcialJuegoDeRol;

public class Humano extends Personaje {

  public Humano(String nombre, Rol rol) {
    super(nombre, rol);
    this.setFuerza(1);
    this.setInteligencia(2);
  }

  @Override
  public double determinarPoderAtaque(int horaDia) {

    return this.getRol().valorBase(this) * ((horaDia >= 8 && horaDia <= 20) ? 1.4 : 1);
  }


  @Override
  public boolean puedeIncrementarHabilidad() {
    return this.getNivel() > 7;
  }
}
