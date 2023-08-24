package br.com.devairon.maps.onlineBookstore;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OnlineBookstore {
    private Map<String, Book> onlieBookstoreMap;

    OnlineBookstore(){
        this.onlieBookstoreMap = new HashMap<>();
    }

    public void addBook(Book book){
        //TODO Adiciona um livro à livraria, utilizando o ISBN como chave no Map.

    }

    public void removeBook(String title){
        //TODO Remove um livro da livraria, dado o titulo do livro.
    }

    public void displayBooksOrderByPrice(){
        //TODO Exibe os livros da livraria em ordem crescente de preço.
    }

    public List<Book> searchBooksbyAuthor(String author){
        //TODO Retorna uma lista de todos os livros escritos por um determinado autor.
        return null;
    }

    public Book getBookExpensivePrice(){
        //TODO Retorna o livro mais caro disponível na livraria.
        return null;
    }

    public Book displayCheapestBook(){
        //TODO Retorna o livro mais barato disponível na livraria.
        return null;
    }


}
