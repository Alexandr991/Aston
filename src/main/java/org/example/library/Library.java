package org.example.library;

public class Library {
    private Book[] books = new Book[0];

    public Book[] addBook(Book book) {
        Book[] updatedBookList = new Book[books.length + 1];
        for (int i = 0; i < books.length; i++) {
            updatedBookList[i] = books[i];
        }
        updatedBookList[updatedBookList.length - 1] = book;
        books = updatedBookList;
        return books;

    }

    public void printAvailableBooks() {
        for (Book book : books) {
            if (book.getAvailable()) {
                book.displayBook();
            }
        }
    }

    public void findBooksByAuthor(String author) {
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                book.displayBook();
            }
        }
    }

}
