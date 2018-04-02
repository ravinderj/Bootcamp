package com.step.bootcamp;

import java.util.Objects;

public class Volume {
  private final double value;
  private final Units unit;

  private Volume(double value, Units unit) {
    this.value = value;
    this.unit = unit;
  }
  public static Volume inGallon(double value) {
    return new Volume(value, Units.GALLON);
  }

  public static Volume inLitre(double value) {
    return new Volume(value, Units.LITRE);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Volume volume = (Volume) o;
    return Double.compare(unit.convertIntoBaseUnit(value),volume.unit.convertIntoBaseUnit(volume.value)) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  @Override
  public String toString() {
    return "Volume{" +
            "value=" + value +
            ", unit=" + unit +
            '}';
  }
}
