package services;

import objects.Astronauts;
import objects.Spacecraft;
import objects.Trip;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

public class TripService {
    public Trip getTrip(){
        List<Astronauts> astronauts = new ArrayList<Astronauts>();
        List<Spacecraft> spacecrafts = new ArrayList<Spacecraft>();
        Random rand=new Random();
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        String[] allBeanNames = context.getBeanDefinitionNames();
        for(String beanName : allBeanNames) {
            if((context.getBean(beanName).getClass()==Astronauts.class))
            {
                astronauts.add((Astronauts) context.getBean(beanName));
            }
            if((context.getBean(beanName).getClass()==Spacecraft.class)){
                spacecrafts.add((Spacecraft) context.getBean(beanName));
            };
        }
        Trip trip = new Trip();
        List<Astronauts> crew= new ArrayList<Astronauts>();
        crew.add(astronauts.get(rand.nextInt(astronauts.size())));
        crew.add(astronauts.get(rand.nextInt(astronauts.size())));
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("bananas","50000000");
        trip.setFood(map);
        trip.setSpacecraft(spacecrafts.get(rand.nextInt(spacecrafts.size())));
        trip.setCrew(crew);
        trip.setCodeName("Gallahad");
        trip.setDestination("Mercury");
        trip.setStartingPoint("Sun");
        return trip;
    }
}
