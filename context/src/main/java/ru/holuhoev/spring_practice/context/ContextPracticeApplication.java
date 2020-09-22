package ru.holuhoev.spring_practice.context;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class ContextPracticeApplication {

    public static void main(final String[] args) {
//        SpringApplication.run(ContextPracticeApplication.class, args);
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
    }
}
