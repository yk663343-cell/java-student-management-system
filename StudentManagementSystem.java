import java.util.Scanner;

class Student {
    int id;
    String name;
    String course;
    int age;

    void addStudent(int i, String n, String c, int a) {
        id = i;
        name = n;
        course = c;
        age = a;
    }

    void displayStudent() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Age: " + age);
    }

    void updateStudent(String newName, String newCourse) {
        name = newName;
        course = newCourse;
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
        sc.nextLine();

        s.addStudent(id, name, course, age);

        System.out.println("\nStudent Details:");
        s.displayStudent();

        System.out.print("\nEnter New Name: ");
        String newName = sc.nextLine();

        System.out.print("Enter New Course: ");
        String newCourse = sc.nextLine();

        s.updateStudent(newName, newCourse);

        System.out.println("\nUpdated Student Details:");
        s.displayStudent();

        sc.close();
    }
}