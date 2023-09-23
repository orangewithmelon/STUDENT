public class Student {

    private String name;
    private int height;
    private double weight;

    public Student(String studentName, int studentHeight, double studentWeight) {
        name = studentName;
        height = studentHeight;
        weight = studentWeight;

    }

    public void studentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Height in inches: " + height);
        System.out.println("Weight in pounds: " + weight);
    }
}
