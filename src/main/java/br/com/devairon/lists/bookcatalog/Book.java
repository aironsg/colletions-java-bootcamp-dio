package br.com.devairon.lists.bookcatalog;

public class Book {

    private String author;
    private String title;
    private int publicationYear;

    public Book(String author,String title, int publicationYear) {
        this.author = author;
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return
                "|- Autor: " + author + '\'' +
                "|- Titulo: " + title + '\'' +
                "|- Ano de Publicação: " + publicationYear;
    }
}
