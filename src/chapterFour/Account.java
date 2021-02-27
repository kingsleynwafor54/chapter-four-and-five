package chapterFour;

public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        if (balance >= 0.0)
            this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;

    }

    public double deposit(double money) {
        if (money > 0.0)
            this.balance = balance + money;
        return this.balance;
    }

    public double withdraw(double withdrawal) {
        if ( balance>= withdrawal)
            this.balance = balance - withdrawal;
        return this.balance;

    }

    public void balance(double balance) {
        if (balance >= 0)
            this.balance = balance;
    }

    public String getName() {
        return this.name;
    }

    public double getBalance() {
        return balance;
    }
public String amount(double withdrawal){
        if (withdrawal>0.0)
            return
                    "Welcome To Chibuzo";
        else
            return " Chibuzo Insufficient fund";
}
}
