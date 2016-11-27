package common;

public final class Student {
    private final int gradeYear;
    private final int score;

    public Student(int gradeYear, int score) {
        this.gradeYear = gradeYear;
        this.score = score;
    }

    public int getGradeYear() {
        return gradeYear;
    }

    public int getScore() {
        return score;
    }
}
