package br.com.devairon.lists.todoList;

import java.util.ArrayList;

public class MainList {
    public static void main(String[] args) {
        //este é o corpo de entrada do exercicio de list

        TodoList todoList = new TodoList(new ArrayList<Task>());
        todoList.addTodo("realizar exercicio Java 1");
        todoList.addTodo("realizar exercicio Java 2");
        todoList.addTodo("realizar exercicio Java 3");
        todoList.addTodo("realizar exercicio Java 4");

        System.out.println(todoList.TodoDescriptions());

        System.out.println(todoList.totalNumberTodo());


        todoList.removeTodo("realizar exercicio Java 3");
        System.out.println("informações do pós remoção caso ouve");
        System.out.println(todoList.totalNumberTodo());
        System.out.println(todoList.TodoDescriptions());
    }
}
