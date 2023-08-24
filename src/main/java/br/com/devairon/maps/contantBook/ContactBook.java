package br.com.devairon.maps.contantBook;

import java.util.HashMap;
import java.util.Map;

public class ContactBook {

    private Map<String, String> contact;

    public ContactBook() {
        this.contact = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber){
        //TODO Adiciona um contato à agenda, associando o nome do contato ao número de telefone correspondente.

    }

    public void removeContact(String name){
        //TODO Remove um contato da agenda, dado o nome do contato.
    }

    public void displayContacts(){
        //TODO Exibe todos os contatos da agenda, mostrando o nome e o número de telefone de cada contato.
    }

    public Contact searchByName(String name){
        //TODO Pesquisa um contato pelo nome e retorna o número de telefone correspondente.
        return null;
    }
}
