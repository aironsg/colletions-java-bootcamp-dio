package br.com.devairon.sets.contactBook;

import java.util.HashSet;
import java.util.Set;

public class ContactBook {


    Set<Contact> contacts = new HashSet<>();

    public ContactBook(Set<Contact> contacts) {
        this.contacts = contacts;
    }

    public void addContact(String name, String phoneNumber){
        //TODO  Adiciona um contato à agenda.
    }

    public void displayContacts(){
        //TODO Exibe todos os contatos da agenda.
    }

    public Set<Contact> searchByName(String name){
        //TODO Pesquisa contatos pelo nome e retorna uma conjunto com os contatos encontrados.
        return null;
    }

    public void updatePhoneNumberContact(String name, String phoneNumber){
        //TODO Atualiza o número de telefone de um contato específico.
    }
}
