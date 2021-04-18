package com.example.homework.models;

public class Book {
    private static int nextId = 0;

    private int id;
    private String title;
    private String author;
    private Integer releaseYear;

    public Book(String title, String author, Integer releaseYear) {
        this.id = nextId++;
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
    }

    public Book(Book book) {
        this(book.getTitle(), book.getAuthor(), book.getReleaseYear());
    }

    public Book() {
        this.title = "";
        this.author = "";
        this.releaseYear = 0;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return this.id + ": " + this.title + " " + this.author + " " + this.releaseYear;
    }
}
