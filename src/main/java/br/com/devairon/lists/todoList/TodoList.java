package br.com.devairon.lists.todoList;

import java.util.ArrayList;
import java.util.List;

public class TodoList {

    private List<Task> todos;

    public TodoList(List<Task> todos) {
        this.todos = todos;
    }

    void addTodo(String description){
       this.todos.add(new Task(description));

    }

    void removeTodo(String description){
        List<Task> removeTodo = new ArrayList<>();
        for (Task todo: todos) {
            if(todo.getDescription().equals(description)){
                removeTodo.add(todo);

            }
            todos.removeAll(removeTodo);
        }
    }

    int totalNumberTodo(){
        int totalNumbers = todos.size();
        return totalNumbers;
    }
    List<String> TodoDescriptions(){
        List<String> descritions = new ArrayList<String>();
        for (Task description: this.todos
             ) {
            descritions.add(description.getDescription());
        }
        return descritions;
    }
}
