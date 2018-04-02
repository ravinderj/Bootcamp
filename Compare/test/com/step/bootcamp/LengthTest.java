package com.step.bootcamp;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LengthTest {
  @Test
  public void shouldGiveTwelveInchesForOneFoot() {
    Units oneFoot = Units.FEET;
    double twelveInches = Units.INCH.convertIntoBaseUnit(12);
    assertThat(oneFoot.convertIntoBaseUnit(1),is(twelveInches));
  }

  @Test
  public void shouldGiveOneFootForTwelveInches() {
    double twelveInches = Units.INCH.convertIntoBaseUnit(12);
    Units oneFoot = Units.FEET;
    assertThat(twelveInches, is(oneFoot.convertIntoBaseUnit(1)));
  }

  @Test
  public void shouldGive2InchesEqualTo5cm() {
    double fiveCm = Units.CENTIMETER.convertIntoBaseUnit(5);
    double twoInch = Units.INCH.convertIntoBaseUnit(2);
    assertThat(twoInch, is(fiveCm));
  }

  @Test
  public void oneCMShouldBeEqualTo10MM() {
    double oneCm = Units.CENTIMETER.convertIntoBaseUnit(1);
    double tenMM = Units.MM.convertIntoBaseUnit(10);
    assertThat(oneCm, is(tenMM));
  }
}