package com.joysistvi.day22.inheritance.Activity15_SIson;

public class Pen {
    private String brand;
    private String color;
    private double weightInGrams;

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

    @Override
    public String toString() {
        return "\nBrand: " + brand + "\nColor: " + color + "\nWeight in Grams: " + weightInGrams;
    }

}
