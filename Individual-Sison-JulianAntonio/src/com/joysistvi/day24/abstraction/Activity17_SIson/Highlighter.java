package com.joysistvi.day24.abstraction.Activity17_SIson;

public class Highlighter extends Pen implements Refillable{
    private String inkType;

    public Highlighter (
            String brand,
            String color,
            double weightInGrams,
            String inkType) {
        super(brand, color, weightInGrams);

        this.inkType = inkType;
    }

    public void SetInkType(String inkType){
        this.inkType = inkType;
    }

    public String GetinkType() {
        return inkType;
    }

    @Override
    public void write(){
        System.out.println("Highlighting text using this highlighter");
    }

    @Override
    public String toString() {
        return "Type: " + getClass().getSimpleName() + super.toString() + "\nInk Type: " + inkType;
    }

    @Override
    public void refill() {
        System.out.println("Refilling the highlighter ink.");
    }
}
