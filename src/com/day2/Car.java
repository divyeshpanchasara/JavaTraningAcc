package com.day2;

public class Car {
    private String  model,
            color,
            manufacture;

    public Car(String model, String color, String manufacture){
        this.model = model;
        this.color = color;
        this.manufacture = manufacture;
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
}
