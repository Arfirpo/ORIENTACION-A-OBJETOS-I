package ar.edu.info.oo1.ejercicio16;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testDateLapse {

  private DateLapse dl1;

  @BeforeEach
  void setUp() {
    dl1 = new DateLapse(LocalDate.of(2024, 01, 01), LocalDate.of(2024, 12, 31));

  }

  @Test
  public void testSizesInDays() {
    assertEquals(365, dl1.sizeInDays());
    assertEquals(12, dl1.sizeInMonths());
  }

  @Test
  public void testIncludesDate() {
    assertTrue(dl1.includesDate(LocalDate.of(2024, 11, 25)));
    assertTrue(dl1.includesDate(LocalDate.of(2024, 12, 31)));
    assertTrue(dl1.includesDate(LocalDate.of(2024, 1, 1)));
    assertFalse(dl1.includesDate(LocalDate.of(2030, 1, 23)));
    assertFalse(dl1.includesDate(LocalDate.of(2023, 12, 31)));
  }

}
