package br.com.devairon.lists.bookcatalog;

import java.util.ArrayList;
import java.util.List;

public class MainBookCatalog {
    public static void main(String[] args) {


        List<Book> booksCatalog = new ArrayList<>();
        BookCatalog books = new BookCatalog(booksCatalog);
        books.addBook("airon", "primeiro livro", 2013);
        books.addBook("airon", "segundo livro", 2022);
        books.addBook("airon", "terceiro livro livro", 2020);
        books.addBook("ruan", "primeiro livro", 2023);
        books.addBook("jacielly", "mais um livro", 2023);
        List<Book> bookListAuthor = books.findByAuthor("airon".toUpperCase());

        System.out.println("***********************");
        System.out.println("|- CATALAGO DE LIVROS POR AUTOR - |");
        for (Book book : bookListAuthor) System.out.println(book.toString());

        List<Book> bookListIntervalYear = books.findByIntervalYear(2013, 2020);
        System.out.println("***********************");
        System.out.println("|- CATALAGO DE LIVROS POR INTERVALO DE ANOS - |");
        for (Book book : bookListIntervalYear) System.out.println(book.toString());

        List<Book> bookListTitle = books.findByTitle("primeiro livro");
        System.out.println("***********************");
        System.out.println("|- CATALAGO DE LIVROS POR TITULO - |");
        for (Book book : bookListTitle) System.out.println(book.toString());


    }
}
