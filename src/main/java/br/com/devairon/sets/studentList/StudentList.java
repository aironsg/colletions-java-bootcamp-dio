package br.com.devairon.sets.studentList;

import java.util.HashSet;
import java.util.Set;

public class StudentList {
    Set<Student> students = new HashSet<>();

    public StudentList(Set<Student> students) {
        this.students = students;
    }

    public void addStudent(String name, Long registration, double note){
        //TODO Adiciona um aluno ao conjunto.
    }

    public void removeStudent(Long registration){
        //TODO Remove um aluno ao conjunto a partir da matricula, se estiver presente.
    }

    public void displayStudentByName(){
        //TODO Exibe todos os alunos do conjunto em ordem alfabética pelo nome.
    }

    public void displayStudentByNote(){
        //TODO Exibe todos os alunos do conjunto em ordem crescente de nota.
    }

    public void displayStudents(){
        //TODO Exibe todos os alunos do conjunto.
    }
}
