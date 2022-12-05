package org.example;

/**
 * Структура данных "Подразделение" для хранения информации о наименовании и ID подразделения
 */
public class Division {
    private int id;
    private String name;

    /**
     * Метод генерации id Подразделения
     * @return сгенерированное значение
     */
    private int generateId()
    {
        int code = name.charAt(0);
        return code;
    }

    /**
     * Метод помещает наименование подразделения в соответсвующее поле класса
     * @param name наименование подразделения
     */
    public void setName(String name)
    {
        this.name=name;
        this.id=generateId();
    }

    /**
     * Метод возвращает наименование соответствующего подразделения
     * @return наименование соответствующего подразделения
     */
    private String getName()
    {
        return this.name;
    }

    /**
     * Метод возвращает id соответствующего подразделения
     * @return id соответствующего подразделения
     */
    private int getId()
    {
        return this.id;
    }

    /**
     * Метод возвращает наименование и id соответствующего подразделения
     * @return наименование и id соответствующего подразделения
     */
    public String getDivision()
    {
        return getName()+" "+getId();
    }

}
