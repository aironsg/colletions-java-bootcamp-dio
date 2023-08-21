package br.com.devairon.lists.sumOfNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SumOfNumbers {
    List<Integer> numbers;

    public SumOfNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    void addNumber(int number){
        this.numbers.add(number);
    }

    int calcSum(){
        int sumTotalNumbers = 0;
        for (Integer number: numbers) {
            sumTotalNumbers += number;
        }

        return sumTotalNumbers;
    }

    Integer findHigherNumber(){
        int higherNumber = 0;
        for (Integer number: numbers) {
            if(number > higherNumber) higherNumber = number;
        }
        return higherNumber;
    }

    Integer findSmallestNumber(){
       Integer smallestNumber = this.findHigherNumber();
        for (Integer number: numbers) {
            if(number < smallestNumber) smallestNumber = number;
        }
        return smallestNumber;
    }

    List<String> displayNumbers(){
        List<String> displayTotalNumbers = new ArrayList<>();
        for (Integer number: numbers) {
            displayTotalNumbers.add("Valor = " + number);
        }

        return displayTotalNumbers;
    }


}
