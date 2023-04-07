package CS102.Lab.Week4.Lab3;

public class Book {
    private String title;;
    private int pages;
    private boolean onloan;
    private int isbn;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public boolean isOnloan() {
        return onloan;
    }

    public void setOnloan(boolean onloan) {
        this.onloan = onloan;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void loan() {
        onloan = true;
    }

    public void returnBook() {
        onloan = false;
    }

    public Book(String title, int pages, boolean onloan, int isbn) {
        this.title = title;
        this.pages = pages;
        this.onloan = onloan;
        this.isbn = isbn;

    }
}