public class Car {
    String  model,
            color,
            manufacture;

    public Car(String model, String color, String manufacture){
        this.model = model;
        this.color = color;
        this.manufacture = manufacture;
    }

    private void display(){
        System.out.printf("%s %s %s\n", model,color,manufacture);
    }

    public static void main(String[] args) {
        Car suzuki = new Car("Dzire", "blue", "suzuki");
        Car jagur = new Car("some model", "some color", "jaguar");
        Car toyota = new Car("some model", "some color", "toyota");

        suzuki.display();
        jagur.display();
        toyota.display();
    }
}
