package com.code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        //load the spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //get my beans
        Coach theCoach = context.getBean("myCoach", Coach.class);
        //call methods of the bean
        System.out.println(theCoach.getDailyWorkout());
        //close the context
        context.close();
    }
}
