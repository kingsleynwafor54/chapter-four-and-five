package chapterFour;

import java.util.Scanner;

public class ClassAverage {
    public static void main(String[] args) {
        double average;
        int total=0;
        int grade ;
                int counter=0;


        while (counter<10){
            Scanner sc=new Scanner(System.in);
            System.out.print("enter number");
            grade=sc.nextInt();
            total = total +grade;
            counter++;


        }
        average=total/counter;
        System.out.println(average);
        System.out.println(counter);
        Scanner sc= new Scanner(System.in);
        System.out.print("enter y");
        int y = sc.nextInt();

        System.out.print("enter x");
        int x = sc.nextInt();


        if (y == 8)
            if (x == 5) {
                System.out.println("@@@@@");
            }
        else
                System.out.println("#####");
        System.out.println("$$$$$");
        System.out.println("&&&&&");





    }
}
