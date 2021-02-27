package chapterFour;

public class King {

    public String grade(double grade) {
        if (grade >= 90.0) {
            return "A";
        } else if (grade >= 80.0) {
            return "B";
        } else if (grade >= 70.0) {
            return "C";
        }
        else
            return "false";

    }
}