package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Класс реализующий считывание и помещение информации о людях в список людей
 */
public class ReaderPeople {
    private  String csvFile;
    List<People> peoples;

    /**
     * Конструктор класса
     */
    ReaderPeople()
    {
        this.peoples=new ArrayList<>();
    }

    /**
     * Метод возвращает список полученных людей
     * @return список людей
     */
    public List<People> getPeoples()
    {
        return this.peoples;
    }

    /**
     * Метод реализующий заполнение объекта "Человек" из строки
     * @param str строка с информацией о человеке
     * @return Объект "Человек"
     */
    public static People createPeople(String[] str)
    {
       People people = new People();
       people.setId(Integer.parseInt(str[0]));
       people.setName(str[1]);
        people.setGender(str[2]);
        people.setBd(str[3]);
        people.setDivision(str[4]);
        people.setSalary(Integer.parseInt(str[5]));
       return people;
    }

    /**
     *  Метод реализующий считывание информации о людях из csv файла и создания списка соответствующих людей
     */
    public void read(String path)
    {
        csvFile=path;
        BufferedReader csvReader=null;
        String line="";
        String separator=";";
        try {
          csvReader = new BufferedReader(new FileReader(csvFile));
          csvReader.readLine();
            while((line=csvReader.readLine())!=null) {
                String[] people = line.split(separator);
                peoples.add(createPeople(people));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
