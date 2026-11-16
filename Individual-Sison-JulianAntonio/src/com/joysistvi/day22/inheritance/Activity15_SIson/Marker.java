package com.joysistvi.day22.inheritance.Activity15_SIson;

public class Marker extends Pen {
    private boolean permanent;

    public Marker (
                    String brand,
                    String color,
                    double weightInGrams,
                    boolean permanent) {
        super(brand, color, weightInGrams);

        this.permanent = permanent;
    }

    public void SetPermanent(boolean permanent){
        this.permanent = permanent;
    }

    public boolean GetPermanent() {
        return permanent;
    }

    @Override
    public void write(){
        System.out.println("Writing boldly with a marker!");
    }

    @Override
    public String toString() {
        return "Type: " + getClass().getSimpleName() + super.toString() + "\nPermanent: " + (permanent ? "yes" : "no");
    }


}
