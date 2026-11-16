package com.joysistvi.day23.polymorphism.Activity16_SIson;

public class Pencil extends Pen {
    private String hardness;

    public Pencil (
            String brand,
            String color,
            double weightInGrams,
            String hardness) {
        super(brand, color, weightInGrams);

        this.hardness = hardness;
    }

    public void SetHardness(String hardness){
        this.hardness = hardness;
    }

    public String GetHardness() {
        return hardness;
    }

    @Override
    public void write(){
        System.out.println("Sketching stencils using this pencil.");
    }

    @Override
    public String toString() {
        return "Type: " + getClass().getSimpleName() + super.toString() + "\nHardness: " + hardness;
    }

    @Override
    public void refill() {
        System.out.println("Replacing the pencil lead.");
    }


}
