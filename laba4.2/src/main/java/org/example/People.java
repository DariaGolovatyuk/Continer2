package org.example;

/**
 * Структура данных "Человек" для хранения информации о его имени,зарплате,поле,дате рождения,отделе.
 */
public class People {
    private int id;
    private String name;
    private int salary;
    private String gender;
    private String bd;
    private Division division;

    /**
     * Метод помещает значение id в соответсвующее поле класса
     * @param id
     */
    public void setId(int id)
    {
        this.id=id;
    }

    /**
     * Метод помещает имя в соответсвующее поле класса
     * @param name имя человека
     */
    public void setName(String name) {this.name=name;}

    /**
     * Метод помещает зарплату в соответсвующее поле класса
     * @param salary зарплата человека
     */
    public void setSalary(int salary)
    {
        this.salary=salary;
    }

    /**
     * Метод помещает пол человека в соответсвующее поле класса
     * @param gender пол человека
     */
    public void setGender   (String gender)
    {
        this.gender=gender;
    }

    /**
     * Метод пмещает дату рождения в соответсвующее поле класса
     * @param bd дата рождения человека
     */
    public void setBd(String bd)
    {
        this.bd=bd;
    }

    /**
     * Метод помещает наименование подразделения в соответсвующее поле класса
     * @param division наименование подразделения человека
     */
    public void setDivision(String division)
    {
        this.division=new Division();
        this.division.setName(division);
    }

    /**
     * Метод возвращает значение id
     * @return поле id
     */
    public int getId()
    {
        return id;
    }

    /**
     * Метод возвращает имя соответстующего человека
     * @return имя человка
     */
    public String getName() {return name;}

    /**
     * Метод возвращает зарплату соответствующего человека
     * @return зарплата человека
     */
    public int getSalary()
    {
        return salary;
    }

    /**
     * Метод возвращает пол соответствующего человека
     * @return пол человека
     */
    public String getGender()
    {
        return gender;
    }

    /**
     * Метод возвращает дату рождения соответствующего человека
     * @return дата рождения соответствующего человека
     */
    public String getBd()
    {
        return bd;
    }

    /**
     * Метод возвращает наименование соответствующего подразделения
     * @return наименование соответствующего подразделения
     */
    public String getDivision()
    {
        return division.getDivision();
    }

}
