package br.com.devairon.lists.sortPeoples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortPeople  {

    private List<People> peopleList;


    public SortPeople(List<People> peopleList) {
        this.peopleList = peopleList;
    }

    public void addPeople(String name, double height, int age){
        this.peopleList.add(new People(name, height,age));
    }

    public List<People> sortByHeight(){

        List<People> listPeopleByHeight =new ArrayList<>(peopleList);
        Collections.sort(listPeopleByHeight, new ComparatorByHeight());
        return listPeopleByHeight;
    }

    public List<People> sortByAge(){
        List<People> listPeoplesByAge = new ArrayList<>(peopleList);
        Collections.sort(listPeoplesByAge);
        return listPeoplesByAge;
    }


}
