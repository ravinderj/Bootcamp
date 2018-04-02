package com.step.bootcamp;


import static com.step.bootcamp.MeasurementTypes.*;

public enum Units {
  INCH(1,LENGTH),FEET(12,LENGTH),CENTIMETER(0.4,LENGTH), MM(0.04,LENGTH),
  GALLON(3.78, VOLUME), LITRE(1, VOLUME),
  GRAM(1, WEIGHT), KG(1000, WEIGHT), TON(1000000, WEIGHT);


  private final double conversionFactor;
  private MeasurementTypes type;

  Units(double conversionFactor,MeasurementTypes type) {
    this.conversionFactor = conversionFactor;

    this.type = type;
  }

  public double convertIntoBaseUnit(double quantity){
    return (double) Math.round((quantity * conversionFactor)*100)/100;
  }
}
