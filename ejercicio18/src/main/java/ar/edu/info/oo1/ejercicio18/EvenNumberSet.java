package ar.edu.info.oo1.ejercicio18;

import java.util.HashSet;

public class EvenNumberSet extends HashSet<Integer> {

  @Override
  public boolean add(Integer num) {
    if (num % 2 == 0) {
      return super.add(num);
    }
    return false;
  }
}

// La otra solucion posible seria en vez de aplicar el abstractset de java y
// redefinir el metodo add, Usar la interfaz de Set y escibir todos los metodos
// de esta incluido el Add para que cumpla la funcionalidad esperada