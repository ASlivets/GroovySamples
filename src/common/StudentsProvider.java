package common;

import java.util.ArrayList;
import java.util.List;

public final class StudentsProvider {

    private final List<Student> students;

    public StudentsProvider() {
        Student grigorii = new Student(2015, 42);
        Student nikolai = new Student(2016, 10);
        Student vasilii = new Student(2016, 33);
        Student irina = new Student(2016, 60);
        Student anton = new Student(2016, 41);

        students = new ArrayList<>();
        students.add(grigorii);
        students.add(nikolai);
        students.add(vasilii);
        students.add(irina);
        students.add(anton);
    }

    public List<Student> getStudents() {
        return students;
    }
}
