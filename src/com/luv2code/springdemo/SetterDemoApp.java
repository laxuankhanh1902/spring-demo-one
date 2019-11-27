package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Locale;

public class SetterDemoApp {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "EN"));
        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean form spring container
        MyCoach theCoach = context.getBean("myCoach2", MyCoach.class);

        // call methods on the bean
        // ... let's come back to this ...
        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theCoach.getDailyFortune());

        // call our new methods to get the literal values
//        System.out.println(theCoach.getEmailAddress());
//        System.out.println(theCoach.getTeam());

        // close the context
        context.close();
    }
}
