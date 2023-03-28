package CS102.Lectures.Week1.Object;

public class AccountTestObject {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.number = 1;
        account1.balance = 1000;
        account1.currency = "Tl";
        Account account2 = new Account();
        account2.number = 2;
        account2.balance = 800;
        account2.currency = "USD";
        account1.deposit(50);
        account2.deposit(300);
        System.out.println("Account " + account1.number + " has " + account1.balance + " " + account1.currency); // account1.report(); can be used to shorten the code
        account2.report();

    }
}