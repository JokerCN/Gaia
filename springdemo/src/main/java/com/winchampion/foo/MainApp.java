package com.winchampion.foo;

import com.winchampion.App;
import com.winchampion.foo.annotation.Student;
import com.winchampion.foo.event.CustomEvent;
import com.winchampion.foo.event.CustomEventPublisher;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by super on 2016/6/3.
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
        Student student = (Student) context.getBean("student");
        student.getName();
        student.getAge();
        student.toString();
        student.printThrowException();
        System.out.println(student);
    }
}
