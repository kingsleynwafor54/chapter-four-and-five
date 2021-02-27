package chapterFour;

import java.lang.invoke.SwitchPoint;
import java.sql.SQLOutput;
import java.util.Scanner;

public class prack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       /*int grade =0;
       int c=5;
        int gradeCounter = 1;
       int total=0;
     double average;

        while(grade!=-1){
            System.out.print("enter your grade");
             grade= sc.nextInt();
            total= total+ grade;


        }
        average=total/gradeCounter;
        System.out.println(c++);
        System.out.println(++c);
        System.out.println(total);
        System.out.println(average);*/
     /*   int counter =1;
       do{
            System.out.printf("%d ",counter);
            counter++;

        }while(counter >=10);
        System.out.println();

     */


        int number = 0;

        do {
            System.out.print("enter number enter -1 to exit");
            number = sc.nextInt();
            if (number == 3) {
                System.out.println("you win");
                break;
            }
            else System.out.println("Try again later");
        } while (number != -1);

    }

}