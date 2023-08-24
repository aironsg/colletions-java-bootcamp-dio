package br.com.devairon.maps.onlineBookstore;

public class Book {
    private String author;
    private String title;
    private String price;

    public Book(String author, String title, String price) {
        this.author = author;
        this.title = title;
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getPrice() {
        return price;
    }
}
