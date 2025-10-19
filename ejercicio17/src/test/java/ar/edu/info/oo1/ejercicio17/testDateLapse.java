package ar.edu.info.oo1.ejercicio17;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testDateLapse {

  private DateLapse2 dl1;

  @BeforeEach
  void setUp() {
    dl1 = new DateLapse2(LocalDate.of(2024, 01, 01), 365);

  }

  @Test
  public void testSizesInDays() {
    assertEquals(365, dl1.getSizeInDays());
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
