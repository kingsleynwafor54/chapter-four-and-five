package chapterFour;

import java.util.Scanner;

public class WhileLoop {


    public static void main(String[] args) {

        int a = 0;
        while (a <= 2) {
            if (a % 2 == 1)
                System.out.println("*      *\n*      *");
            else
                System.out.println("********");
            ++a;
            Scanner sc = new Scanner(System.in);
            System.out.print("enter your number");
            int num = sc.nextInt();
            int num2 = 2;
            System.out.print("enter your number");
            num2 = sc.nextInt();
            while (num2 < num) {
                if (num % num2 == 0) {
                    num2++;


                    System.out.println("not prime");
                    break;
                } else
                    System.out.println("prime");
                break;
            }
            int number = 0;

            System.out.println("Guess a number between 40 -55 in three trials");

            while (number != -1) {
                System.out.print("enter number enter -1 to exit ");
                number = sc.nextInt();
                if (number == 45) {
                    System.out.print("you win");

                    break;

                } else
                    System.out.println("Try again letter!!!");


            }
        }
    }
}