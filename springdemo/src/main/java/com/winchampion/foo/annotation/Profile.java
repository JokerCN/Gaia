package com.winchampion.foo.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by super on 2016/6/3.
 */
public class Profile {
    @Autowired
    @Qualifier("student2")
    private Student student;

    public Profile(){
        System.out.println("Inside Profile constructor.");
    }

    public void printAge(){
        System.out.println("Age: "+ student.getAge());
    }

    public void printName(){
        System.out.println("Name: "+student.getName());
    }
}
