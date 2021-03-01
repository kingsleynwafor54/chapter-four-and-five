package chapterFour;

import java.util.Scanner;

public class AvgSentinel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double average=0;
        double total= 0;
        double score=0;
        int counter=0;
        while (score != -1 ) {
            System.out.println("Enter score");
            score=sc.nextDouble();
            total=total+score;
            counter++;

        }
        average=total/counter;
        System.out.println(average);


    }
}





