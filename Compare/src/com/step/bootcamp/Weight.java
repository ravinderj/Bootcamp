package com.step.bootcamp;

import java.util.Objects;

public class Weight {
  private final double value;
  private final Units unit;

  private Weight(double value, Units unit) {
    this.value = value;
    this.unit = unit;
  }
  public static Weight inKg(double value) {
    return new Weight(value, Units.KG);
  }

  public static Weight inGram(double value) {
    return new Weight(value, Units.GRAM);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Weight volume = (Weight) o;
    return Double.compare(unit.convertIntoBaseUnit(value),volume.unit.convertIntoBaseUnit(volume.value)) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  @Override
  public String toString() {
    return "Weight{" +
            "value=" + value +
            ", unit=" + unit +
            '}';
  }

  public static Weight inTon(double value) {
    return new Weight(value, Units.TON);
  }
}
