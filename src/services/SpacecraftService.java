package services;

import objects.Spacecraft;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpacecraftService {
    public void SpacecraftServiceExec(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Spacecraft spacecraft = (Spacecraft) context.getBean("DeathStar");
        System.out.println(spacecraft);
    }
}
