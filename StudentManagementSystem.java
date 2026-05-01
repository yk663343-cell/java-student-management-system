class Student {
    int id;
    String name;

    void addStudent(int i, String n) {
        id = i;
        name = n;
    }

    void displayStudent() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    void updateStudent(String newName) {
        name = newName;
        System.out.println("Student name updated.");
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        Student s = new Student();

        s.addStudent(101, "Yogesh");
        s.displayStudent();

        s.updateStudent("Rahul");
        s.displayStudent();
    }
}