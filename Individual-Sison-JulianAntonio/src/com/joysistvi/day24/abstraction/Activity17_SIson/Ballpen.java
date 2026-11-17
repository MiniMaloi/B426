package com.joysistvi.day24.abstraction.Activity17_SIson;

public class Ballpen extends Pen implements Refillable, Clickable{
    private float pointSize;

    public Ballpen(
                    String brand,
                    String color,
                    double weightInGrams,
                    float pointSize) {

        super(brand, color, weightInGrams);

        this.pointSize = pointSize;
    }

    public void SetPointSize(float pointSize){
        this.pointSize = pointSize;
    }

    public float GetPointSize() {
        return pointSize;
    }

    @Override
    public void write() {
        System.out.println("Writing smoothly with a ballpen.");
    }

    @Override
    public String toString() {
        return "Type: " + getClass().getSimpleName() + super.toString() + "\nPoint Size: " + pointSize;
    }

    @Override
    public void refill() {
        System.out.println("Replacing the Ballpen ink refill.");
    }

    @Override
    public void click(){
        System.out.println(CLICK_SOUND + " The ballpen tip comes out");
    }
}
