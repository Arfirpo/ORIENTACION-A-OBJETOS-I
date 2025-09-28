package ar.edu.unlp.oo1.ejercicio10;

public class Gerente extends EmpleadoJerarquico {

  public Gerente(String nom){
    super(nom);
  }

  public double aportes(){
    return this.montoBasico() * 0.05;
  }

  public double montoBasico(){
    return 57000;
  }
  
}
