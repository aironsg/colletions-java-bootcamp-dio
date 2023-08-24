package br.com.devairon.maps.dictionary;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {

    private Map<String,String> dictionaryMap;

    public Dictionary() {
        this.dictionaryMap = new HashMap<>();
    }

    public void addWord(String word, String definition){
        //TODO  Adiciona uma palavra e sua definição ao dicionário, associando a palavra à sua definição correspondente.
    }

    public void removeWord(String word){
        //TODO Remove uma palavra do dicionário, dado o termo a ser removido.
    }

    public void displayWords(){
        //TODO Exibe todas as palavras e suas definições do dicionário, mostrando cada palavra seguida de sua respectiva definição.
    }

    public String searchByWord(String word){
        //TODO Pesquisa uma palavra no dicionário e retorna sua definição correspondente.
        return "";
    }
}
