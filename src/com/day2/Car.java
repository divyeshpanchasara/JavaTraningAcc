package com.day2;

public class Car {
    private String  model,
            color,
            manufacture;

    private float speed;

    public Car(String model, String color, String manufacture){
        this.model = model;
        this.color = color;
        this.manufacture = manufacture;
        this.speed = 0f;
    }

    public Car(String model, String color, String manufacture, float speed) {
        this(model, color, manufacture);
        this.speed = speed;
    }

    public void display(){
        System.out.printf("My speed is : %.1f %s %s %s\n", this.speed, this.model, this.color, this.manufacture);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public void accelerate(float speed){
        this.speed += speed;
        System.out.println("accelerating to speed " + this.speed);
    }

    public void applyBreak(){
        this.speed = 0f;
        System.out.println("Applying break....");
    }

    public void testDrive(int speed){
        System.out.println("Going for a test drive...vromm!!");
    }
}
