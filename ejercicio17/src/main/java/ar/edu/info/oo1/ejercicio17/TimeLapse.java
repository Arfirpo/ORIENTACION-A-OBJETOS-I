package ar.edu.info.oo1.ejercicio17;

import java.time.LocalDate;

public interface TimeLapse {
  public boolean includesDate(LocalDate otherDate);
  public int getSizeInDays();

}
