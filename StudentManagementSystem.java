import java.util.Scanner;

class Student {
    int id;
    String name;
    String course;
    int age;
    int marks;

    void addStudent(int i, String n, String c, int a, int m) {
        id = i;
        name = n;
        course = c;
        age = a;
        marks = m;
    }

    void displayStudent() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s = new Student();

        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        s.addStudent(id, name, course, age, marks);

        System.out.println("\nStudent Details:");
        s.displayStudent();

        sc.close();
    }
}