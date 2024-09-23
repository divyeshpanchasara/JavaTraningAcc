package com.day2;

public class Car {
    private String  model,
            color,
            manufacture;

    private int speed;

    public Car(String model, String color, String manufacture){
        this.model = model;
        this.color = color;
        this.manufacture = manufacture;
        this.speed = 0;
    }

    public Car(String model, String color, String manufacture, int speed) {
        this.model = model;
        this.color = color;
        this.manufacture = manufacture;
        this.speed = speed;
    }

    public void display(){
        System.out.printf("%s %s %s\n", this.model, this.color, this.manufacture);
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

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void accelerate(int speed){
        this.speed += speed;
        System.out.println("acclerataing to speed " + this.speed);
    }

    public void applyBreak(){
        this.speed = 0;
        System.out.println("Applying break");
    }

    public void testDrive(int speed){
        System.out.println("Going for a test drive!!");
    }
}
