package com.joysistvi.day23.polymorphism.Activity16_SIson;

public class Pen {
    private String brand;
    private String color;
    private double weightInGrams;
    private String text;

    public Pen(
                String brand,
                String color,
                double weightInGrams) {

        this.brand = brand;
        this.color = color;
        this.weightInGrams = weightInGrams;
    }

    public void write() {

        System.out.println("Writing with a pen.");
    }

    public void refill() {
        System.out.println("Refilling the pen.\n");
    }

    public void SetBrand(String brand) {

        this.brand = brand;
    }

    public void SetColor(String color) {

        this.color = color;
    }

    public void SetWeightInGrams(double weightInGrams) {

        this.weightInGrams = weightInGrams;
    }

    public String GetBrand() {

        return brand;
    }

    public String GetColor() {

        return color;
    }

    public double GetWeightInGrams() {

        return weightInGrams;
    }

    public void write(String text) {
        System.out.println("Writing \"" + text + "\" with a pen.");
    }

    public void write(String text, int times) {
        for (int i = 0; i < times; i++) {
            write(text);
        }
    }

    @Override
    public String toString() {
        return "\nBrand: " + brand + "\nColor: " + color + "\nWeight in Grams: " + weightInGrams;
    }

}
