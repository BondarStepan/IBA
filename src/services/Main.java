package services;

import objects.Spacecraft;
import objects.Trip;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner user_input = new Scanner( System.in );
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        List<Trip> trips = new ArrayList<Trip>();
        List<String> beans = Arrays.asList("Trip1", "Trip2","Trip3");
TripService tripService=new TripService();
System.out.println("Trips available:");
for(int i=0;i<4;i++){
    trips.add(tripService.getTrip());
    System.out.println(trips.get(i));
}
System.out.println("Now you can choose your trip.");
int key=Integer.parseInt(user_input.next());
EmulationService UNION = new EmulationService();

UNION.start(trips.get(key));



    }
}