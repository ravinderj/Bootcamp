package com.step.bootcamp;

import java.util.Objects;

public class Length {
  private final double value;
  private final Units unit;


    private Length(double value, Units unit) {
      this.value = value;
      this.unit = unit;
  }

  public static Length inFeet(double value) {
    return new Length(value, Units.FEET);
  }

  public static Length inInch(double value) {
    return new Length(value, Units.INCH);
  }

  public static Length inCm(double cm) {
    return new Length(cm,Units.CENTIMETER);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Length length = (Length) o;
    return Double.compare(unit.convertIntoBaseUnit(value),length.unit.convertIntoBaseUnit(length.value)) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(unit.convertIntoBaseUnit(value));
  }

  @Override
  public String toString() {
    return "Length{" +
            "value=" + value +
            ", unit=" + unit +
            '}';
  }
}
