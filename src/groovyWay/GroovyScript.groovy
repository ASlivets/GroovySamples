package groovyWay

import common.StudentsProvider

def students = new StudentsProvider().getStudents()

int sumScore = students.stream()
        .filter { it.gradeYear == 2016 }
        .mapToInt() { it.score }
        .sum()

println sumScore