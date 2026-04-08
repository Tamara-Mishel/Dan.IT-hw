package java_hw_7.HomeTask2;

import java.util.List;

public class StudentHandler {

    public static List<Student> addStudent(List<Student> students, Student newStudent) {
        students.add(newStudent);
        return students;
    }

    public static List<Student> removeStudentById(List<Student> students, int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(i);
                return students;
            }
        }
        System.out.println("Student with id " + id + " was not found.");
        return students;
    }

    public static void printAllStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
