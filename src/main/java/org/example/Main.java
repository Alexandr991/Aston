package org.example;


import org.example.library.Book;
import org.example.library.Library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book firstBook = new Book("FistTitle", "FirstAuthor");
        Book secondBook = new Book("SecondTitle", "SecondAuthor");
        Book thirdBook = new Book("ThirdTitle", "ThirdAuthor", 2000, false);
        library.addBook(firstBook);
        library.addBook(secondBook);
        library.addBook(thirdBook);
        library.printAvailableBooks();
        thirdBook.setAvailable(true);
        System.out.println();
        library.printAvailableBooks();

    }
}