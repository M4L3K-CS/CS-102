package CS102.Lectures.Object;

public class Account {
    int number;
    double balance;
    String currency;
    public String Currency;
    public int Balance;

    public void deposit(double d) {
        balance = balance + d;
    }

    public void report() {
        System.out.println("Account " + number + " has " + balance + " " + currency);
    }
}
