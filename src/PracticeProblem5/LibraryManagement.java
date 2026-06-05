package PracticeProblem5;

class Book {
    String title;
    String author;

    Book(String title) {
        this.title = title;
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println(title + " " + author);
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Book b1 = new Book("Java");
        Book b2 = new Book("OOP", "Junayed");

        b1.display();
        b2.display();
    }
}