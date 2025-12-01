package io.github.parcialEvento;

import java.time.LocalDate;

public class EventoPresencial extends Evento {

  public EventoPresencial(String nom, LocalDate fecha, String tema, double insc, double precRem) {
    super(nom, fecha, tema, insc, precRem);
  }
}
