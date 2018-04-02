package com.step.bootcamp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class CompareTest {
  @Test
  public void shouldGiveTrueForOneFeetAndOneFeet() {
    Length oneFoot = Length.inFeet(1);
    Length expectedFoot = Length.inFeet(1);
    assertEquals(oneFoot, expectedFoot);
  }

  @Test
  public void shouldGiveTrueForOneFeetAndTwelveInch() {
    Length oneFoot = Length.inFeet(1);
    Length twelveInches = Length.inInch(12);
    assertEquals(oneFoot, twelveInches);
  }

  @Test
  public void shouldGiveFalseForUnequalFeet() {
    Length oneFoot = Length.inFeet(1);
    Length twoFeet = Length.inFeet(2);
    assertNotEquals(oneFoot,twoFeet);
  }

  @Test
  public void shouldGiveFalseForOneFootAndSixInch() {
    Length oneFoot = Length.inFeet(1);
    Length sixInches = Length.inInch(6);
    assertNotEquals(oneFoot,sixInches);
  }

  @Test
  public void shouldGiveTrueForHalfFootAndSixInch() {
    Length oneFoot = Length.inFeet(0.5);
    Length sixInches = Length.inInch(6);
    assertEquals(oneFoot,sixInches);
  }

  @Test
  public void twoInchesShouldBeEqualTo5cm() {
    Length fiveCm = Length.inCm(5);
    Length twoInches = Length.inInch(2);
    assertEquals(fiveCm, twoInches);
  }

  @Test
  public void twoAndHalfInchesShouldBeEqualToSixInchesAnd35mm() {
    Length sixPointThreeFiveCm = Length.inCm(2.5);
    Length twoAndHalfInches = Length.inInch(1);
    assertEquals(sixPointThreeFiveCm, twoAndHalfInches);
  }

  @Test
  public void twoInchesShouldNotBeEqualTo4cm() {
    Length fiveCm = Length.inCm(4);
    Length twoInches = Length.inInch(2);
    assertNotEquals(fiveCm, twoInches);
  }
}
