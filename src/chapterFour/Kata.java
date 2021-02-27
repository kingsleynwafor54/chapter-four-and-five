package chapterFour;

public class Kata {
    public String name = "Kingsley";

    public double calculateAverage(int firstNumber, int secondNumber, int thirdNumber) {
        double average = (firstNumber + secondNumber + thirdNumber) * 1.0 / 3.0;
        return average;

    }

    public String calculateGrade(int grade) {
        if (grade >= 90) {
            return "A";
        } else if (grade >= 80) {
            return "B";
        } else if (grade >= 70) {
            return "C";
        } else
            return "F";
    }

    public boolean Even(int man) {
        if (man % 2 == 0) {
            return true;
        } else
            return false;
        }
public boolean isPrime (int numberT0Check) {
    boolean isPrime = true;
    int numberToCheck = 0;
    int counter = 2;
    while (counter < numberT0Check) {
        if (numberT0Check % counter == 0) {
            isPrime = false;
            break;
        }

        counter++;

    }
    return isPrime;
}
public double grade(int grade){
        grade =50;

int gradeCounter = 1;
int total=0;
while (gradeCounter<=100){
    total=total+grade;
    gradeCounter=gradeCounter +1;

}
return total;
}
}