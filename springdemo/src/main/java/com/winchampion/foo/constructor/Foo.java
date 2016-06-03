package com.winchampion.foo.constructor;

/**
 * Created by super on 2016/6/3.
 */
public class Foo {

    private String name;
    private int year;

    public Foo(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Foo{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
