package com.step.bootcamp;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class WeightTest {
  @Test
  public void oneKgShouldBeEqualToThousandGrams() {
    Weight oneKg = Weight.inKg(1);
    Weight thousandGrams = Weight.inGram(1000);
    assertThat(oneKg, is(thousandGrams));
  }

  @Test
  public void oneTonShouldBeEqualToThousandKgs() {
    Weight oneTon = Weight.inTon(1);
    Weight thousandKg = Weight.inKg(1000);
    assertThat(oneTon, is(thousandKg));
  }
}
