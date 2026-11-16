package com.joysistvi.day23.polymorphism.Activity16_SIson;

public class GelPen extends Ballpen {

    private boolean waterproof;

    public GelPen(
                    String brand,
                    String color,
                    double weightInGrams,
                    float pointSize,
                    boolean waterproof) {

        super(brand, color, weightInGrams, pointSize);

        this.waterproof = waterproof;
    }

    public void setWaterproof(boolean waterproof) {
        this.waterproof = waterproof;
    }

    public boolean getWaterproof() {
        return waterproof;
    }

    @Override
    public void write() {
        System.out.println("Writing smoothly with a gelpen.");
    }

    @Override
    public String toString() {
        return super.toString() + "\nWaterproof: " + (waterproof ? "Yes" : "No");
    }

    @Override
    public void refill() {
        System.out.println("Replacing the GelPen ink refill.");
    }
}
