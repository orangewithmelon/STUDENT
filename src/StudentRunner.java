public class StudentRunner {
    public static void main(String[] args) {
        Student student1 = new Student("Michael", 67, 140.24);
        student1.studentInfo();
        System.out.println();
        Student student2 = new Student("Ryan", 45, 120.56);
        student2.studentInfo();
        System.out.println();
        Student student3 = new Student("Matthew", 50, 126.94);
        student3.studentInfo();
    }
}
