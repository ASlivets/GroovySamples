package java8way;

import common.Student;
import common.StudentsProvider;

import java.util.List;

public class GeneralStream {
    public static void main(String[] args) {
        StudentsProvider studentsProvider = new StudentsProvider();
        List<Student> students = studentsProvider.getStudents();

        int sumScore = students.stream()
                .filter(student -> student.getGradeYear() == 2016)
                .mapToInt(Student::getScore)
                .sum();

        System.out.println(sumScore);
    }
}
