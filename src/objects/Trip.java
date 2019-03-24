package objects;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class Trip {
    private Spacecraft spacecraft;
    private List<Astronauts> crew;
    private HashMap<String,String> food;
    private String codeName;
    private Date date;
    private String Destination;
    private String StartingPoint;

    @Override
    public String toString() {
        return "Trip: " +
                "\nspacecraft=" + spacecraft +
                "\ncrew=" + crew +
                "\nfood=" + food +
                "\ncodeName='" + codeName + '\'' +
                "\ndate=" + date +
                "\nDestination='" + Destination + '\'' +
                "\nStartingPoint='" + StartingPoint + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trip trip = (Trip) o;
        return Objects.equals(spacecraft, trip.spacecraft) &&
                Objects.equals(crew, trip.crew) &&
                Objects.equals(food, trip.food) &&
                Objects.equals(codeName, trip.codeName) &&
                Objects.equals(date, trip.date) &&
                Objects.equals(Destination, trip.Destination) &&
                Objects.equals(StartingPoint, trip.StartingPoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(spacecraft, crew, food, codeName, date, Destination, StartingPoint);
    }

    public Trip(Spacecraft spacecraft, List<Astronauts> crew, HashMap<String, String> food, String codeName, Date date, String destination, String startingPoint) {
        this.spacecraft = spacecraft;
        this.crew = crew;
        this.food = food;
        this.codeName = codeName;
        this.date = date;
        Destination = destination;
        StartingPoint = startingPoint;
    }

    public Trip() {
    }

    public Spacecraft getSpacecraft() {
        return spacecraft;
    }

    public void setSpacecraft(Spacecraft spacecraft) {
        this.spacecraft = spacecraft;
    }

    public List<Astronauts> getCrew() {
        return crew;
    }

    public void setCrew(List<Astronauts> crew) {
        this.crew = crew;
    }

    public HashMap<String, String> getFood() {
        return food;
    }

    public void setFood(HashMap<String, String> food) {
        this.food = food;
    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }

    public String getStartingPoint() {
        return StartingPoint;
    }

    public void setStartingPoint(String startingPoint) {
        StartingPoint = startingPoint;
    }

}
