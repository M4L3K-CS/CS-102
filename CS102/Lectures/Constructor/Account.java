package CS102.Lectures.Constructor;

public class Account {
    int number;
    double balance;
    String currency;
    double interestRate;

    public Account(int n, double b, String c, double i) {
        number = n;
        if (b > 0)
            balance = b;
        else
            balance = 0;
        currency = c;
        interestRate = i;
    }

    public void deposit(double d) {
        if (d > 0)
            balance = balance + d;
        else
            System.out.println("Invalid deposit amount, amount must be positive");
    }

    public void report() {
        System.out.println("Account " + number + " has " + balance + " " + currency);
    }
}