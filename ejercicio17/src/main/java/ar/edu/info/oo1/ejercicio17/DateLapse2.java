package ar.edu.info.oo1.ejercicio17;

import java.time.LocalDate;

public class DateLapse2 implements TimeLapse {
  private LocalDate from;
  private int sizeInDays;

  public DateLapse2(LocalDate from, int days) {
    this.setFrom(from);
    this.setSizeInDays(days);
  }

  public DateLapse2() {
  }

  public void setFrom(LocalDate from) {
    this.from = from;
  }

  public LocalDate getFrom() {
    return from;
  }

  public LocalDate getTo() {
    return this.from.plusDays(this.sizeInDays);
  }

  public void setSizeInDays(int sizeInDays) {
    this.sizeInDays = sizeInDays;
  }

  @Override
  public int getSizeInDays() {
    return sizeInDays;
  }

  @Override
  public boolean includesDate(LocalDate otherDate) {
    return ((otherDate.isEqual(this.from) || otherDate.isAfter(this.from))
        && (otherDate.isEqual(this.getTo()) || otherDate.isBefore(this.getTo())));
  }
}
