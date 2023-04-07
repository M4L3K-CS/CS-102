package CS102.Lab.Week4.Lab3;

public class LibraryTest {
    public static void main(String[] args) {

        Library library1 = new Library("La bibliothèques du Petit Larousse", " 0301653190 ");
        Library library2 = new Library("Los Pollos Hermanos Biblioteca", " 011 52 89 1234 5678 ");
        library1.addBook(new Book("The Hobbit", 295, false, 123456789));
        library1.addBook(new Book("The Lord of the Rings", 1000, true, 987654321));
        library2.addBook(new Book("The Silmarillion", 500, false, 123456789));
        System.out.println(library1);
        System.out.println(library2);
    }
}