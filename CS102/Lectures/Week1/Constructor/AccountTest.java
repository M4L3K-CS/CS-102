package CS102.Lectures.Week1.Constructor;

public class AccountTest {
    public static void main(String[] args) {
        int account1ID = 1; // stored in stack memory and it is a primitive type
        double account1Balance = 1000; // stored in stack memory and it is a primitive type
        String account1Currency = "Tl"; // stored in the heap memory and it is a reference type
        int account2ID = 2; // stored in stack memory and it is a primitive type
        double account2Balance = 800; // stored in stack memory and it is a primitive type
        String account2Currency = "USD"; // stored in the heap memory and it is a reference type 
        account1Balance = account1Balance + 50;
        account2Balance = account2Balance + 200;
        System.out.println("Account" + account1ID + " has " + account1Balance + " " + account1Currency);
        System.out.println("Account" + account2ID + " has " + account2Balance + " " + account2Currency);
    }

}
