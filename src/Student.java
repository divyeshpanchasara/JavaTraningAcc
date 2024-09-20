public class Student {
    int id;
    String name;
    float marks;

    Student(int id, String name, float marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    private void displayData(){
        System.out.printf("name: %s, id : %d, marks : %f\n", this.name, this.id, this.marks);
    }

    public static void main(String[] args) {
        Student divyesh = new Student(1, "Divyesh", 99.99f);
        divyesh.displayData();
    }
}
