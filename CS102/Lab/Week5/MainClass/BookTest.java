package CS102.Lab.Week5.MainClass;

public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book("The Hobbit", 295, false, 123456789);
        Book book2 = new Book("The Lord of the Rings", 1000, true, 987654321);
        Book book3 = new Book("The Silmarillion", 500, false, 123456789);
        System.out.println("Book 1: " + book1.getTitle() + " is " + book1.getPages() + " pages " + "(ISBN: "
                + book1.getIsbn() + ")" + " On Loan: " + book1.isOnloan());
        System.out.println("Book 2: " + book2.getTitle() + " is " + book2.getPages() + " pages "
                + "(ISBN: " + book2.getIsbn() + ")" + " On Loan: " + book2.isOnloan());
        System.out.println("Book 3: " + book3.getTitle() + " is " + book3.getPages() + " pages " + "(ISBN: "
                + book3.getIsbn() + ")" + " On Loan: " + book3.isOnloan());

    }
}