package ar.edu.info.oo1.parcialObjetos251raFecha;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Empleado {
  private String nombre;
  private LocalDate fechaNac;
  private int cantHijos;
  private boolean tieneConyuge;
  private List<Contrato> contratos;

  public Empleado(String nom, LocalDate fechaNac, int canthijos, boolean casado, Contrato cont) {
    this.nombre = nom;
    this.fechaNac = fechaNac;
    this.cantHijos = canthijos;
    this.tieneConyuge = casado;
    this.contratos = new ArrayList<Contrato>();
    this.agregarContrato(cont);

  }

  public void agregarContrato(Contrato cont) {
    this.contratos.add(cont);
  }
}
