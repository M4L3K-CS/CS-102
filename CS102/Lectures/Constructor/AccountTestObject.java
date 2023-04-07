package CS102.Lectures.Constructor;

public class AccountTestObject {
    public static void main(String[] args) {
        Account account1 = new Account(1, 1000, "TL", 0.0);
        Account account2 = new Account(2, 800, "USD", 0.0);
        account1.deposit(50);
        account2.deposit(300);
        System.out.println("Account " + account1.number + " has " + account1.balance + " " + account1.currency); // account1.report();
                                                                                                                 // can
                                                                                                                 // be
                                                                                                                 // used
                                                                                                                 // to
                                                                                                                 // shorten
                                                                                                                 // the
                                                                                                                 // code
        account2.report();

    }
}