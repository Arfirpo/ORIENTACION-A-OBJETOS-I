package io.github.parcialEvento;

import java.time.LocalDate;



public abstract class Evento {
  private String nombreEvento;
  private LocalDate fechaEvento;
  private String temaPpal;
  private double inscripcion;
  private double remeraProm;

  public Evento(String nom, LocalDate fecha, String tema, double insc, double precRem) {
    this.setFechaEvento(fecha);
    this.setInscripcion(insc);
    this.setNombreEvento(nom);
    this.setRemeraProm(precRem);
    this.setTemaPpal(tema);
  }

  public void setFechaEvento(LocalDate fechaEvento) {
    this.fechaEvento = fechaEvento;
  }

  public void setInscripcion(double inscripcion) {
    this.inscripcion = inscripcion;
  }

  public void setNombreEvento(String nombreEvento) {
    this.nombreEvento = nombreEvento;
  }

  public void setRemeraProm(double remeraProm) {
    this.remeraProm = remeraProm;
  }

  public void setTemaPpal(String temaPpal) {
    this.temaPpal = temaPpal;
  }
}
