package br.com.devairon.lists.bookcatalog;

import java.util.ArrayList;
import java.util.List;

public class BookCatalog {
    List<Book> books;

    public BookCatalog(List<Book> books) {
        this.books = books;
    }

    public BookCatalog() {
    }

    void addBook(String author, String title, int publicationYear) {
        this.books.add(new Book(author, title, publicationYear));
    }

    List<Book> findByAuthor(String author) {

        List<Book> booksByAuthor = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) booksByAuthor.add(book);

        }
        return booksByAuthor;
    }

    List<Book> findByIntervalYear(int initialYear, int finalYear) {
        List<Book> listBooksIntervalYears = new ArrayList<>();
        for (Book book : books) {
            if (book.getPublicationYear() >= initialYear && book.getPublicationYear() <= finalYear) {
                listBooksIntervalYears.add(book);
            }
        }

        return listBooksIntervalYears;
    }

    List<Book> findByTitle(String title) {
        List<Book> listBookByTitle = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) listBookByTitle.add(book);
            break;
        }
        return listBookByTitle;
    }


}
