package chapterFour;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
        Account account =new Account("kingsley",78.90);
        System.out.printf("name:%s balance%.2f%n:",account.getName(),account.getBalance());
       // System.out.println(account.withdraw(50));

        System.out.print("Please Enter your amount");
        double withdrawal=sc.nextDouble();

        System.out.printf("I am making a withdrawal of$%.2f%n", withdrawal);
       account.withdraw(withdrawal);

        System.out.println("Your account balance is"+ account.getBalance());
        account.deposit(50);
        System.out.println("Your account balance is"+ account.getBalance());
        account.amount(50);
        System.out.println(account.amount(50));

    }
}
