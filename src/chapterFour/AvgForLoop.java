package chapterFour;
import java.util.Scanner;
public class AvgForLoop {
    public static void main(String[] args) {
        double total = 0;
        int counter;
        double average = 0;
        double score = 0;

        Scanner sc = new Scanner(System.in);

        for (counter = 0; counter <= 10; counter++) {


            System.out.println("Enter your score");
            score = sc.nextDouble();
            total = total + score;
            average = total / counter++;

        }
                System.out.println("Average score is " + average);

        }
    }
