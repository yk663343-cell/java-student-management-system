import java.util.Scanner;

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
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Student Age: ");
        int age = sc.nextInt();

        Student s1 = new Student(id, name, age);

        System.out.println("\nStudent Details:");
        s1.displayStudent();

        sc.close();
    }
}