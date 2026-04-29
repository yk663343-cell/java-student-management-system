class Student {
    int id;
    String name;
    int age;

    Student(int studentId, String studentName, int studentAge) {
        id = studentId;
        name = studentName;
        age = studentAge;
    }

    void displayStudent() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("-------------------");
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Yogesh", 19);
        s1.displayStudent();
    }
}