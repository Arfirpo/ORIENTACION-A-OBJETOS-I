package ar.edu.unlp.oo1.ejercicio10;

public class Empleado {
	private String nombre;

	public Empleado(String nom) {
		this.setNombre(nom);
	}

	public Empleado() {
	}

	public double aportes() {
		return 13500;
	}

	public double montoBasico() {
		return 35000;
	}

	public double sueldoBasico() {
		return this.montoBasico() + this.aportes();
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

}
