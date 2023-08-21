package br.com.devairon.lists.sortNumber;

import java.util.List;

public class SortNumber {
    private List<Integer> numberList;

    public SortNumber(List<Integer> numberList) {
        this.numberList = numberList;
    }

    void addNumber(int number){
        this.numberList.add(number);
    }

    void sortNumberAsc(){
        //TODO Ordena os números da lista em ordem ascendente usando a interface Comparable e a class Collections
    }

    void sorteNumbersDesc(){
        //TODO Ordena os números da lista em ordem descendente usando um Comparable e a class Collections.
    }
}
