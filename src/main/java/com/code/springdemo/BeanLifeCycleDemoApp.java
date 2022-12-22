package com.code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {
    public static void main(String[] args) {
        //load spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
        //retrieve beans
        Coach theCoach = context.getBean("myCoach", Coach.class);
        //do methods
        System.out.println(theCoach.getDailyWorkout());
        //close context
        context.close();
    }
}
