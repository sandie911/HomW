package homework7;

import homework7.CustomException;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String surname;
    private String number;
    private int age;

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Person(String name, String surname, String number, int age) {
        this.name = name;
        this.surname = surname;
        this.number = number;
        this.age = age;
    }


    public String call() throws CustomException {
        if (name == "") {
            throw new CustomException("Field cannot be empty");
        }
        return "Зателефонувати громадянину " + name + " " + surname +   " можно за номером "  + number;
    }
    public static List<Person> PersonUnderThirty(List<Person> persons, int age)  {
        List<Person> list = new ArrayList<Person>();
        int n = persons.size();
        for (int i = 0; i < n; i++)
        {
            Person p = persons.get(i);
            if (p.age < age ){
                list.add(p);
            }

        }
        return list;
    }
}

