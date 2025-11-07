package ar.edu.info.oo1.ejercicio19;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse implements TimeLapse {
  private LocalDate from;
  private LocalDate to;

  public DateLapse(LocalDate from, LocalDate to) {
    this.setFrom(from);
    this.setTo(to);
  }

  public DateLapse() {
  }

  public void setFrom(LocalDate from) {
    this.from = from;
  }

  public LocalDate getFrom() {
    return from;
  }

  public void setTo(LocalDate to) {
    this.to = to;
  }

  public LocalDate getTo() {
    return to;
  }

  @Override
  public int getSizeInDays() {
    return ((int) this.from.until(this.to, ChronoUnit.DAYS));
  }

  public int sizeInMonths() {
    return ((int) this.from.until(this.to, ChronoUnit.MONTHS)) + 1;
  }

  @Override
  public boolean includesDate(LocalDate otherDate) {
    return ((otherDate.isEqual(this.from) || otherDate.isAfter(this.from))
        && (otherDate.isEqual(this.to) || otherDate.isBefore(this.to)));
  }

  public boolean overlapse(DateLapse periodo) {
    return !((this.from.isAfter(periodo.to)) || (this.to.isBefore(periodo.from)));
  }

}
