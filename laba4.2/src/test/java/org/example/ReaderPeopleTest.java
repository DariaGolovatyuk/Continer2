package org.example;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReaderPeopleTest {
        People testPeople1;
        People testPeople2;
        private static final String csvFile="foreign_names2.csv";

        @BeforeEach
        void setUp() {
                  testPeople1 = new People();
                  testPeople1.setId(28281);
                  testPeople1.setName("Aahan");
                  testPeople1.setGender("Male");
                  testPeople1.setBd("15.05.1970");
                  testPeople1.setDivision("I");
                  testPeople1.setSalary(4800);
                  testPeople2 = new People();
                  testPeople2.setId(28284);
                  testPeople2.setName("Aaleyah");
                  testPeople2.setGender("Female");
                  testPeople2.setBd("04.02.1944");
                  testPeople2.setDivision("G");
                  testPeople2.setSalary(1000);

        }

        @Test
        void createPeopleTest() {
            People people1 = new People();
            BufferedReader csvReader = null;
            String line = "";
            String[] people;
            try {
                csvReader = new BufferedReader(new FileReader(csvFile));
                csvReader.readLine();
                line = csvReader.readLine();
                people = line.split(";");

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            assertEquals(testPeople1.getName(), ReaderPeople.createPeople(people).getName());
        }
        
@Test
    void ListPeopleTest()
{
    List<People> list=new ArrayList<>();
    list.add(testPeople1);
    list.add(testPeople2);

    ReaderPeople reader = new ReaderPeople();
    reader.read(csvFile);
    List<People> listTest=new ArrayList<>(reader.getPeoples());
    assertEquals(list.get(1).getId(),listTest.get(1).getId());
    assertEquals(list.get(1).getName(),listTest.get(1).getName());
    assertEquals(list.get(1).getSalary(),listTest.get(1).getSalary());
    assertEquals(list.get(1).getBd(),listTest.get(1).getBd());
    assertEquals(list.get(1).getDivision(),listTest.get(1).getDivision());
    assertEquals(list.get(1).getGender(),listTest.get(1).getGender());
}

}