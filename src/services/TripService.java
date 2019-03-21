package services;

import objects.Trip;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TripService {
    public Trip getTrip(){
        Trip trip = new Trip();
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("bananas","50000000");
        trip.setFood(map);
        trip.setCodeName("Gallahad");
        trip.setDestination("Mercury");
        trip.setStartingPoint("Sun");
        return trip;
    }

}
