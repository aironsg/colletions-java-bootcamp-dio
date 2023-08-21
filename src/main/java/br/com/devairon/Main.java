package br.com.devairon;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Criando exemplos práticos de lista sem generic
        List listaSemGenerics = new ArrayList();

        listaSemGenerics.add("primeiro dado para a lista");
        listaSemGenerics.add(123);
        listaSemGenerics.add(true);

        //iterando os dados da lista para mostrar no console
        for (Object element : listaSemGenerics) {
            System.out.println(element);
        }

        //criação de lista com utilização de generics

        List<String> listaComGenerics = new ArrayList<String>();
        listaComGenerics.add("Primeiro elemento com Generics");
        listaComGenerics.add("segundo elemento com Generics");
        listaComGenerics.add("terceiro elemento com Generics");

        for (String element : listaComGenerics) {
            System.out.println(element);
        }
    }
}