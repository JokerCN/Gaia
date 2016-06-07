package com.winchampion.foo.annotation;

import org.springframework.beans.factory.annotation.Required;

/**
 * Created by super on 2016/6/3.
 */
public class Student {
    private String name;
    private Integer age;

    public String getName() {
        System.out.println("Name: "+name);
        return name;
    }

    @Required
    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        System.out.println("Age: "+age);
        return age;
    }

    @Required
    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void printThrowException(){
        System.out.println("Exception raised.");
        throw new IllegalArgumentException();
    }
}
