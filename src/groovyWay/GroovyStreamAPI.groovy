package groovyWay

import common.StudentsProvider

def students = new StudentsProvider().getStudents()

int sumScore = students
        .findAll { it.gradeYear == 2016 }
        .collect { it.score }
        .sum()

println sumScore