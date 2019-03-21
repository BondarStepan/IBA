package services;

import objects.Trip;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        List<String> beans = Arrays.asList("Trip1", "Trip2","Trip3");



        for (String i:beans){ ;
            System.out.println((Trip) context.getBean(i));
        };
        System.out.println("Commiting countdown.");

    }
}