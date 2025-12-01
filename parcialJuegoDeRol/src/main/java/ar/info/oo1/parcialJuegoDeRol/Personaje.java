package ar.info.oo1.parcialJuegoDeRol;

import java.util.List;
import java.util.stream.Collectors;

public abstract class Personaje {

  protected String nombre;
  private int nivel;
  protected int inteligencia;
  protected int fuerza;
  private Rol rol;

  public Personaje(String nombre, Rol rol) {
    this.setNivel(1);
    this.setRol(rol);
  }

  public void setFuerza(int fuerza) {
    this.fuerza = fuerza;
  }

  public void setInteligencia(int inteligencia) {
    this.inteligencia = inteligencia;
  }

  public void setNivel(int nivel) {
    this.nivel = nivel;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setRol(Rol rol) {
    this.rol = rol;
  }

  public int getFuerza() {
    return fuerza;
  }

  public int getInteligencia() {
    return inteligencia;
  }

  public int getNivel() {
    return nivel;
  }

  public String getNombre() {
    return nombre;
  }

  public Rol getRol() {
    return rol;
  }

  public abstract double determinarPoderAtaque(int horaDia);

  public void subirNIvel() {
    this.nivel++;
    if (this.puedeIncrementarHabilidad())
      this.getRol().incrementarHabilidad(this);
  };

  public abstract boolean puedeIncrementarHabilidad();

  public void enfrentamiento(Personaje p, int horaDia) {
    double pA1 = this.determinarPoderAtaque(horaDia);
    double pA2 = p.determinarPoderAtaque(horaDia);
    if (pA1 != pA2) {
      if (pA1 > pA2) {
        this.subirNIvel();
      } else
        p.subirNIvel();
    } else {
      p.subirNIvel();
      this.subirNIvel();
    }
  }

  public List<Personaje> buscarOponentes(List<Personaje> roster) {
    return roster.stream()
        .filter(p -> p != this)
        .filter(p -> {
          int diferenciaNivel = Math.abs(p.getNivel() - this.getNivel());
          if (p.getNivel() == this.getNivel())
            return p.determinarPoderAtaque(12) < 5;
          else
            return diferenciaNivel <= 2;
        })
        .collect(Collectors.toList());

  }

}
