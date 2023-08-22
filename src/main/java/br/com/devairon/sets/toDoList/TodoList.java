package br.com.devairon.sets.toDoList;

import java.util.HashSet;
import java.util.Set;

public class TodoList {

    Set<Task> tasks = new HashSet<>();

    public TodoList(Set<Task> tasks) {
        this.tasks = tasks;
    }

    public void addTask(Task task) {
        //TODO Adiciona uma nova tarefa ao Set.
    }

    public void removeTask(String description) {
        //TODO  Remove uma tarefa do Set de acordo com a descrição, se estiver presente.
    }

    public void displayTasks() {
        //TODO  Exibe todas as tarefas da lista de tarefas.
    }

    public int countTasks() {
        return tasks.size();
    }

    public Set<Task> getTasksCompleted(){
        //TODO Retorna um Set com as tarefas concluídas.
        return null;
    }

    public Set<Task> getPendingTasks(){
        //TODO Retorna um Set com as tarefas pendentes.
        return null;
    }

    public void markTaskCompleted(String description){
        //TODO Marca uma tarefa como concluída de acordo com a descrição.
    }

    public void markPendingTask(String description){
        //TODO Marca uma tarefa como pendente de acordo com a descrição.
    }

    public void clearTodoList(){
        //TODO Remove todas as tarefas da lista de tarefas.
    }





}
