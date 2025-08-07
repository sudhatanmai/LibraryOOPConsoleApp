public class Book {
    private String title;
    private String author;
    private int id;
    private boolean isIssued;

    // Constructor
    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isIssued() {
        return isIssued;
    }

    // Mark as issued
    public void issue() {
        isIssued = true;
    }

    // Mark as returned
    public void returnBook() {
        isIssued = false;
    }

    public void displayInfo() {
        System.out.println("Book ID: " + id + ", Title: " + title + ", Author: " + author + ", Issued: " + isIssued);
    }
}
