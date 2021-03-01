package chapterFour;

import java.util.Scanner;

public class AvgDoWhile {
    public static void main(String[] args) {
        double average = 0;
        double total = 0;
        double score = 0;
        int counter = 1;
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("Enter grade");
            score =sc.nextDouble();
            total=total+score;

            average = total / counter;
            System.out.println("Your Average Score is " +average);

     counter++;   } while (counter <= 10);


    }
}