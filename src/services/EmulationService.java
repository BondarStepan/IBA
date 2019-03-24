package services;

import objects.Trip;

public class EmulationService extends Thread {
    public EmulationService() {
    }
    public void start(Trip trip) {
        System.out.println("Commiting countdown.");
        System.out.println("Starting in 10 seconds..");
        for(int i=1;i<11;i++) {
            try {
                Thread.sleep(1000);
                System.out.println(String.valueOf(i)+"...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Your trip started.");
        System.out.println("Here is some information.");
        System.out.println(trip);
    }
}
