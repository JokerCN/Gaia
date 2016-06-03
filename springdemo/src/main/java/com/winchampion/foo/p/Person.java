package com.winchampion.foo.p;

/**
 * Created by super on 2016/6/3.
 */
public class Person {
    private String name;
    private Person spouse;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", spouse=" + spouse.getName() +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getSpouse() {
        return spouse;
    }

    public void setSpouse(Person spouse) {
        this.spouse = spouse;
    }
}
