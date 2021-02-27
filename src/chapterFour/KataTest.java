package chapterFour;

public class KataTest{

    public static void main(String[] args) {
       Kata kata = new Kata();
        System.out.println("The average is "+ kata.calculateAverage(23,13,14));
        System.out.println("You score is "+ kata.calculateGrade(79));
       kata.name="Merlin";
        System.out.println("His name is " +kata.name);
        System.out.println(kata.Even(8));
        System.out.println(kata.isPrime(9));
        System.out.println("The total score of 50 is " + kata.grade(50));
    //King slat =new King();
       // System.out.println("your grade is "+ slat.grade(98));


    }
}


