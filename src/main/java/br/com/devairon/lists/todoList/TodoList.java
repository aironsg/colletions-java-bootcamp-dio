package br.com.devairon.lists.todoList;

import java.util.ArrayList;
import java.util.List;

public class TodoList {

    private List<Todo> todos;

    public TodoList(List<Todo> todos) {
        this.todos = todos;
    }

    void addTodo(String description){
       this.todos.add(new Todo(description));

    }

    void removeTodo(String description){
        List<Todo> removeTodo = new ArrayList<>();
        for (Todo todo: todos) {
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
        for (Todo description: this.todos
             ) {
            descritions.add(description.getDescription());
        }
        return descritions;
    }
}
