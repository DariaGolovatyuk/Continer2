package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        ReaderPeople p = new ReaderPeople();
        p.read("foreign_names.csv");
        List<People> list = new ArrayList<>(p.getPeoples());
        for (People i: list) {
            System.out.println(i.getId() + " " + i.getName()+ " " + i.getGender()+ " " + i.getBd()+ " " + i.getDivision()+ " " + i.getSalary());

        }




    }
}