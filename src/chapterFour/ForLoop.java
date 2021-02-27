package chapterFour;
import java.util.Scanner;
public class ForLoop {
    public static void main(String[] args) {
        double total = 0;
        Scanner sc = new Scanner(System.in);
        double grade = 0.0;
        int gradeCounter = 1;
        while (gradeCounter <= 10) {
          System.out.print("your grade please");
          grade= sc.nextDouble();
            total = total + grade;
           gradeCounter++;
        }


        System.out.print(total);
    }
}