package br.com.devairon.lists.sortPeoples;

import java.util.Comparator;

public class People implements Comparable<People> {
    private String name;
    private double height;
    private int age;

    public People(String name, double height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(People people) {
        return Integer.compare(age, people.getAge());
    }


}

class ComparatorByHeight implements Comparator<People>{

    @Override
    public int compare(People people1, People people2) {
        return Double.compare(people1.getHeight(), people2.getHeight());
    }
}
