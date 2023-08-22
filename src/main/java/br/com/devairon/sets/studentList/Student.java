package br.com.devairon.sets.studentList;

public class Student {

    private Long cod;
    private String name;
    private double note;

    public Student(Long cod, String name, double note) {
        this.cod = cod;
        this.name = name;
        this.note = note;
    }

    public Long getCod() {
        return cod;
    }

    public String getName() {
        return name;
    }

    public double getNote() {
        return note;
    }

    @Override
    public String toString() {
        return "Student{" +
                "cod=" + cod +
                ", name='" + name + '\'' +
                ", note=" + note +
                '}';
    }
}
