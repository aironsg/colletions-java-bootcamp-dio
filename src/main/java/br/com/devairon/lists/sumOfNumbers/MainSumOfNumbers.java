package br.com.devairon.lists.sumOfNumbers;

import java.util.ArrayList;
import java.util.List;

public class MainSumOfNumbers {
    public static void main(String[] args) {
        List<Integer> listNumbersInteger = new ArrayList<>();
        SumOfNumbers numbers = new SumOfNumbers(listNumbersInteger);
        numbers.addNumber(8);
        numbers.addNumber(15);
        numbers.addNumber(3);
        numbers.addNumber(5);
        numbers.addNumber(4);
        numbers.addNumber(1);
        numbers.addNumber(38);



        int valueTotalNumbers = numbers.calcSum();
        System.out.println("Total = " + valueTotalNumbers);

        int higherNumber = numbers.findHigherNumber();
        System.out.println("O maior numero da lista é " + higherNumber);

        int smallestNumber = numbers.findSmallestNumber();
        System.out.println("O menor numero da lista é " + smallestNumber);

        System.out.println(numbers.displayNumbers());
    }
}
