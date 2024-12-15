package org.example.library;

public class Book {
    private String title;
    private String author;
    private Integer year;
    private Boolean isAvailable = true;

    public Book(String title, String author, Integer year, Boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = isAvailable;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.year = 2024;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }
    public void borrowBook (){
        isAvailable = false;
    }
    public void returnBook(){
        isAvailable = true;
    }
    public void displayBook(){
        System.out.println("Title: " + title + ", Author: " + author + ", Year: " + year + ", Available: " + isAvailable);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
