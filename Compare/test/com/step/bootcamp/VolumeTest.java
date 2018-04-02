package com.step.bootcamp;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class VolumeTest {
  @Test
  public void oneGallonShouldBeEqualToThreeDecimalSeventyEightLitre() {
    Volume oneGallon = Volume.inGallon(1);
    Volume threeDecimalSeventyEightLitre = Volume.inLitre(3.78);
    assertThat(oneGallon, is(threeDecimalSeventyEightLitre));
  }
}
