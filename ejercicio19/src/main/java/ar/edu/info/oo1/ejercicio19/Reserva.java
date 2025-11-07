package ar.edu.info.oo1.ejercicio19;

import java.time.LocalDate;

public class Reserva {
  private DateLapse fecha;
  private Inmueble inmueble;
  private Usuario inquilino;

  public Reserva(DateLapse fecha, Inmueble inm, Usuario inquilino) {
    this.setFecha(fecha);
    this.setInmueble(inm);
    this.setInquilino(inquilino);
  }

  public Reserva(LocalDate fechaIni, LocalDate fechaFin, Inmueble inm, Usuario inquilino) {
    this.setFecha(fechaIni, fechaFin);
    this.setInmueble(inm);
    this.setInquilino(inquilino);
  }

  public void setFecha(LocalDate fechaIni, LocalDate fechaFin) {
    this.fecha = new DateLapse(fechaIni, fechaFin);
  }

  public void setFecha(DateLapse fecha) {
    this.fecha = fecha;
  }

  public void setInmueble(Inmueble inmueble) {
    this.inmueble = inmueble;
  }

  public Inmueble getInmueble() {
    return inmueble;
  }

  public void setInquilino(Usuario inquilino) {
    this.inquilino = inquilino;
  }

  public Usuario getInquilino() {
    return inquilino;
  }

  public DateLapse getFecha() {
    return fecha;
  }

  public double costoTotal(){
    return this.fecha.getSizeInDays() * this.inmueble.getPrecioNoche();
  }

}
