import java.util.Scanner;

public class Sentnel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      /*  int grade=0;
        int total = 0;
        int counter = 0;
        while (counter < 3) {
            System.out.print("enter a number");
            grade = sc.nextInt();


            total = total + grade;
            counter++;
        }
            int average = total / counter++;
            System.out.println("the average is" + average + "while the total is " + total);*/

int number=0;

        while (number != -1) {
            System.out.print("enter number enter -1 to exit");
            number = sc.nextInt();

            if (number == 3) {
                System.out.println("you win");
            } else
                System.out.println("Try again later");
        }
    }
}