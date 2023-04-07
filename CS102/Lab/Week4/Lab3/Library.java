package CS102.Lab.Week4.Lab3;

import java.util.ArrayList;

public class Library {
    private String name;
    private String phone;
    private ArrayList<Book> collection;

    public Library(String name, String phone) {
        this.name = name;
        this.phone = phone;
        this.collection = new ArrayList<Book>();
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void addBook(Book book) {
        collection.add(book);
    }

    public boolean contains(String name) {
        for (Book book : this.collection) {
            if (book.getTitle().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String output = name + " collection:\n";
        for (int i = 0; i < collection.size(); i++) {
            output += collection.get(i).getTitle() + " (" + collection.get(i).getIsbn() + ")\n";
            output += "\n";
        }
        return output;
    }
}