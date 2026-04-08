package java_hw_7.HomeTask2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        StudentHandler.addStudent(students, new Student(1, "Anna", 20, 3.8));
        StudentHandler.addStudent(students, new Student(2, "John", 22, 3.5));
        StudentHandler.addStudent(students, new Student(3, "Maria", 19, 3.9));
        StudentHandler.addStudent(students, new Student(4, "Oleg", 21, 3.2));
        StudentHandler.addStudent(students, new Student(5, "Kate", 23, 3.6));

        System.out.println("All students");
        StudentHandler.printAllStudents(students);

        System.out.println("\nFind by name");
        Student found = Student.findStudentByName(students, "Maria");
        System.out.println(found);

    }
}
