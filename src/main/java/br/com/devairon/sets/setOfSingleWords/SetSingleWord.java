package br.com.devairon.sets.setOfSingleWords;

import java.util.HashSet;
import java.util.Set;

public class SetSingleWord {
    Set<String> setWords = new HashSet<>();

    public SetSingleWord(Set<String> setWords) {
        this.setWords = setWords;
    }

    public void addWord(String word){
        //TODO Adiciona uma palavra ao conjunto.
    }

    public void removeWord(String word){
        //TODO Remove uma palavra do conjunto.
    }

    public boolean verifyWord(String word){
        //TODO Verifica se uma palavra está presente no conjunto.
        return false;
    }

    public void displaySingleWords(){
        //TODO Exibe todas as palavras únicas do conjunto.
    }
}
